package com.ricky.travel.serviceImpl;

import com.ricky.travel.dao.AdminUserMapper;
import com.ricky.travel.domain.AdminUser;
import com.ricky.travel.domain.AdminUserExample;
import com.ricky.travel.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("adminUserService")
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    public AdminUserMapper adminUserMapper;

    @Override
    public List<AdminUser> getAll() {
        AdminUserExample example=new AdminUserExample();
        example.createCriteria().andAdminIdIsNotNull();
        return adminUserMapper.selectByExample(example);
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
        AdminUserExample example=new AdminUserExample();
        example.createCriteria().andAdminAccountEqualTo(user.getAdminAccount());
        example.createCriteria().andAdminPasswordEqualTo(user.getAdminPassword());
        int length=adminUserMapper.selectByExample(example).size();
        if(length>0){
            return true;
        }else {
            return false;
        }
    }
}
