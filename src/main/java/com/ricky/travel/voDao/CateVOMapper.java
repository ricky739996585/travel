package com.ricky.travel.voDao;

import com.ricky.travel.domain.CateVO;
import com.ricky.travel.domain.CateVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CateVOMapper {
    int countByExample(CateVOExample example);

    int deleteByExample(CateVOExample example);

    int deleteByPrimaryKey(Integer cateId);

    int insert(CateVO record);

    int insertSelective(CateVO record);

    List<CateVO> selectByExampleWithBLOBs(CateVOExample example);

    List<CateVO> selectByExample(CateVOExample example);

    CateVO selectByPrimaryKey(Integer cateId);

    int updateByExampleSelective(@Param("record") CateVO record, @Param("example") CateVOExample example);

    int updateByExampleWithBLOBs(@Param("record") CateVO record, @Param("example") CateVOExample example);

    int updateByExample(@Param("record") CateVO record, @Param("example") CateVOExample example);

    int updateByPrimaryKeySelective(CateVO record);

    int updateByPrimaryKeyWithBLOBs(CateVO record);

    int updateByPrimaryKey(CateVO record);
}