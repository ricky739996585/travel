package com.ricky.travel.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("拦截器MyInterceptor------->3、请求结束之后被调用，主要用于清理工作。");

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView mav)
			throws Exception {
		System.out.println("拦截器MyInterceptor------->2、请求之后调用，在视图渲染之前，也就是Controller方法调用之后");

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		System.out.println("拦截器MyInterceptor------->1、请求之前调用，也就是Controller方法调用之前。");
//		String url = request.getRequestURI();
//		//URL:login.jsp是公开的;这个demo是除了login.jsp是可以公开访问的，其它的URL都进行拦截控制
//		if(url.indexOf("login.do")>=0){
//			return true;
//		}
//		//获取Session
//		HttpSession session = request.getSession();
//		String username = (String)session.getAttribute("username");
//
//		if(username != null){
//			return true;
//		}
//		//不符合条件的，跳转到登录界面
//		request.getRequestDispatcher("/admin/login.html").forward(request, response);
		return false;
	}

}
