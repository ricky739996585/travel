package com.ricky.travel.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.qcloud.cos.COSClient;
import com.ricky.travel.domain.ApplyExpert;
import com.ricky.travel.domain.ApplyExpertWithBLOBs;
import com.ricky.travel.domain.DataVO;
import com.ricky.travel.domain.ExpertVO;
import com.ricky.travel.service.DataService;
import com.ricky.travel.service.ExpertService;
import com.ricky.travel.utils.cos.CosClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ricky on 2018/4/6 0006
 */
@Controller
@RequestMapping("expertWeb")
public class ExpertWebController {
    @Autowired
    private ExpertService expertService;
    @Autowired
    private DataService dataService;

    @RequestMapping("expert")
    public String list(){
        return "/web/expert";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public JSONObject insert(HttpServletRequest request,String dataName,String dataOrganize,String applyReason,String startDate,String endDate,String url, String userId){
        ModelAndView mav=new ModelAndView();
        JSONObject json=new JSONObject();
        if(dataName==null||dataName==""){
            json.put("result",0);
            json.put("msg","请填写完整资料！");
            return json;
        }if(dataOrganize==null||dataOrganize==""){
            json.put("result",0);
            json.put("msg","请填写完整资料！");
            return json;
        }if(applyReason==null||applyReason==""){
            json.put("result",0);
            json.put("msg","请填写完整资料！");
            return json;
        }if(startDate==null||startDate==""){
            json.put("result",0);
            json.put("msg","请填写完整资料！");
            return json;
        }if(endDate==null||endDate==""){
            json.put("result",0);
            json.put("msg","请填写完整资料！");
            return json;
        }if(url==null||url==""){
            json.put("result",0);
            json.put("msg","请填写完整资料！");
            return json;
        }if(userId==null||userId==""){
            json.put("result",0);
            json.put("msg","请先登录！");
            return json;
        }
        try {
            ApplyExpertWithBLOBs expertVO=new ApplyExpertWithBLOBs();
            DataVO dataVO=new DataVO();
            //先插入expertVo
            expertVO.setApplyReason(applyReason);
            expertVO.setApplyDate(new Date());
            expertVO.setUserId(Integer.parseInt(userId));
            expertVO.setIsPass(0);
            expertVO.setApplyProve("资料证明");
            int applyId=expertService.insert(expertVO);

            //再插入dataVo
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            ParsePosition pos = new ParsePosition(0);
            ParsePosition pos2 = new ParsePosition(0);
            dataVO.setApplyId(applyId);
            dataVO.setDataStartdate(formatter.parse(startDate,pos));
            dataVO.setDataEnddate(formatter.parse(endDate,pos2));
            dataVO.setDataName(dataName);
            dataVO.setDataOrganize(dataOrganize);
            dataVO.setDataUrl(url);
            int dataId=dataService.insert(dataVO);

            //更新expertVo
            expertVO.setDataId(dataId);
            expertService.update(expertVO);
        } catch (NumberFormatException e) {
            json.put("result","0");
            e.printStackTrace();
        }
        json.put("result","1");
        json.put("url","/home/index.do");
        return json;
    }

    /**
     * @author:ricky
     * 功能：插入资料图片
     * 时间:2018/3/24 0024 14:35
     */
    @RequestMapping("/insertPic")
    @ResponseBody
    public JSONObject insertPic(HttpServletRequest request, MultipartFile pic) throws UnsupportedEncodingException {
        JSONObject json=new JSONObject();
        if(pic!=null){
            String preUrl="http://pic-1253210486.cosgz.myqcloud.com/applyData/";
            String picName=pic.getOriginalFilename();
            String suffix=picName.substring(picName.lastIndexOf(".")+1);
            String fileName= UUID.randomUUID().toString()+"."+suffix;
            String url=preUrl+fileName;
            //进行cos对象上传操作
            CosClient cos=new CosClient();
            COSClient cosClient=cos.createCilent();
            try {
                cos.uploadDataPic(fileName,pic.getSize(),pic.getInputStream(),cosClient);
                json.put("url",url);
            } catch (IOException e) {
                json.put("error",1);
                e.printStackTrace();
            }
        }else {
            json.put("error",1);
        }
        return json;
    }

    /**
     * @author:ricky
     * 功能：删除资料图片
     * 时间:2018/3/24 0024 14:35
     */
    @RequestMapping("/delPic")
    @ResponseBody
    public JSONObject delPic(HttpServletRequest request, MultipartFile pic) throws UnsupportedEncodingException {
        JSONObject json=new JSONObject();
        if(pic!=null){
            String preUrl="http://pic-1253210486.cosgz.myqcloud.com/applyData/";
            String fileName= UUID.randomUUID().toString()+pic.getOriginalFilename();
            String url=preUrl+fileName;
            //进行cos对象上传操作
            CosClient cos=new CosClient();
            COSClient cosClient=cos.createCilent();
            try {
                cos.uploadDataPic(fileName,pic.getSize(),pic.getInputStream(),cosClient);
                json.put("url",url);
            } catch (IOException e) {
                json.put("error",1);
                e.printStackTrace();
            }
        }else {
            json.put("error",1);
        }
        return json;
    }

}
