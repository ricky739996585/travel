package com.ricky.travel.service;

import com.ricky.travel.domain.CityVO;
import com.ricky.travel.domain.CountryVO;
import com.ricky.travel.domain.ProvinceVO;

import java.util.List;

public interface CityService {
    public List<CountryVO> getCountry(String countryNname);

    public List<ProvinceVO> getProvince(Integer countryId,String provinceName);

    public List<CityVO> getCity(Integer provinceId,String cityName);
}
