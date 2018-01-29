package com.ricky.travel.dao;

import com.ricky.travel.domain.ScenicCreate;
import com.ricky.travel.domain.ScenicCreateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ScenicCreateMapper {
    int countByExample(ScenicCreateExample example);

    int deleteByExample(ScenicCreateExample example);

    int deleteByPrimaryKey(Integer createId);

    int insert(ScenicCreate record);

    int insertSelective(ScenicCreate record);

    List<ScenicCreate> selectByExample(ScenicCreateExample example);

    ScenicCreate selectByPrimaryKey(Integer createId);

    int updateByExampleSelective(@Param("record") ScenicCreate record, @Param("example") ScenicCreateExample example);

    int updateByExample(@Param("record") ScenicCreate record, @Param("example") ScenicCreateExample example);

    int updateByPrimaryKeySelective(ScenicCreate record);

    int updateByPrimaryKey(ScenicCreate record);
}