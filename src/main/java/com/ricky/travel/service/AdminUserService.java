package com.ricky.travel.service;

import com.ricky.travel.domain.AdminUser;

import java.util.List;

public interface AdminUserService {
    public List<AdminUser> getAll();

    public AdminUser getUser(Integer id);

    public int insert(AdminUser user);

    public void update(AdminUser user);

    public void delete(Integer id);

    public boolean validate(AdminUser user);
}
