package com.ricky.travel.dao;

import com.ricky.travel.domain.ScenicLikeRecord;
import com.ricky.travel.domain.ScenicLikeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ScenicLikeRecordMapper {
    int countByExample(ScenicLikeRecordExample example);

    int deleteByExample(ScenicLikeRecordExample example);

    int deleteByPrimaryKey(Integer scenicRecordId);

    int insert(ScenicLikeRecord record);

    int insertSelective(ScenicLikeRecord record);

    List<ScenicLikeRecord> selectByExample(ScenicLikeRecordExample example);

    ScenicLikeRecord selectByPrimaryKey(Integer scenicRecordId);

    int updateByExampleSelective(@Param("record") ScenicLikeRecord record, @Param("example") ScenicLikeRecordExample example);

    int updateByExample(@Param("record") ScenicLikeRecord record, @Param("example") ScenicLikeRecordExample example);

    int updateByPrimaryKeySelective(ScenicLikeRecord record);

    int updateByPrimaryKey(ScenicLikeRecord record);
}