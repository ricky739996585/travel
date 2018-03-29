package com.ricky.travel.serviceImpl;

import com.ricky.travel.dao.AdminUserMapper;
import com.ricky.travel.dao.AuthVOMapper;
import com.ricky.travel.dao.DivideMapper;
import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.domain.AdminUser;
import com.ricky.travel.domain.AdminUserExample;
import com.ricky.travel.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("adminUserService")
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    public AdminUserMapper adminUserMapper;
    @Autowired
    public AuthVOMapper authVOMapper;
    @Autowired
    public DivideMapper divideMapper;

    @Override
    public DataTablesResponse<AdminUser> getAll(DataTablesRequest request) {
        DataTablesResponse<AdminUser> response=new DataTablesResponse<>();
        AdminUserExample example=new AdminUserExample();
        example.createCriteria().andAdminIdIsNotNull();

        AdminUserExample example2=new AdminUserExample();
        example2.setOffset(request.getStart());
        example2.setLimit(request.getLength());
        String order=null;
        if(request.getOrder()!=null){
            switch (request.getOrder().get(0).getColumn()){
                default:
                    order="Admin_Id";
                    break;
            }
        }
        example2.setOrderByClause(order);
        example2.setOrderByDirection(request.getOrder().get(0).getDir());
        Map<String,Object> search=request.getSearchColumns();
        if(search!=null){
            if(!search.get("searchName").toString().equals("")){
                String key="%"+search.get("searchName").toString()+"%";
                example2.createCriteria().andAdminAccountLike(key);
            }

        }
        response.setDraw(request.getDraw());
        response.setRecordsTotal(adminUserMapper.countByExample(example2));
        response.setData(adminUserMapper.selectByExample(example2));
        return response;
    }

    @Override
    public AdminUser getUser(Integer id) {
        return adminUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(AdminUser user) {
        return adminUserMapper.insert(user);
    }

    @Override
    public void update(AdminUser user) {
        adminUserMapper.updateByPrimaryKey(user);
    }

    @Override
    public void delete(Integer id) {
        adminUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean validate(AdminUser user) {
        int length=adminUserMapper.validate(user);
        if(length>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<Map<String, Object>> selectAuthByUser(String adminAccount) {
        return authVOMapper.selectAuthByUser(adminAccount);
    }

    @Override
    public List<Map<String, Object>> getDivideByAccountId(int adminId) {
        return divideMapper.getDivideByAccountId(adminId);
    }

}
