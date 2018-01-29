package com.ricky.travel.voDao;

import com.ricky.travel.domain.DataVO;
import com.ricky.travel.domain.DataVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DataVOMapper {
    int countByExample(DataVOExample example);

    int deleteByExample(DataVOExample example);

    int deleteByPrimaryKey(Integer dataId);

    int insert(DataVO record);

    int insertSelective(DataVO record);

    List<DataVO> selectByExampleWithBLOBs(DataVOExample example);

    List<DataVO> selectByExample(DataVOExample example);

    DataVO selectByPrimaryKey(Integer dataId);

    int updateByExampleSelective(@Param("record") DataVO record, @Param("example") DataVOExample example);

    int updateByExampleWithBLOBs(@Param("record") DataVO record, @Param("example") DataVOExample example);

    int updateByExample(@Param("record") DataVO record, @Param("example") DataVOExample example);

    int updateByPrimaryKeySelective(DataVO record);

    int updateByPrimaryKeyWithBLOBs(DataVO record);

    int updateByPrimaryKey(DataVO record);
}