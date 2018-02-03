package com.ricky.travel.backgroundController;

import com.qcloud.cos.utils.StringUtils;
import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.datatable.Order;
import com.ricky.travel.domain.RsUser;
import com.ricky.travel.service.RsUserService;
import com.ricky.travel.utils.commons.FormatTool;
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
@RequestMapping("rsUser")
public class RsUserController {
    @Autowired
    private RsUserService rsUserService;

    @RequestMapping("/doRsUser")
    public @ResponseBody
    DataTablesResponse<RsUser> pageSearch(@RequestBody DataTablesRequest request){
        Map<String,Object> map=request.getSearchColumns();
        List<Order> orders=request.getOrder();
        return rsUserService.getAll(request);
    }

    @RequestMapping("/list")
    public String list(){
        return "/admin/html/rsUser/rsUser";
    }

    @RequestMapping("/one")
    public ModelAndView one(String rsUserId){
        ModelAndView mav=new ModelAndView();
        if(StringUtils.isNullOrEmpty(rsUserId)){
            mav.setViewName("/admin/error404");
        }else {
            RsUser rsUser=rsUserService.getRsUser(Integer.parseInt(rsUserId));
            String lastLogin=FormatTool.formatDate(rsUser.getLastLogin());
            String userDate=FormatTool.formatDate(rsUser.getUserDate());
            mav.addObject("rsUser",rsUser);
            mav.addObject("lastLogin",lastLogin);
            mav.addObject("userDate",userDate);
            mav.setViewName("/admin/html/rsUser/updateRsUser");
        }
        return mav;
    }
}
