package com.ricky.travel.dao;

import com.ricky.travel.domain.Auth;
import com.ricky.travel.domain.AuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthMapper {
    int countByExample(AuthExample example);

    int deleteByExample(AuthExample example);

    int deleteByPrimaryKey(Integer authId);

    int insert(Auth record);

    int insertSelective(Auth record);

    List<Auth> selectByExampleWithBLOBs(AuthExample example);

    List<Auth> selectByExample(AuthExample example);

    Auth selectByPrimaryKey(Integer authId);

    int updateByExampleSelective(@Param("record") Auth record, @Param("example") AuthExample example);

    int updateByExampleWithBLOBs(@Param("record") Auth record, @Param("example") AuthExample example);

    int updateByExample(@Param("record") Auth record, @Param("example") AuthExample example);

    int updateByPrimaryKeySelective(Auth record);

    int updateByPrimaryKeyWithBLOBs(Auth record);

    int updateByPrimaryKey(Auth record);
}