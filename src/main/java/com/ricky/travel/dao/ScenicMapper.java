package com.ricky.travel.dao;

import com.ricky.travel.domain.Scenic;
import com.ricky.travel.domain.ScenicExample;
import com.ricky.travel.domain.ScenicWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ScenicMapper {
    int countByExample(ScenicExample example);

    int deleteByExample(ScenicExample example);

    int deleteByPrimaryKey(Integer scenicId);

    int insert(ScenicWithBLOBs record);

    int insertSelective(ScenicWithBLOBs record);

    List<ScenicWithBLOBs> selectByExampleWithBLOBs(ScenicExample example);

    List<Scenic> selectByExample(ScenicExample example);

    ScenicWithBLOBs selectByPrimaryKey(Integer scenicId);

    int updateByExampleSelective(@Param("record") ScenicWithBLOBs record, @Param("example") ScenicExample example);

    int updateByExampleWithBLOBs(@Param("record") ScenicWithBLOBs record, @Param("example") ScenicExample example);

    int updateByExample(@Param("record") Scenic record, @Param("example") ScenicExample example);

    int updateByPrimaryKeySelective(ScenicWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ScenicWithBLOBs record);

    int updateByPrimaryKey(Scenic record);
}