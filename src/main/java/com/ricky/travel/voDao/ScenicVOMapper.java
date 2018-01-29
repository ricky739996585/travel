package com.ricky.travel.voDao;

import com.ricky.travel.domain.ScenicVO;
import com.ricky.travel.domain.ScenicVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ScenicVOMapper {
    int countByExample(ScenicVOExample example);

    int deleteByExample(ScenicVOExample example);

    int deleteByPrimaryKey(Integer scenicId);

    int insert(ScenicVO record);

    int insertSelective(ScenicVO record);

    List<ScenicVO> selectByExampleWithBLOBs(ScenicVOExample example);

    List<ScenicVO> selectByExample(ScenicVOExample example);

    ScenicVO selectByPrimaryKey(Integer scenicId);

    int updateByExampleSelective(@Param("record") ScenicVO record, @Param("example") ScenicVOExample example);

    int updateByExampleWithBLOBs(@Param("record") ScenicVO record, @Param("example") ScenicVOExample example);

    int updateByExample(@Param("record") ScenicVO record, @Param("example") ScenicVOExample example);

    int updateByPrimaryKeySelective(ScenicVO record);

    int updateByPrimaryKeyWithBLOBs(ScenicVO record);

    int updateByPrimaryKey(ScenicVO record);
}