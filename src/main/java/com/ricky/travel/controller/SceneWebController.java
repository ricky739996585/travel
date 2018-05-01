package com.ricky.travel.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ricky.travel.domain.CateVO;
import com.ricky.travel.domain.ScenicPhoto;
import com.ricky.travel.domain.ScenicVO;
import com.ricky.travel.domain.TrafficVO;
import com.ricky.travel.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by ricky on 2018/4/5 0005
 */
@Controller
@RequestMapping("sceneWeb")
public class SceneWebController {
    @Autowired
    private SceneService sceneService;
    @Autowired
    private ScenePhotoService scenePhotoService;
    @Autowired
    private CateService cateService;
    @Autowired
    private TrafficService trafficService;


    @RequestMapping("detail")
    public ModelAndView detail(int sceneId){
        ModelAndView mav=new ModelAndView();
        JSONObject data=new JSONObject();
        //景点信息
        ScenicVO scenicVO=sceneService.getScenic(sceneId);
        data.put("scene",scenicVO);
        //景点照片列表
        List<ScenicPhoto> photoList = scenePhotoService.getPhotoes(sceneId);
        data.put("photoList",photoList);
        data.put("photoSize",photoList.size());
        //景点城市美食
        List<CateVO> cateList = cateService.getCateByCityId(scenicVO.getCityId());
        data.put("cateList",cateList);
        //获取交通列表
        List<TrafficVO> trafficList = trafficService.getTrafficBySceneId(scenicVO.getScenicId());
        data.put("trafficList",trafficList);
        mav.addObject("data",data);
        mav.setViewName("/web/sceneDetail");
        return mav;
    }

    @RequestMapping("getList")
    @ResponseBody
    public JSONObject getList(String search,int offset,int limit){
        JSONObject data=new JSONObject();
        //景点列表信息
        List<ScenicVO> sceneBySearch = sceneService.getSceneBySearch(search, offset, limit);
        JSONArray jsonArray=new JSONArray();
        JSONObject sceneEnity=new JSONObject();
        ScenicPhoto scenicPhoto=new ScenicPhoto();
        String desc="";
        for (ScenicVO scenicVO:sceneBySearch){
            scenicPhoto = scenePhotoService.getPhotoes(scenicVO.getScenicId()).get(0);
            sceneEnity.put("photoUrl",scenicPhoto.getScenicPhotoUrl());
            sceneEnity.put("scenicId",scenicVO.getScenicId());
            sceneEnity.put("scenicName",scenicVO.getScenicName());
            desc=scenicVO.getScenicDescription();
            if(desc.length()>80){
                sceneEnity.put("scenicDescription",desc.substring(0,80)+"...");
            }else {
                sceneEnity.put("scenicDescription",desc);
            }

            jsonArray.add(sceneEnity);
            sceneEnity=new JSONObject();
            scenicPhoto=new ScenicPhoto();

        }
        int total=sceneService.getCountBySearch(search);
        data.put("sceneList",jsonArray);
        data.put("total",total);
        return data;
    }

    /**
      * @author:ricky
      * 功能:景点首页页面
      * 时间:2018/4/30 0030 15:06
      */
    @RequestMapping("scene")
    public ModelAndView scene(){
        ModelAndView mav = new ModelAndView();
        JSONObject data=new JSONObject();
        //热门景点列表信息
        List<ScenicVO> hotSceneList = sceneService.getHotSceneList();
        JSONArray jsonArray=new JSONArray();
        JSONObject sceneEnity=new JSONObject();
        ScenicPhoto scenicPhoto=new ScenicPhoto();
        String desc="";
        for (ScenicVO scenicVO:hotSceneList){
            scenicPhoto = scenePhotoService.getPhotoes(scenicVO.getScenicId()).get(0);
            sceneEnity.put("photoUrl",scenicPhoto.getScenicPhotoUrl());
            sceneEnity.put("scenicId",scenicVO.getScenicId());
            sceneEnity.put("scenicName",scenicVO.getScenicName());
            desc=scenicVO.getScenicDescription();
            if(desc.length()>80){
                sceneEnity.put("scenicDescription",desc.substring(0,80)+"...");
            }else {
                sceneEnity.put("scenicDescription",desc);
            }

            jsonArray.add(sceneEnity);
            sceneEnity=new JSONObject();
            scenicPhoto=new ScenicPhoto();
            desc="";
        }

        //热门景点列表信息
        List<ScenicVO> newSceneList = sceneService.getNewSceneList();
        JSONArray newArray=new JSONArray();
        for (ScenicVO scenicVO:hotSceneList){
            scenicPhoto = scenePhotoService.getPhotoes(scenicVO.getScenicId()).get(0);
            sceneEnity.put("photoUrl",scenicPhoto.getScenicPhotoUrl());
            sceneEnity.put("scenicId",scenicVO.getScenicId());
            sceneEnity.put("scenicName",scenicVO.getScenicName());
            desc=scenicVO.getScenicDescription();
            if(desc.length()>80){
                sceneEnity.put("scenicDescription",desc.substring(0,80)+"...");
            }else {
                sceneEnity.put("scenicDescription",desc);
            }

            newArray.add(sceneEnity);
            sceneEnity=new JSONObject();
            scenicPhoto=new ScenicPhoto();
            desc="";
        }

        data.put("hotSceneList",jsonArray);
        data.put("newSceneList",newArray);
        mav.addObject("data",data);
        mav.setViewName("/web/scene");
        return mav;
    }

    @RequestMapping("list")
    public ModelAndView list(String search){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/web/sceneList");
        mav.addObject("search",search);
        return mav;
    }

    @RequestMapping("photo")
    public ModelAndView photo(){
        ModelAndView mav = new ModelAndView();
        JSONObject data=new JSONObject();
        List<ScenicPhoto> photoList = scenePhotoService.photoList();
        data.put("photoList",photoList);

        mav.setViewName("/web/photo");
        mav.addObject("data",data);
        return mav;
    }

}
