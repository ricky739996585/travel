package com.ricky.travel.service;

import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.domain.CateVO;

import java.util.List;
import java.util.Map;

public interface CateService {
    public DataTablesResponse<CateVO> getAll(DataTablesRequest request);

    public CateVO getCate(Integer id);

    public int insert(CateVO cateVO);

    public void update(CateVO cateVO);

    public void delete(Integer id);

    public Map<String,Object> selectByPrimaryKeyWithCity(Integer cateId);

    public List<CateVO> getCateByCityId(int CityId);

}
