package com.ricky.travel.dao;

import com.ricky.travel.domain.Divide;
import com.ricky.travel.domain.DivideExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DivideMapper {
    int countByExample(DivideExample example);

    int deleteByExample(DivideExample example);

    int deleteByPrimaryKey(Integer divideId);

    int insert(Divide record);

    int insertSelective(Divide record);

    List<Divide> selectByExample(DivideExample example);

    Divide selectByPrimaryKey(Integer divideId);

    int updateByExampleSelective(@Param("record") Divide record, @Param("example") DivideExample example);

    int updateByExample(@Param("record") Divide record, @Param("example") DivideExample example);

    int updateByPrimaryKeySelective(Divide record);

    int updateByPrimaryKey(Divide record);

    List<Map<String,Object>> getDivideByAccountId(Integer accountId);
}