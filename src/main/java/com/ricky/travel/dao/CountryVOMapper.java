package com.ricky.travel.dao;

import java.util.List;

import com.ricky.travel.domain.CountryVO;
import com.ricky.travel.domain.CountryVOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryVOMapper {
    int countByExample(CountryVOExample example);

    int deleteByExample(CountryVOExample example);

    int deleteByPrimaryKey(Integer countryId);

    int insert(CountryVO record);

    int insertSelective(CountryVO record);

    List<CountryVO> selectByExample(CountryVOExample example);

    CountryVO selectByPrimaryKey(Integer countryId);

    int updateByExampleSelective(@Param("record") CountryVO record, @Param("example") CountryVOExample example);

    int updateByExample(@Param("record") CountryVO record, @Param("example") CountryVOExample example);

    int updateByPrimaryKeySelective(CountryVO record);

    int updateByPrimaryKey(CountryVO record);
}