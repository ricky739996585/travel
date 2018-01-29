package com.ricky.travel.dao;

import com.ricky.travel.domain.RsUser;
import com.ricky.travel.domain.RsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RsUserMapper {
    int countByExample(RsUserExample example);

    int deleteByExample(RsUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(RsUser record);

    int insertSelective(RsUser record);

    List<RsUser> selectByExample(RsUserExample example);

    RsUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") RsUser record, @Param("example") RsUserExample example);

    int updateByExample(@Param("record") RsUser record, @Param("example") RsUserExample example);

    int updateByPrimaryKeySelective(RsUser record);

    int updateByPrimaryKey(RsUser record);
}