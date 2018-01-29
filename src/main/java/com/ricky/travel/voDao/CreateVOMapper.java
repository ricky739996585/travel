package com.ricky.travel.voDao;

import com.ricky.travel.domain.CreateVO;
import com.ricky.travel.domain.CreateVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateVOMapper {
    int countByExample(CreateVOExample example);

    int deleteByExample(CreateVOExample example);

    int deleteByPrimaryKey(Integer createId);

    int insert(CreateVO record);

    int insertSelective(CreateVO record);

    List<CreateVO> selectByExample(CreateVOExample example);

    CreateVO selectByPrimaryKey(Integer createId);

    int updateByExampleSelective(@Param("record") CreateVO record, @Param("example") CreateVOExample example);

    int updateByExample(@Param("record") CreateVO record, @Param("example") CreateVOExample example);

    int updateByPrimaryKeySelective(CreateVO record);

    int updateByPrimaryKey(CreateVO record);
}