package com.ricky.travel.controller;

import com.alibaba.fastjson.JSONObject;
import com.qcloud.cos.utils.StringUtils;
import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.datatable.Order;
import com.ricky.travel.domain.ApplyExpertWithBLOBs;
import com.ricky.travel.domain.RsUser;
import com.ricky.travel.service.RsUserService;
import com.ricky.travel.utils.commons.FormatTool;
import com.ricky.travel.utils.commons.MailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    protected MailUtils mailUtils;

    @RequestMapping("/index")
    public String list(){
        return "/admin/index";
    }

    @RequestMapping("/one")
    public ModelAndView one(String rsUserId){
        ModelAndView mav=new ModelAndView();
        if(StringUtils.isNullOrEmpty(rsUserId)){
            mav.setViewName("/admin/error404");
        }else {
//            RsUser rsUser=rsUserService.getRsUser(Integer.parseInt(rsUserId));
//            String lastLogin=FormatTool.formatDate(rsUser.getLastLogin());
//            String userDate=FormatTool.formatDate(rsUser.getUserDate());
//            mav.addObject("rsUser",rsUser);
//            mav.addObject("lastLogin",lastLogin);
//            mav.addObject("userDate",userDate);
            mav.setViewName("/admin/html/rsUser/updateRsUser");
        }
        return mav;
    }

    @RequestMapping("/sendEmail")
    @ResponseBody
    public JSONObject sendEmail(HttpServletRequest request,String email){
        JSONObject json=new JSONObject();
        HttpSession session=request.getSession();
        String sessionId=session.getId();
        try{
            //发送短信
            JSONObject data=new JSONObject();
            String mailCode=mailUtils.getCode();
            session.setAttribute("mailCode",mailCode);
            mailUtils.send(email,mailCode);
            data.put("sessionId",sessionId);
            json.put("data",data);
            json.put("result",1);
        }catch (Exception  e){
            json.put("result",0);
            e.printStackTrace();
        }

        return json;
    }
}
