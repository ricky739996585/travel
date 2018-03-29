package com.ricky.travel.serviceImpl;

import com.ricky.travel.dao.ApplyExpertMapper;
import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.domain.ApplyExpert;
import com.ricky.travel.domain.ApplyExpertExample;
import com.ricky.travel.domain.ApplyExpertWithBLOBs;
import com.ricky.travel.service.ExpertService;
import com.ricky.travel.utils.commons.FormatTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ExpertServiceImpl implements ExpertService {
    @Autowired
    public ApplyExpertMapper applyExpertMapper;

    @Override
    public DataTablesResponse<Map<String, Object>> getAll(DataTablesRequest request) {
        DataTablesResponse<Map<String, Object>> response=new DataTablesResponse<>();
        ApplyExpertExample example=new ApplyExpertExample();
        example.setOffset(request.getStart());
        example.setLimit(request.getLength());
        String order=null;
        if(request.getOrder()!=null){
            switch (request.getOrder().get(0).getColumn()){
                case 2:
                    order="Apply_Date";
                    break;
                default:
                    order="Apply_Id";
                    break;
            }
        }
        example.setOrderByClause(order);
        example.setOrderByDirection(request.getOrder().get(0).getDir());
        Map<String,Object> search=request.getSearchColumns();
        if(search!=null){
            if(!search.get("searchName").toString().equals("")){
                String key="%"+search.get("searchName").toString()+"%";
                example.createCriteria().andApplyIdIsNotNull().andIsPassEqualTo(0).andUserNameLike(key);
            }
            else {
                example.createCriteria().andApplyIdIsNotNull().andIsPassEqualTo(0);
            }
        }
        List<Map<String,Object>> list=applyExpertMapper.selectApplyById(example);
        for (Map<String,Object> apply:list){
            String applyDate= FormatTool.formatDate((Date) apply.get("applyDate"));
            apply.replace("applyDate", applyDate);
        }
        response.setDraw(request.getDraw());
        response.setRecordsTotal(list.size());
        response.setData(list);
        return response;
    }

    @Override
    public List<Map<String, Object>> getDataByApplyId(Integer applyId) {
        return applyExpertMapper.getDataByApplyId(applyId);
    }

    @Override
    public void passExpert(ApplyExpertWithBLOBs applyExpertWithBLOBs) {
        //状态码：0代表未审核，1代表审核通过，2代表审核不通过
        applyExpertWithBLOBs.setIsPass(1);
        applyExpertMapper.updateByPrimaryKeySelective(applyExpertWithBLOBs);
    }

    @Override
    public void notPassExpert(ApplyExpertWithBLOBs applyExpertWithBLOBs) {
        //状态码：0代表未审核，1代表审核通过，2代表审核不通过
        applyExpertWithBLOBs.setIsPass(2);
        applyExpertMapper.updateByPrimaryKeySelective(applyExpertWithBLOBs);
    }


}
