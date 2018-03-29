package com.ricky.travel.service;

import com.ricky.travel.domain.DivideVO;

import java.util.List;

public interface DivideService {
    public DivideVO getDivide(Integer id);

    public int insert(DivideVO divideVO);

    public void update(DivideVO divideVO);

    public void delete(Integer id);

    public DivideVO getDivideByAdminIdAndAuthId(Integer adminId,Integer authId);

    public void insertAuth(int adminId,int authId);

    public void deleteAuth(int adminId,int authId);
}
