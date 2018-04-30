package com.ricky.travel.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.qcloud.cos.COSClient;
import com.ricky.travel.domain.ArticleVO;
import com.ricky.travel.domain.RsUser;
import com.ricky.travel.service.ArticleService;
import com.ricky.travel.service.RsUserService;
import com.ricky.travel.utils.cos.CosClient;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("articleWeb")
public class ArticleWebController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private RsUserService userService;

    @RequestMapping("/getList")
    @ResponseBody
    public JSONObject getList(String search,int offset,int limit){
        JSONObject data=new JSONObject();
        //文章列表信息
        List<ArticleVO> articleBySearch = articleService.getArticleBySearch(search, offset, limit);
        JSONArray jsonArray=new JSONArray();
        JSONObject articleEnity=new JSONObject();
        RsUser user=new RsUser();
        int likeRecord=0;
        for (ArticleVO articleVO:articleBySearch){
            user=userService.getRsUser(articleVO.getUserId());
            likeRecord=articleService.getLikeRecordByArticleId(articleVO.getArticleId());
            articleEnity.put("title",articleVO.getArticleName());
            articleEnity.put("like",likeRecord);
            articleEnity.put("author",user.getUserName());
            articleEnity.put("tag",articleVO.getArticleTag());
            articleEnity.put("time",articleVO.getArticleDate());
            jsonArray.add(articleEnity);

            user=new RsUser();
            likeRecord=0;
        }
        int total=articleService.getCountBySearch(search);
        data.put("articleList",jsonArray);
        data.put("total",total);
        return data;
    }

    @RequestMapping("list")
    public String list(){
        return "/web/article";
    }


    @RequestMapping("/insert")
    @ResponseBody
    public ModelAndView insert(HttpServletRequest request, String txt,String content) throws UnsupportedEncodingException {
        ModelAndView mav=new ModelAndView();
        JSONObject json=new JSONObject();
        json.put("text",content);
        mav.addObject("data",json);
        mav.setViewName("/admin/ss");
        return mav;
    }

    /**
      * @author:ricky
      * 功能：插入文章图片
      * 时间:2018/3/24 0024 14:35
      */
    @RequestMapping("/insertArticlePic")
    @ResponseBody
    public JSONObject insertPic(HttpServletRequest request, MultipartFile pic) throws UnsupportedEncodingException {
        JSONObject json=new JSONObject();
        if(pic!=null){
            String preUrl="http://pic-1253210486.cosgz.myqcloud.com/article/";
            String picName=pic.getOriginalFilename();
            String suffix=picName.substring(picName.lastIndexOf(".")+1);
            String fileName= UUID.randomUUID().toString()+"."+suffix;
            String url=preUrl+fileName;
            //进行cos对象上传操作
            CosClient cos=new CosClient();
            COSClient cosClient=cos.createCilent();
            try {
                cos.uploadArticlePic(fileName,pic.getSize(),pic.getInputStream(),cosClient);
                JSONArray data=new JSONArray();
                data.add(url);
                json.put("error",0);
                json.put("data",data);
            } catch (IOException e) {
                json.put("error",1);
                e.printStackTrace();
            }
        }else {
            json.put("error",1);
        }
        return json;
    }


}
