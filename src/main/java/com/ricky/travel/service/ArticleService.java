package com.ricky.travel.service;

import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.domain.ArticleVO;

import java.util.List;
import java.util.Map;

public interface ArticleService {
    public DataTablesResponse<Map<String,Object>> getAll(DataTablesRequest request);

    public List<Map<String,Object>> getArticleByArticleId(Integer articleId);

    public void passArticle(ArticleVO articleVO);

    public void notPassArticle(ArticleVO articleVO);

    public List<ArticleVO> getArticleBySearch(String search,int offset,int limit);

    public int getCountBySearch(String search);

    public int getLikeRecordByArticleId(int articleId);
}
