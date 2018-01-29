package com.ricky.travel.dao;

import java.util.List;

import com.ricky.travel.domain.AuthVO;
import com.ricky.travel.domain.AuthVOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthVOMapper {
    int countByExample(AuthVOExample example);

    int deleteByExample(AuthVOExample example);

    int deleteByPrimaryKey(Integer authId);

    int insert(AuthVO record);

    int insertSelective(AuthVO record);

    List<AuthVO> selectByExampleWithBLOBs(AuthVOExample example);

    List<AuthVO> selectByExample(AuthVOExample example);

    AuthVO selectByPrimaryKey(Integer authId);

    int updateByExampleSelective(@Param("record") AuthVO record, @Param("example") AuthVOExample example);

    int updateByExampleWithBLOBs(@Param("record") AuthVO record, @Param("example") AuthVOExample example);

    int updateByExample(@Param("record") AuthVO record, @Param("example") AuthVOExample example);

    int updateByPrimaryKeySelective(AuthVO record);

    int updateByPrimaryKeyWithBLOBs(AuthVO record);

    int updateByPrimaryKey(AuthVO record);
}