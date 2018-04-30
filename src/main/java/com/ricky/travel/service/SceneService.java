package com.ricky.travel.service;

import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.domain.AdminUser;
import com.ricky.travel.domain.ScenicPhoto;
import com.ricky.travel.domain.ScenicVO;
import com.ricky.travel.domain.TrafficVO;

import java.util.List;
import java.util.Map;

public interface SceneService {
    public DataTablesResponse<ScenicVO> getAll(DataTablesRequest request);

    public ScenicVO getScenic(Integer id);

    public int insert(ScenicVO scenicVO,TrafficVO trafficVO);

    public void update(ScenicVO scenicVO,TrafficVO trafficVO);

    public void delete(Integer id);

    public Map<String,Object> getScenicAndTraffic(Integer id);

    public List<ScenicVO> getHomeScene();

    public List<ScenicVO> getSceneBySearch(String search,int offset,int limit);

    public int getCountBySearch(String search);
}
