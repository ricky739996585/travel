package com.ricky.travel.backgroundController;

import com.alibaba.fastjson.JSONObject;
import com.qcloud.cos.utils.StringUtils;
import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.datatable.Order;
import com.ricky.travel.domain.ArticleVO;
import com.ricky.travel.service.ArticleService;
import com.ricky.travel.utils.commons.FormatTool;
import com.ricky.travel.utils.commons.JedisClusterUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/doArticle")
    public @ResponseBody
    DataTablesResponse<Map<String,Object>> pageSearch(@RequestBody DataTablesRequest request){
        return articleService.getAll(request);
    }

    @RequestMapping("/list")
    public String list(){
        return "/admin/html/approve/articleApprove";
    }


    @RequestMapping("/one")
    public ModelAndView one(String articleId){
        ModelAndView mav=new ModelAndView();
        if(StringUtils.isNullOrEmpty(articleId)){
            mav.setViewName("/admin/error404");
        }else {
            Map<String,Object> map=articleService.getArticleByArticleId(Integer.parseInt(articleId)).get(0);
            String time= FormatTool.formatDate((Date) map.get("articleDate"));
            map.replace("articleDate",time);
            mav.addObject("articleData",map);
            mav.setViewName("/admin/html/approve/updateArticle");
        }
        return mav;
    }

    @RequestMapping("/pass")
    @ResponseBody
    public JSONObject pass(String articleId){
        JSONObject json=new JSONObject();
        try{
            ArticleVO articleVO=new ArticleVO();
            articleVO.setArticleId(Integer.parseInt(articleId));
            articleService.passArticle(articleVO);
            json.put("result",1);
            json.put("url","/article/list.do");
        }catch (Exception  e){
            json.put("result",0);
            e.printStackTrace();
        }

        return json;
    }

    @RequestMapping("/notPass")
    @ResponseBody
    public JSONObject notPass(String articleId){
        JSONObject json=new JSONObject();
        try{
            ArticleVO articleVO=new ArticleVO();
            articleVO.setArticleId(Integer.parseInt(articleId));
            articleService.notPassArticle(articleVO);
            json.put("result",1);
            json.put("url","/expert/list.do");
        }catch (Exception  e){
            json.put("result",0);
            e.printStackTrace();
        }

        return json;
    }

    @RequestMapping("/ss")
    @ResponseBody
    public JSONObject ss(){
        JSONObject json=new JSONObject();
        try{
            JedisClusterUtils utils=new JedisClusterUtils();
            utils.set("name","haha");
            json.put("result",1);
            json.put("url","/expert/list.do");
        }catch (Exception  e){
            json.put("result",0);
            e.printStackTrace();
        }

        return json;
    }

    @RequestMapping("/gg")
    @ResponseBody
    public JSONObject gg(){
        JSONObject json=new JSONObject();
        try{
            JedisClusterUtils utils=new JedisClusterUtils();
            json.put("result",utils.get("name"));
            json.put("url","/expert/list.do");
        }catch (Exception  e){
            json.put("result",0);
            e.printStackTrace();
        }

        return json;
    }


}
