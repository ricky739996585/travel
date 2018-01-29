package com.ricky.travel.backgroundController;

import com.alibaba.fastjson.JSONObject;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.utils.StringUtils;
import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.datatable.Order;
import com.ricky.travel.domain.CateVO;
import com.ricky.travel.domain.ScenicPhoto;
import com.ricky.travel.domain.ScenicVO;
import com.ricky.travel.domain.TrafficVO;
import com.ricky.travel.service.CateService;
import com.ricky.travel.service.SceneService;
import com.ricky.travel.utils.cos.CosClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("cate")
public class CateController {

    @Autowired
    private CateService cateService;

    @RequestMapping("/doCate")
    public @ResponseBody
    DataTablesResponse<CateVO> pageSearch(@RequestBody DataTablesRequest request, String NameLike){
        Map<String,Object> map=request.getSearchColumns();

        List<Order> orders=request.getOrder();
        return cateService.getAll(request);
    }

    @RequestMapping("/list")
    public String list(){
        return "/admin/html/cate/cate";
    }

    @RequestMapping("/add")
    public String add(){
        return "/admin/html/cate/addCate";
    }

    @RequestMapping("/one")
    public ModelAndView one(String cateId){
        ModelAndView mav=new ModelAndView();
        if(StringUtils.isNullOrEmpty(cateId)){
            mav.setViewName("/admin/error404");
        }else {
            CateVO cateVO=cateService.getCate(Integer.parseInt(cateId));
            mav.addObject("cate",cateVO);
            mav.setViewName("/admin/html/cate/updateCate");
        }
        return mav;
    }

    @RequestMapping("/insert")
    @ResponseBody
//    HttpServletRequest request, @ModelAttribute("scenicVO") ScenicVO scenicVO, TrafficVO trafficVO, MultipartFile[] file
    public JSONObject insert(CateVO cateVO){
        JSONObject json=new JSONObject();
        try{
            cateService.insert(cateVO);
            json.put("result",1);
            json.put("url","/cate/list.do");
        }catch (Exception  e){
            json.put("result",0);
            e.printStackTrace();
        }

        return json;
    }

    @RequestMapping("/update")
    @ResponseBody
    public JSONObject update(CateVO cateVO){
        JSONObject json=new JSONObject();
        try{
            cateService.update(cateVO);
            json.put("result",1);
            json.put("url","/cate/list.do");
        }catch (Exception  e){
            json.put("result",0);
            e.printStackTrace();
        }

        return json;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public JSONObject delete(@RequestParam("cateId") String cateId ){
        JSONObject json=new JSONObject();
        try{
            cateService.delete(Integer.parseInt(cateId));
            json.put("result",1);
        }catch (Exception  e){
            json.put("result",0);
            e.printStackTrace();
        }

        return json;
    }

}
