package com.ricky.travel.dao;

import com.ricky.travel.domain.Traffic;
import com.ricky.travel.domain.TrafficExample;
import com.ricky.travel.domain.TrafficWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TrafficMapper {
    int countByExample(TrafficExample example);

    int deleteByExample(TrafficExample example);

    int deleteByPrimaryKey(Integer trafficId);

    int insert(TrafficWithBLOBs record);

    int insertSelective(TrafficWithBLOBs record);

    List<TrafficWithBLOBs> selectByExampleWithBLOBs(TrafficExample example);

    List<Traffic> selectByExample(TrafficExample example);

    TrafficWithBLOBs selectByPrimaryKey(Integer trafficId);

    int updateByExampleSelective(@Param("record") TrafficWithBLOBs record, @Param("example") TrafficExample example);

    int updateByExampleWithBLOBs(@Param("record") TrafficWithBLOBs record, @Param("example") TrafficExample example);

    int updateByExample(@Param("record") Traffic record, @Param("example") TrafficExample example);

    int updateByPrimaryKeySelective(TrafficWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TrafficWithBLOBs record);

    int updateByPrimaryKey(Traffic record);
}