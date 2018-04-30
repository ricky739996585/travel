package com.ricky.travel.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ricky.travel.domain.ScenicPhoto;
import com.ricky.travel.domain.ScenicVO;
import com.ricky.travel.service.SceneLikeService;
import com.ricky.travel.service.ScenePhotoService;
import com.ricky.travel.service.SceneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by ricky on 2018/3/25 0025
 */
@Controller
@RequestMapping("home")
public class HomeWebController {
    @Autowired
    private SceneService sceneService;
    @Autowired
    private ScenePhotoService scenePhotoService;
    @Autowired
    private SceneLikeService sceneLikeService;

    @RequestMapping("index")
    public ModelAndView home(){
        ModelAndView mav=new ModelAndView();
        //获取4个景点，包含点赞数，浏览数，图片
        List<ScenicVO> sceneList=sceneService.getHomeScene();
        JSONArray data=new JSONArray();
        int sceneId=0;
        int like=0;
        System.out.println(sceneList.size());
        String content="";
        for (ScenicVO scenicVO:sceneList){
            JSONObject jsonObject=new JSONObject();
            sceneId=scenicVO.getScenicId();
            content=scenicVO.getScenicDescription();
            if(content.length()>90){
                scenicVO.setScenicDescription(content.substring(0,90)+"....");
            }
            like=sceneLikeService.getLikeCount(sceneId);
            ScenicPhoto scenicPhoto=scenePhotoService.getPhotoes(sceneId).get(0);
            jsonObject.put("scene",scenicVO);
            jsonObject.put("like",like);
            jsonObject.put("photo",scenicPhoto);
            System.out.println(jsonObject.toJSONString());
            data.add(jsonObject);

            content="";
        }
        mav.addObject("data",data);
        mav.setViewName("/web/home");
        return mav;
    }
}
