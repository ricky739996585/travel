package com.ricky.travel.dao;

import com.ricky.travel.domain.ArticleLikeRecord;
import com.ricky.travel.domain.ArticleLikeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleLikeRecordMapper {
    int countByExample(ArticleLikeRecordExample example);

    int deleteByExample(ArticleLikeRecordExample example);

    int deleteByPrimaryKey(Integer articleRecordId);

    int insert(ArticleLikeRecord record);

    int insertSelective(ArticleLikeRecord record);

    List<ArticleLikeRecord> selectByExample(ArticleLikeRecordExample example);

    ArticleLikeRecord selectByPrimaryKey(Integer articleRecordId);

    int updateByExampleSelective(@Param("record") ArticleLikeRecord record, @Param("example") ArticleLikeRecordExample example);

    int updateByExample(@Param("record") ArticleLikeRecord record, @Param("example") ArticleLikeRecordExample example);

    int updateByPrimaryKeySelective(ArticleLikeRecord record);

    int updateByPrimaryKey(ArticleLikeRecord record);
}