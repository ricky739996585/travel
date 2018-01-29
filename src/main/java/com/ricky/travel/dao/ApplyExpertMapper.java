package com.ricky.travel.dao;

import com.ricky.travel.domain.ApplyExpert;
import com.ricky.travel.domain.ApplyExpertExample;
import com.ricky.travel.domain.ApplyExpertWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyExpertMapper {
    int countByExample(ApplyExpertExample example);

    int deleteByExample(ApplyExpertExample example);

    int deleteByPrimaryKey(Integer applyId);

    int insert(ApplyExpertWithBLOBs record);

    int insertSelective(ApplyExpertWithBLOBs record);

    List<ApplyExpertWithBLOBs> selectByExampleWithBLOBs(ApplyExpertExample example);

    List<ApplyExpert> selectByExample(ApplyExpertExample example);

    ApplyExpertWithBLOBs selectByPrimaryKey(Integer applyId);

    int updateByExampleSelective(@Param("record") ApplyExpertWithBLOBs record, @Param("example") ApplyExpertExample example);

    int updateByExampleWithBLOBs(@Param("record") ApplyExpertWithBLOBs record, @Param("example") ApplyExpertExample example);

    int updateByExample(@Param("record") ApplyExpert record, @Param("example") ApplyExpertExample example);

    int updateByPrimaryKeySelective(ApplyExpertWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ApplyExpertWithBLOBs record);

    int updateByPrimaryKey(ApplyExpert record);
}