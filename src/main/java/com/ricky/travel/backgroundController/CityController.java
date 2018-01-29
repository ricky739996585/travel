package com.ricky.travel.backgroundController;

import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.datatable.Order;
import com.ricky.travel.domain.CityVO;
import com.ricky.travel.domain.CountryVO;
import com.ricky.travel.domain.ProvinceVO;
import com.ricky.travel.domain.ScenicVO;
import com.ricky.travel.service.CityService;
import com.ricky.travel.service.SceneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("city")
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping("/doCountry")
    public List<CountryVO> pageCountry(String countryNname){
        return cityService.getCountry(countryNname);
    }

    @RequestMapping("/doProvince")
    public List<ProvinceVO> pageProvince(Integer countryId,String provinceName){
        return cityService.getProvince(countryId,provinceName);
    }

    @RequestMapping("/doCity")
    public List<CityVO> pageCity(Integer provinceId,String cityName){
        return cityService.getCity(provinceId,cityName);
    }

//    @RequestMapping("/add")
//    public String login(){
//        return "/admin/html/scene/addScene";
//    }
}
