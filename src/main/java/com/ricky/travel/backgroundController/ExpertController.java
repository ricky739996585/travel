package com.ricky.travel.backgroundController;

import com.alibaba.fastjson.JSONObject;
import com.qcloud.cos.utils.StringUtils;
import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.datatable.Order;
import com.ricky.travel.domain.ApplyExpert;
import com.ricky.travel.domain.ApplyExpertWithBLOBs;
import com.ricky.travel.domain.CateVO;
import com.ricky.travel.service.CateService;
import com.ricky.travel.service.ExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("expert")
public class ExpertController {

    @Autowired
    private ExpertService expertService;
    @Autowired
    private CateService cateService;

    @RequestMapping("/doExpert")
    public @ResponseBody
    DataTablesResponse<Map<String,Object>> pageSearch(@RequestBody DataTablesRequest request){
        Map<String,Object> map=request.getSearchColumns();
        List<Order> orders=request.getOrder();
        return expertService.getAll(request);
    }

    @RequestMapping("/list")
    public String list(){
        return "/admin/html/approve/expertApprove";
    }


    @RequestMapping("/one")
    public ModelAndView one(String applyId){
        ModelAndView mav=new ModelAndView();
        if(StringUtils.isNullOrEmpty(applyId)){
            mav.setViewName("/admin/error404");
        }else {
            Map<String,Object> map=expertService.getDataByApplyId(Integer.parseInt(applyId)).get(0);
            mav.addObject("applyData",map);
            mav.setViewName("/admin/html/approve/updateExpert");
        }
        return mav;
    }

    @RequestMapping("/pass")
    @ResponseBody
    public JSONObject pass(String applyId){
        JSONObject json=new JSONObject();
        try{
            ApplyExpertWithBLOBs applyExpertWithBLOBs=new ApplyExpertWithBLOBs();
            applyExpertWithBLOBs.setApplyId(Integer.parseInt(applyId));
            expertService.passExpert(applyExpertWithBLOBs);
            json.put("result",1);
            json.put("url","/expert/list.do");
        }catch (Exception  e){
            json.put("result",0);
            e.printStackTrace();
        }

        return json;
    }

    @RequestMapping("/notPass")
    @ResponseBody
    public JSONObject notPass(String applyId){
        JSONObject json=new JSONObject();
        try{
            ApplyExpertWithBLOBs applyExpertWithBLOBs=new ApplyExpertWithBLOBs();
            applyExpertWithBLOBs.setApplyId(Integer.parseInt(applyId));
            expertService.notPassExpert(applyExpertWithBLOBs);
            json.put("result",1);
            json.put("url","/expert/list.do");
        }catch (Exception  e){
            json.put("result",0);
            e.printStackTrace();
        }

        return json;
    }

}
