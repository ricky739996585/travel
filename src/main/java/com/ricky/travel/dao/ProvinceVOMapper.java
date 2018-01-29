package com.ricky.travel.dao;

import java.util.List;

import com.ricky.travel.domain.ProvinceVO;
import com.ricky.travel.domain.ProvinceVOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceVOMapper {
    int countByExample(ProvinceVOExample example);

    int deleteByExample(ProvinceVOExample example);

    int deleteByPrimaryKey(Integer provinceId);

    int insert(ProvinceVO record);

    int insertSelective(ProvinceVO record);

    List<ProvinceVO> selectByExample(ProvinceVOExample example);

    ProvinceVO selectByPrimaryKey(Integer provinceId);

    int updateByExampleSelective(@Param("record") ProvinceVO record, @Param("example") ProvinceVOExample example);

    int updateByExample(@Param("record") ProvinceVO record, @Param("example") ProvinceVOExample example);

    int updateByPrimaryKeySelective(ProvinceVO record);

    int updateByPrimaryKey(ProvinceVO record);
}