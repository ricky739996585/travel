package com.ricky.travel.voDao;

import com.ricky.travel.domain.ArticleVO;
import com.ricky.travel.domain.ArticleVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleVOMapper {
    int countByExample(ArticleVOExample example);

    int deleteByExample(ArticleVOExample example);

    int deleteByPrimaryKey(Integer articleId);

    int insert(ArticleVO record);

    int insertSelective(ArticleVO record);

    List<ArticleVO> selectByExampleWithBLOBs(ArticleVOExample example);

    List<ArticleVO> selectByExample(ArticleVOExample example);

    ArticleVO selectByPrimaryKey(Integer articleId);

    int updateByExampleSelective(@Param("record") ArticleVO record, @Param("example") ArticleVOExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleVO record, @Param("example") ArticleVOExample example);

    int updateByExample(@Param("record") ArticleVO record, @Param("example") ArticleVOExample example);

    int updateByPrimaryKeySelective(ArticleVO record);

    int updateByPrimaryKeyWithBLOBs(ArticleVO record);

    int updateByPrimaryKey(ArticleVO record);
}