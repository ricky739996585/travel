package com.ricky.travel.backgroundController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.utils.StringUtils;
import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.datatable.Order;
import com.ricky.travel.domain.ScenicPhoto;
import com.ricky.travel.domain.ScenicVO;
import com.ricky.travel.domain.TrafficVO;
import com.ricky.travel.service.ScenePhotoService;
import com.ricky.travel.service.SceneService;
import com.ricky.travel.utils.cos.CosClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("scene")
public class SceneController {
    @Autowired
    private SceneService sceneService;
    @Autowired
    private ScenePhotoService scenePhotoService;

    @RequestMapping("/doScene")
    public @ResponseBody
    DataTablesResponse<ScenicVO> pageSearch(@RequestBody DataTablesRequest request, String NameLike){
        Map<String,Object> map=request.getSearchColumns();

        List<Order> orders=request.getOrder();
        return sceneService.getAll(request);
    }

    @RequestMapping("/list")
    public String list(){
        return "/admin/html/scene/scene";
    }

    @RequestMapping("/add")
    public String add(){
        return "/admin/html/scene/addScene";
    }

    @RequestMapping("/one")
    public ModelAndView one(String scenicId){
        ModelAndView mav=new ModelAndView();
        if(StringUtils.isNullOrEmpty(scenicId)){
            mav.setViewName("/admin/error404");
        }else {
            Map<String,Object> map=sceneService.getScenicAndTraffic(Integer.parseInt(scenicId));
            List<ScenicPhoto> photos=scenePhotoService.getPhotoes(Integer.parseInt(scenicId));
            mav.addObject("scene",map);
            mav.addObject("photos",photos);
            mav.addObject("size",photos.size());
            mav.setViewName("/admin/html/scene/updateScene");
        }
        return mav;
    }

    @RequestMapping("/insert")
    @ResponseBody
//    HttpServletRequest request, @ModelAttribute("scenicVO") ScenicVO scenicVO, TrafficVO trafficVO, MultipartFile[] file
    public JSONObject insert(ScenicVO scenicVO, TrafficVO trafficVO){
        JSONObject json=new JSONObject();
        int id=0;
        try{
            id=sceneService.insert(scenicVO,trafficVO);
            json.put("result",1);
            json.put("scenicId",id);
        }catch (Exception  e){
            json.put("result",0);
            e.printStackTrace();
        }

        return json;
    }

    @RequestMapping("/update")
    @ResponseBody
//    HttpServletRequest request, @ModelAttribute("scenicVO") ScenicVO scenicVO, TrafficVO trafficVO, MultipartFile[] file
    public JSONObject update(ScenicVO scenicVO, TrafficVO trafficVO){
        JSONObject json=new JSONObject();
        try{
            sceneService.update(scenicVO,trafficVO);
            json.put("result",1);
            json.put("scenicId",scenicVO.getScenicId());
        }catch (Exception  e){
            json.put("result",0);
            e.printStackTrace();
        }

        return json;
    }

    @RequestMapping("/insertPic")
    @ResponseBody
    public JSONObject insertPic(HttpServletRequest request,MultipartFile[] file,String scenicId){
        JSONObject json=new JSONObject();
        String preUrl="http://pic-1253210486.cosgz.myqcloud.com/scene/";
        List<ScenicPhoto> photos=new ArrayList<ScenicPhoto>();
        if(file.length>0){
            for (MultipartFile f:file){
                String fileName=UUID.randomUUID().toString()+f.getOriginalFilename();
                String url=preUrl+fileName;
                ScenicPhoto photo=new ScenicPhoto();
                //进行cos对象上传操作
                CosClient cos=new CosClient();
                COSClient cosClient=cos.createCilent();
                try {
                    cos.upload(fileName,f.getSize(),f.getInputStream(),cosClient);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                photo.setScenicPhotoUrl(url);
                photo.setScenicId(Integer.parseInt(scenicId));
                photos.add(photo);
            }
        }
        try {
            scenePhotoService.insert(photos);
            json.put("result",1);
            json.put("url","/scene/list.do");
        } catch (Exception e) {
            json.put("result",0);
            e.printStackTrace();
        }

        return json;
    }

    @RequestMapping("/deletePic")
    @ResponseBody
    public JSONObject deletePic(HttpServletRequest request,@RequestParam("url") String url,@RequestParam("scenicPhotoId") String scenicPhotoId){
        JSONObject json=new JSONObject();
        String preUrl="http://pic-1253210486.cosgz.myqcloud.com/";
        String[] picUrl=url.split(preUrl);
        String key=picUrl[1];
        //通过COS删除图片
        CosClient cos=new CosClient();
        COSClient cosClient=cos.createCilent();
        try {
            cos.deleteFile(cosClient,key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            scenePhotoService.delete(Integer.parseInt(scenicPhotoId));
            json.put("result",1);
            json.put("url","/scene/list.do");
        } catch (Exception e) {
            json.put("result",0);
            e.printStackTrace();
        }

        return json;
    }

    @RequestMapping("/delete")
    @ResponseBody
//    HttpServletRequest request, @ModelAttribute("scenicVO") ScenicVO scenicVO, TrafficVO trafficVO, MultipartFile[] file
    public JSONObject delete(@RequestParam("scenicId") String scenicId ){
        JSONObject json=new JSONObject();
        List<ScenicPhoto> photos=scenePhotoService.getPhotoes(Integer.parseInt(scenicId));
        //删除图片
        for(ScenicPhoto photo:photos){
            String preUrl="http://pic-1253210486.cosgz.myqcloud.com/";
            String[] picUrl=photo.getScenicPhotoUrl().split(preUrl);
            String key=picUrl[1];
            //通过COS删除图片
            CosClient cos=new CosClient();
            COSClient cosClient=cos.createCilent();
            try {
                cos.deleteFile(cosClient,key);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try{
            sceneService.delete(Integer.parseInt(scenicId));
            json.put("result",1);
        }catch (Exception  e){
            json.put("result",0);
            e.printStackTrace();
        }

        return json;
    }



}
