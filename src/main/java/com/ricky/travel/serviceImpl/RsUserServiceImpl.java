package com.ricky.travel.serviceImpl;

import com.ricky.travel.dao.RsUserMapper;
import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.domain.RsUser;
import com.ricky.travel.domain.RsUserExample;
import com.ricky.travel.service.RsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RsUserServiceImpl implements RsUserService {
    @Autowired
    public RsUserMapper rsUserMapper;

    @Override
    public DataTablesResponse<RsUser> getAll(DataTablesRequest request) {
        DataTablesResponse<RsUser> response=new DataTablesResponse<>();
        RsUserExample example=new RsUserExample();
        example.createCriteria().andUserIdIsNotNull();

        RsUserExample example2=new RsUserExample();
        example2.setOffset(request.getStart());
        example2.setLimit(request.getLength());
        String order=null;
        if(request.getOrder()!=null){
            switch (request.getOrder().get(0).getColumn()){
                default:
                    order="User_Id";
                    break;
            }
        }
        example2.setOrderByClause(order);
        example2.setOrderByDirection(request.getOrder().get(0).getDir());
        Map<String,Object> search=request.getSearchColumns();
        if(search!=null){
            if(!search.get("searchName").toString().equals("")){
                String key="%"+search.get("searchName").toString()+"%";
                example2.createCriteria().andUserNameLike(key);
            }
            if(!search.get("searchPhone").toString().equals("")){
                String key=search.get("searchPhone").toString();
                example2.createCriteria().andUserPhoneEqualTo(key);
            }
            if(!search.get("searchEmail").toString().equals("")){
                String key=search.get("searchEmail").toString();
                example2.createCriteria().andUserEmailEqualTo(key);
            }
            if(search.get("searchStatus")!=null){
                String key=search.get("searchStatus").toString();
                example2.createCriteria().andUserStatusEqualTo(Integer.parseInt(key));
            }
        }
        response.setDraw(request.getDraw());
        response.setRecordsTotal(rsUserMapper.countByExample(example2));
        response.setData(rsUserMapper.selectByExample(example2));
        return response;
    }

    @Override
    public RsUser getRsUser(Integer rsUserId) {

        return rsUserMapper.selectByPrimaryKey(rsUserId);
    }
}
