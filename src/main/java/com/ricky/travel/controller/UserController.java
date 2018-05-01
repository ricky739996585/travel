package com.ricky.travel.controller;

import com.alibaba.fastjson.JSONObject;
import com.ricky.travel.domain.RsUser;
import com.ricky.travel.service.RsUserService;
import com.ricky.travel.utils.commons.MailUtils;
import com.ricky.travel.utils.vo.MySessionContext;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("userWeb")
public class UserController {

    @Resource
    protected MailUtils mailUtils;
    @Autowired
    private RsUserService rsUserService;

    @RequestMapping("/index")
    public String list(){
        return "/admin/index";
    }

    @RequestMapping("/login")
    @ResponseBody
    public JSONObject login(HttpServletRequest request,String email,String sessionId,String code){
        JSONObject json=new JSONObject();
        if(StringUtils.isBlank(email)){
            json.put("result",0);
            json.put("msg","请输入邮箱！");
            return json;
        }
        if(StringUtils.isBlank(code)){
            json.put("result",0);
            json.put("msg","请输入验证码！");
            return json;
        }
        HttpSession session= (HttpSession) MySessionContext.getInstance().getSession(sessionId);
        String mailCode= (String) session.getAttribute("mailCode");
        //验证 验证码
        if(mailCode==null||code==null){
            json.put("result",0);
            json.put("msg","请输入验证码！");
            return json;
        }
        if(!mailCode.equals(code)){
            json.put("result",0);
            json.put("msg","验证失败！");
            session.removeAttribute("mailCode");
            return json;
        }

        //判断该用户是否已经注册，没有则插入，有则不用，判断验证码是否正确即可
        RsUser userByEmail = rsUserService.getRsUserByEmail(email);
        if(null==userByEmail){
            RsUser user=new RsUser();
            user.setUserName(email);
            user.setUserEmail(email);
            user.setUserStatus(0);
            user.setLastLogin(new Date());
            user.setUserLevel(0);
            user.setUserDate(new Date());
            rsUserService.insertRsUser(user);
            if(user.getUserId()<=0){
                json.put("result",0);
                json.put("msg","登录失败！");
                return json;
            }
            session.setAttribute("user",user);

        }else {
            userByEmail.setLastLogin(new Date());
            rsUserService.updateRsUser(userByEmail);
            session.setAttribute("user",userByEmail);
        }
        json.put("result",1);
        json.put("msg","登录成功！");
        json.put("url","/home/index.do");
        return json;
    }

    @RequestMapping("/cancel")
    @ResponseBody
    public JSONObject cancel(HttpServletRequest request){
        JSONObject json=new JSONObject();
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        json.put("result",1);
        json.put("msg","注销成功！");
        json.put("url","/home/index.do");
        return json;

    }


    @RequestMapping("/sendEmail")
    @ResponseBody
    public JSONObject sendEmail(HttpServletRequest request,String email){
        JSONObject json=new JSONObject();
        HttpSession session=request.getSession();
        String sessionId=session.getId();
        if(StringUtils.isBlank(email)){
            json.put("result",0);
            json.put("msg","请输入邮箱");
            return json;
        }
        try{
            //发送短信
            JSONObject data=new JSONObject();
            String mailCode=mailUtils.getCode();
            session.setAttribute("mailCode",mailCode);
            mailUtils.send(email,mailCode);
            data.put("sessionId",sessionId);
            json.put("data",data);
            json.put("result",1);
            json.put("msg","发送成功！");
        }catch (Exception  e){
            json.put("result",0);
            json.put("msg","发送失败！");
            e.printStackTrace();
            return json;
        }
        return json;
    }
}
