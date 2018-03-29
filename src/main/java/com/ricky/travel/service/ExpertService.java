package com.ricky.travel.service;

import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.domain.ApplyExpert;
import com.ricky.travel.domain.ApplyExpertWithBLOBs;

import java.util.List;
import java.util.Map;

public interface ExpertService {
    public DataTablesResponse<Map<String,Object>> getAll(DataTablesRequest request);

    public List<Map<String,Object>> getDataByApplyId(Integer applyId);

    public void passExpert(ApplyExpertWithBLOBs applyExpertWithBLOBs);

    public void notPassExpert(ApplyExpertWithBLOBs applyExpertWithBLOBs);
}
