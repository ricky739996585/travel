package com.ricky.travel.backgroundController;

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
    public ModelAndView validate(String username,String password,@RequestParam("file") MultipartFile file){
        ModelAndView  mav=new ModelAndView();
        AdminUser user=new AdminUser();
        user.setAdminAccount(username);
        user.setAdminPassword(password);
        if(adminUserService.validate(user)){
            mav.setViewName("/admin/html/scene/scene");
//            session.setAttribute("username",username);
        }else {
            mav.setViewName("/admin/login");
        }
        return  mav;
    }
}
