package com.ricky.travel.voDao;

import com.ricky.travel.domain.DivideVO;
import com.ricky.travel.domain.DivideVOExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DivideVOMapper {
    int countByExample(DivideVOExample example);

    int deleteByExample(DivideVOExample example);

    int deleteByPrimaryKey(Integer divideId);

    int insert(DivideVO record);

    int insertSelective(DivideVO record);

    List<DivideVO> selectByExample(DivideVOExample example);

    DivideVO selectByPrimaryKey(Integer divideId);

    int updateByExampleSelective(@Param("record") DivideVO record, @Param("example") DivideVOExample example);

    int updateByExample(@Param("record") DivideVO record, @Param("example") DivideVOExample example);

    int updateByPrimaryKeySelective(DivideVO record);

    int updateByPrimaryKey(DivideVO record);
}