package com.ricky.travel.dao;

import com.ricky.travel.domain.ApplyData;
import com.ricky.travel.domain.ApplyDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyDataMapper {
    int countByExample(ApplyDataExample example);

    int deleteByExample(ApplyDataExample example);

    int deleteByPrimaryKey(Integer dataId);

    int insert(ApplyData record);

    int insertSelective(ApplyData record);

    List<ApplyData> selectByExampleWithBLOBs(ApplyDataExample example);

    List<ApplyData> selectByExample(ApplyDataExample example);

    ApplyData selectByPrimaryKey(Integer dataId);

    int updateByExampleSelective(@Param("record") ApplyData record, @Param("example") ApplyDataExample example);

    int updateByExampleWithBLOBs(@Param("record") ApplyData record, @Param("example") ApplyDataExample example);

    int updateByExample(@Param("record") ApplyData record, @Param("example") ApplyDataExample example);

    int updateByPrimaryKeySelective(ApplyData record);

    int updateByPrimaryKeyWithBLOBs(ApplyData record);

    int updateByPrimaryKey(ApplyData record);
}