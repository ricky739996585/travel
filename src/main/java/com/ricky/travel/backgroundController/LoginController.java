package com.ricky.travel.backgroundController;

import com.alibaba.fastjson.JSONObject;
import com.ricky.travel.domain.AdminUser;
import com.ricky.travel.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("admin")
public class LoginController {

    @Autowired
    private AdminUserService adminUserService;

    @RequestMapping("/login")
    public String login(){
        return "/admin/login";
    }

    @RequestMapping("/error")
    public String error(){
        return "/admin/error404";
    }

    @RequestMapping(value = "/validate",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject validate(String username, String password,HttpServletRequest request){
        JSONObject json=new JSONObject();
        HttpSession session=request.getSession();
        AdminUser user=new AdminUser();
        user.setAdminAccount(username);
        user.setAdminPassword(password);
        //当登陆成功后
        if(adminUserService.validate(user)){
            List<Map<String,Object>> auths=adminUserService.selectAuthByUser(username);
            json.put("result",1);
            json.put("url","/scene/list.do");
            session.setAttribute("user",user);
            session.setAttribute("auths",auths);
        }else {
            json.put("result",0);
        }
        return  json;
    }
}
