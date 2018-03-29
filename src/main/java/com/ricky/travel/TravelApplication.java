package com.ricky.travel;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.ricky.travel.config.RedisConfig;
import com.ricky.travel.listener.SessionListener;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.servlet.DispatcherServlet;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.servlet.MultipartConfigElement;
import javax.sql.DataSource;

@SpringBootApplication
@ComponentScan
@MapperScan("com.ricky.travel.dao")
public class TravelApplication {

	@Autowired
	private MultipartConfigElement multipartConfigElement;//注入 “多部件配置元素”

	Logger logger = LoggerFactory.getLogger(RedisConfig.class);

	public static void main(String[] args) {
		SpringApplication.run(TravelApplication.class, args);
	}


	/**
	 * 修改DispatcherServlet默认配置
	 *
	 * @param dispatcherServlet
	 */
	@Bean
	public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
		ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
		registration.getUrlMappings().clear();
		//这里需要将附件配置设置进去，否则请求不过来 报异常：Required request part 'file' is not present
		registration.setMultipartConfig(multipartConfigElement);
		registration.addUrlMappings("*.do"); //只有*.do 的请求能通过
		registration.addUrlMappings("*.jpg");
		registration.addUrlMappings("*.png");
		registration.addUrlMappings("*.css");
		registration.addUrlMappings("*.js");
		registration.addUrlMappings("*.otf");
		registration.addUrlMappings("*.eot");
		registration.addUrlMappings("*.svg");
		registration.addUrlMappings("*.ttf");
		registration.addUrlMappings("*.woff");
		registration.addUrlMappings("*.woff2");
		return registration;
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		//return new org.apache.tomcat.jdbc.pool.DataSource();
		HikariConfig config = new HikariConfig("/hikari.properties");
		HikariDataSource dataSource = new HikariDataSource(config);
		return dataSource;
	}

	// 提供SqlSeesion
	@Bean
	public SqlSessionFactory sqlSessionFactoryBean() throws Exception {

		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());

		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

		sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));//

		return sqlSessionFactoryBean.getObject();
	}

	//设置监听器
	@Bean
	public ServletListenerRegistrationBean<SessionListener> sessionListenerServletListenerRegistrationBean(){
		ServletListenerRegistrationBean<SessionListener> registration = new ServletListenerRegistrationBean<SessionListener>(new SessionListener());
		return registration;
	}

	//事务管理
	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	//json数据封装
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {

		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();

		FastJsonConfig fastJsonConfig = new FastJsonConfig();

		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);

		fastConverter.setFastJsonConfig(fastJsonConfig);

		HttpMessageConverter<?> converter = fastConverter;

		return new HttpMessageConverters(converter);

	}

}
