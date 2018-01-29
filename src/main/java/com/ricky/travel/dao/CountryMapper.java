package com.ricky.travel.dao;

import com.ricky.travel.domain.Country;
import com.ricky.travel.domain.CountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryMapper {
    int countByExample(CountryExample example);

    int deleteByExample(CountryExample example);

    int deleteByPrimaryKey(Integer countryId);

    int insert(Country record);

    int insertSelective(Country record);

    List<Country> selectByExample(CountryExample example);

    Country selectByPrimaryKey(Integer countryId);

    int updateByExampleSelective(@Param("record") Country record, @Param("example") CountryExample example);

    int updateByExample(@Param("record") Country record, @Param("example") CountryExample example);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);
}