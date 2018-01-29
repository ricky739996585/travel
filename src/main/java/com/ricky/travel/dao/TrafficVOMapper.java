package com.ricky.travel.dao;

import java.util.List;

import com.ricky.travel.domain.TrafficVO;
import com.ricky.travel.domain.TrafficVOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TrafficVOMapper {
    int countByExample(TrafficVOExample example);

    int deleteByExample(TrafficVOExample example);

    int deleteByPrimaryKey(Integer trafficId);

    int insert(TrafficVO record);

    int insertSelective(TrafficVO record);

    List<TrafficVO> selectByExampleWithBLOBs(TrafficVOExample example);

    List<TrafficVO> selectByExample(TrafficVOExample example);

    TrafficVO selectByPrimaryKey(Integer trafficId);

    int updateByExampleSelective(@Param("record") TrafficVO record, @Param("example") TrafficVOExample example);

    int updateByExampleWithBLOBs(@Param("record") TrafficVO record, @Param("example") TrafficVOExample example);

    int updateByExample(@Param("record") TrafficVO record, @Param("example") TrafficVOExample example);

    int updateByPrimaryKeySelective(TrafficVO record);

    int updateByPrimaryKeyWithBLOBs(TrafficVO record);

    int updateByPrimaryKey(TrafficVO record);
}