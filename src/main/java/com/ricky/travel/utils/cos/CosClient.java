package com.ricky.travel.utils.cos;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.exception.CosClientException;
import com.qcloud.cos.exception.CosServiceException;
import com.qcloud.cos.model.ObjectMetadata;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.model.StorageClass;
import com.qcloud.cos.region.Region;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public class CosClient {
    private Logger log =  LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {

        // bucket的命名规则为{name}-{appid} ，此处填写的存储桶名称必须为此格式
        String bucketName = "pic-1253210486";
        // 关闭客户端(关闭后台线程)
        //cosClient.shutdown();


    }

    /**
     * 创建客户端
     * @return
     */
    public COSClient createCilent(){
        // 1 初始化用户身份信息(secretId, secretKey)
        COSCredentials cred = new BasicCOSCredentials("AKID3zlLjwQub7Seqst4zZXHrHXcVCh2tAwZ", "d6MSN7f1A8wZ2JPJ1pKya1CD4mIfqpdF");
        // 2 设置bucket的区域, COS地域的简称请参照 https://cloud.tencent.com/document/product/436/6224
        ClientConfig clientConfig = new ClientConfig(new Region("ap-guangzhou"));
        // 3 生成cos客户端
        COSClient cosClient = new COSClient(cred, clientConfig);
        return  cosClient;
    }

    /**
     * 上传文件
     * @return
     */
    public void upload(String fileName,long fileSize,InputStream inputStream, COSClient cosClient){
        // 简单文件上传, 最大支持 5 GB, 适用于小文件上传, 建议 20 M 以下的文件使用该接口
        // 大文件上传请参照 API 文档高级 API 上传
        // 指定要上传到 COS 上的路径
        try {
            String key = "/scene/"+fileName;
            // 设置自定义属性(如 content-type, content-disposition 等)
            ObjectMetadata objectMetadata = new ObjectMetadata();
            // 设置 Content type, 默认是 application/octet-stream
            objectMetadata.setContentType("image/jpeg");
            objectMetadata.setContentEncoding("utf-8");
            objectMetadata.setContentLength(fileSize);
            PutObjectResult putObjectResult = cosClient.putObject("pic-1253210486", key, inputStream,objectMetadata);
        } catch (CosServiceException cse) {
            // 自定义异常处理比如打印异常等
            log.error("上传cos对象失败！", cse);
        } catch (CosClientException cle) {
            // 自定义异常处理比如打印异常等
            log.error("上传cos对象失败！", cle);
        }

    }

    /**
         * 上传文章图片
         * @return
         */
    public void uploadArticlePic(String fileName,long fileSize,InputStream inputStream, COSClient cosClient){
        // 简单文件上传, 最大支持 5 GB, 适用于小文件上传, 建议 20 M 以下的文件使用该接口
        // 大文件上传请参照 API 文档高级 API 上传
        // 指定要上传到 COS 上的路径
        try {
            String key = "/article/"+fileName;
            // 设置自定义属性(如 content-type, content-disposition 等)
            ObjectMetadata objectMetadata = new ObjectMetadata();
            // 设置 Content type, 默认是 application/octet-stream
            objectMetadata.setContentType("image/jpeg");
            objectMetadata.setContentEncoding("utf-8");
            objectMetadata.setContentLength(fileSize);
            PutObjectResult putObjectResult = cosClient.putObject("pic-1253210486", key, inputStream,objectMetadata);
        } catch (CosServiceException cse) {
            // 自定义异常处理比如打印异常等
            log.error("上传cos对象失败！", cse);
        } catch (CosClientException cle) {
            // 自定义异常处理比如打印异常等
            log.error("上传cos对象失败！", cle);
        }

    }

    /**
     * 上传文章图片
     * @return
     */
    public void uploadDataPic(String fileName,long fileSize,InputStream inputStream, COSClient cosClient){
        // 简单文件上传, 最大支持 5 GB, 适用于小文件上传, 建议 20 M 以下的文件使用该接口
        // 大文件上传请参照 API 文档高级 API 上传
        // 指定要上传到 COS 上的路径
        try {
            String key = "/applyData/"+fileName;
            // 设置自定义属性(如 content-type, content-disposition 等)
            ObjectMetadata objectMetadata = new ObjectMetadata();
            // 设置 Content type, 默认是 application/octet-stream
            objectMetadata.setContentType("image/jpeg");
            objectMetadata.setContentEncoding("utf-8");
            objectMetadata.setContentLength(fileSize);
            PutObjectResult putObjectResult = cosClient.putObject("pic-1253210486", key, inputStream,objectMetadata);
        } catch (CosServiceException cse) {
            // 自定义异常处理比如打印异常等
            log.error("上传cos对象失败！", cse);
        } catch (CosClientException cle) {
            // 自定义异常处理比如打印异常等
            log.error("上传cos对象失败！", cle);
        }

    }

    /**
     * 删除文件
     * @return
     */
    public void deleteFile(COSClient cosClient,String key){
        // 指定要删除的 bucket 和路径
        try {
            cosClient.deleteObject("pic-1253210486", key);
        } catch (CosServiceException cse) {
            // 自定义异常处理比如打印异常等
            log.error("删除cos对象失败！", cse);
        } catch (CosClientException cle) {
            // 自定义异常处理比如打印异常等
            log.error("删除cos对象失败！", cle);
        }
    }
}
