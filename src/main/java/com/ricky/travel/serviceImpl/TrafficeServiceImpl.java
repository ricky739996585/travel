package com.ricky.travel.serviceImpl;

import com.ricky.travel.dao.TrafficVOMapper;
import com.ricky.travel.domain.*;
import com.ricky.travel.service.TrafficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ricky on 2018/4/5 0005
 */
@Service
public class TrafficeServiceImpl implements TrafficService {
    @Autowired
    private TrafficVOMapper trafficVOMapper;

    @Override
    public List<TrafficVO> getTrafficBySceneId(int sceneId) {
        TrafficVOExample example=new TrafficVOExample();
        example.createCriteria().andScenicIdEqualTo(sceneId);
        return trafficVOMapper.selectByExampleWithBLOBs(example);
    }
}
