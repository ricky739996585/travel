package com.ricky.travel.dao;

import com.ricky.travel.domain.Cate;
import com.ricky.travel.domain.CateExample;
import com.ricky.travel.domain.CateWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CateMapper {
    int countByExample(CateExample example);

    int deleteByExample(CateExample example);

    int deleteByPrimaryKey(Integer cateId);

    int insert(CateWithBLOBs record);

    int insertSelective(CateWithBLOBs record);

    List<CateWithBLOBs> selectByExampleWithBLOBs(CateExample example);

    List<Cate> selectByExample(CateExample example);

    CateWithBLOBs selectByPrimaryKey(Integer cateId);

    int updateByExampleSelective(@Param("record") CateWithBLOBs record, @Param("example") CateExample example);

    int updateByExampleWithBLOBs(@Param("record") CateWithBLOBs record, @Param("example") CateExample example);

    int updateByExample(@Param("record") Cate record, @Param("example") CateExample example);

    int updateByPrimaryKeySelective(CateWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CateWithBLOBs record);

    int updateByPrimaryKey(Cate record);
}