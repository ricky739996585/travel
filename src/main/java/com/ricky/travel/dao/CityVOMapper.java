package com.ricky.travel.dao;

import java.util.List;

import com.ricky.travel.domain.CityVO;
import com.ricky.travel.domain.CityVOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CityVOMapper {
    int countByExample(CityVOExample example);

    int deleteByExample(CityVOExample example);

    int deleteByPrimaryKey(Integer cityId);

    int insert(CityVO record);

    int insertSelective(CityVO record);

    List<CityVO> selectByExample(CityVOExample example);

    CityVO selectByPrimaryKey(Integer cityId);

    int updateByExampleSelective(@Param("record") CityVO record, @Param("example") CityVOExample example);

    int updateByExample(@Param("record") CityVO record, @Param("example") CityVOExample example);

    int updateByPrimaryKeySelective(CityVO record);

    int updateByPrimaryKey(CityVO record);
}