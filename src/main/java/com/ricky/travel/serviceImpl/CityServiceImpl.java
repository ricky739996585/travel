package com.ricky.travel.serviceImpl;

import com.ricky.travel.dao.CityVOMapper;
import com.ricky.travel.dao.CountryVOMapper;
import com.ricky.travel.dao.ProvinceVOMapper;
import com.ricky.travel.domain.*;
import com.ricky.travel.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService{
    @Autowired
    public CountryVOMapper countryVOMapper;
    @Autowired
    public ProvinceVOMapper provinceMapper;
    @Autowired
    public CityVOMapper cityVOMapper;

    @Override
    public List<CountryVO> getCountry(String countryNname) {
        CountryVOExample example=new CountryVOExample();
        if(countryNname!=null&&countryNname!=""){
            System.out.println(countryNname);
            example.createCriteria().andCountryNnameLike(countryNname+"%");
        }
        example.createCriteria().andCountryIdIsNotNull();
        return countryVOMapper.selectByExample(example);
    }

    @Override
    public List<ProvinceVO> getProvince(Integer countryId, String provinceName) {
        ProvinceVOExample example=new ProvinceVOExample();
        if(provinceName!=null&&provinceName!=""){
            example.createCriteria().andProvinceNameLike(provinceName+"%");
        }
        example.createCriteria().andCountryIdEqualTo(countryId);
        return provinceMapper.selectByExample(example);
    }

    @Override
    public List<CityVO> getCity(Integer provinceId, String cityName) {
        CityVOExample example=new CityVOExample();
        if(cityName!=null&&cityName!=""){
            example.createCriteria().andCityNameLike(cityName+"%");
        }
        example.createCriteria().andProvinceIdEqualTo(provinceId);
        return cityVOMapper.selectByExample(example);
    }
}
