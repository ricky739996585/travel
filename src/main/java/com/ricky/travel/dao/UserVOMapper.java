package com.ricky.travel.dao;

import java.util.List;

import com.ricky.travel.domain.UserVO;
import com.ricky.travel.domain.UserVOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserVOMapper {
    int countByExample(UserVOExample example);

    int deleteByExample(UserVOExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserVO record);

    int insertSelective(UserVO record);

    List<UserVO> selectByExample(UserVOExample example);

    UserVO selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserVO record, @Param("example") UserVOExample example);

    int updateByExample(@Param("record") UserVO record, @Param("example") UserVOExample example);

    int updateByPrimaryKeySelective(UserVO record);

    int updateByPrimaryKey(UserVO record);
}