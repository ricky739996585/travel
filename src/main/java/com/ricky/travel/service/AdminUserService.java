package com.ricky.travel.service;

import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.domain.AdminUser;

import java.util.List;
import java.util.Map;

public interface AdminUserService {
    public DataTablesResponse<AdminUser> getAll(DataTablesRequest request);

    public AdminUser getUser(Integer id);

    public int insert(AdminUser user);

    public void update(AdminUser user);

    public void delete(Integer id);

    public boolean validate(AdminUser user);

    public List<Map<String,Object>> selectAuthByUser(String adminAccount);

    public List<Map<String,Object>> getDivideByAccountId(int adminId);
}
