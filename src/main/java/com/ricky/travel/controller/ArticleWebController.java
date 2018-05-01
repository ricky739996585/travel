package com.ricky.travel.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.qcloud.cos.COSClient;
import com.ricky.travel.domain.ArticleVO;
import com.ricky.travel.domain.RsUser;
import com.ricky.travel.service.ArticleService;
import com.ricky.travel.service.RsUserService;
import com.ricky.travel.utils.commons.FormatTool;
import com.ricky.travel.utils.cos.CosClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
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
            articleEnity.put("like",articleVO.getArticleLike());
            articleEnity.put("author",user.getUserName());
            articleEnity.put("tag",articleVO.getArticleTag());
            articleEnity.put("time",FormatTool.formatDate(articleVO.getArticleDate()));
            jsonArray.add(articleEnity);

            articleEnity=new JSONObject();
            user=new RsUser();
            likeRecord=0;
        }
        int total=articleService.getCountBySearch(search);
        data.put("articleList",jsonArray);
        data.put("total",total);
        return data;
    }

    @RequestMapping("article")
    public ModelAndView article(){
        ModelAndView mav = new ModelAndView();
        JSONObject data=new JSONObject();
        //热门景点列表信息
        List<ArticleVO> hotSceneList = articleService.getHotArticleList();
        JSONArray jsonArray=new JSONArray();
        JSONObject articleEnity=new JSONObject();
        RsUser user=new RsUser();
        int likeRecord=0;
        for (ArticleVO articleVO:hotSceneList){
            user=userService.getRsUser(articleVO.getUserId());
            likeRecord=articleService.getLikeRecordByArticleId(articleVO.getArticleId());
            articleEnity.put("title",articleVO.getArticleName());
            articleEnity.put("like",articleVO.getArticleLike());
            articleEnity.put("author",user.getUserName());
            articleEnity.put("tag",articleVO.getArticleTag());
            articleEnity.put("time", FormatTool.formatDate(articleVO.getArticleDate()));
            jsonArray.add(articleEnity);

            articleEnity=new JSONObject();
            user=new RsUser();
            likeRecord=0;
        }
        data.put("articleList",jsonArray);

        //热门景点列表信息
        List<ArticleVO> newSceneList = articleService.getNewArticleList();
        JSONArray newArray=new JSONArray();
        for (ArticleVO articleVO:newSceneList){
            user=userService.getRsUser(articleVO.getUserId());
            likeRecord=articleService.getLikeRecordByArticleId(articleVO.getArticleId());
            articleEnity.put("title",articleVO.getArticleName());
            articleEnity.put("like",articleVO.getArticleLike());
            articleEnity.put("author",user.getUserName());
            articleEnity.put("tag",articleVO.getArticleTag());
            articleEnity.put("time",FormatTool.formatDate(articleVO.getArticleDate()));
            newArray.add(articleEnity);

            articleEnity=new JSONObject();
            user=new RsUser();
            likeRecord=0;
        }

        data.put("hotArticleList",jsonArray);
        data.put("newArticleList",newArray);
        mav.addObject("data",data);
        mav.setViewName("/web/article");
        return mav;
    }

    @RequestMapping("list")
    public ModelAndView list(String search){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/web/articleList");
        mav.addObject("search",search);
        return mav;
    }

    /**
      * @author:ricky
      * 功能:插入文章
      * 时间:2018/4/30 0030 17:21
      */
    @RequestMapping("/insert")
    @ResponseBody
    public JSONObject insert(String userId,String content,String tag,String title){
        JSONObject json=new JSONObject();
        if(StringUtils.isBlank(userId)){
            json.put("result",1);
            json.put("msg","请登录！");
            return json;
        }
        if(StringUtils.isBlank(content)){
            json.put("result",1);
            json.put("msg","请填写完整内容！");
            return json;
        }
        if(StringUtils.isBlank(tag)){
            json.put("result",1);
            json.put("msg","请填写完整内容！");
            return json;
        }
        if(StringUtils.isBlank(title)){
            json.put("result",1);
            json.put("msg","请填写完整内容！");
            return json;
        }
        RsUser user = userService.getRsUser(Integer.parseInt(userId));
        if(null==user){
            json.put("result",1);
            json.put("msg","用户不存在！");
            return json;
        }
        if(user.getUserLevel()!=1){
            json.put("result",1);
            json.put("msg","请先申请为专家！");
            return json;
        }
        ArticleVO articleVO=new ArticleVO();
        articleVO.setArticlePass(0);
        articleVO.setArticleContent(content);
        articleVO.setArticleDate(new Date());
        articleVO.setArticleName(title);
        articleVO.setArticleTag(tag);
        articleVO.setUserId(Integer.parseInt(userId));
        int record=articleService.insertArticle(articleVO);
        if(record<=0){
            json.put("result",1);
            json.put("msg","上传失败！");
            return json;
        }
        json.put("result",0);
        json.put("msg","上传成功,等待审批！");
        return json;
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
