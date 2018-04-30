package com.ricky.travel.service;

import com.ricky.travel.domain.CityVO;
import com.ricky.travel.domain.CountryVO;
import com.ricky.travel.domain.ProvinceVO;
import com.ricky.travel.domain.TrafficVO;

import java.util.List;

public interface TrafficService {
    public List<TrafficVO> getTrafficBySceneId(int sceneId);

}
