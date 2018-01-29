package com.ricky.travel.dao;

import java.util.List;

import com.ricky.travel.domain.ExpertVO;
import com.ricky.travel.domain.ExpertVOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpertVOMapper {
    int countByExample(ExpertVOExample example);

    int deleteByExample(ExpertVOExample example);

    int deleteByPrimaryKey(Integer applyId);

    int insert(ExpertVO record);

    int insertSelective(ExpertVO record);

    List<ExpertVO> selectByExampleWithBLOBs(ExpertVOExample example);

    List<ExpertVO> selectByExample(ExpertVOExample example);

    ExpertVO selectByPrimaryKey(Integer applyId);

    int updateByExampleSelective(@Param("record") ExpertVO record, @Param("example") ExpertVOExample example);

    int updateByExampleWithBLOBs(@Param("record") ExpertVO record, @Param("example") ExpertVOExample example);

    int updateByExample(@Param("record") ExpertVO record, @Param("example") ExpertVOExample example);

    int updateByPrimaryKeySelective(ExpertVO record);

    int updateByPrimaryKeyWithBLOBs(ExpertVO record);

    int updateByPrimaryKey(ExpertVO record);
}