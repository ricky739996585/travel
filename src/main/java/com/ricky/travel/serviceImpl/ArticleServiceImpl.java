package com.ricky.travel.serviceImpl;

import com.ricky.travel.dao.ArticleVOMapper;
import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.domain.ArticleVO;
import com.ricky.travel.domain.ArticleVOExample;
import com.ricky.travel.service.ArticleService;
import com.ricky.travel.utils.commons.FormatTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    public ArticleVOMapper articleVOMapper;

    @Override
    public DataTablesResponse<Map<String, Object>> getAll(DataTablesRequest request) {
        DataTablesResponse<Map<String, Object>> response=new DataTablesResponse<>();
        ArticleVOExample example=new ArticleVOExample();
        example.setOffset(request.getStart());
        example.setLimit(request.getLength());
        String order=null;
        if(request.getOrder()!=null){
            switch (request.getOrder().get(0).getColumn()){
                case 3:
                    order="Article_Date";
                    break;
                default:
                    order="Article_Id";
                    break;
            }
        }
        example.setOrderByClause(order);
        example.setOrderByDirection(request.getOrder().get(0).getDir());
        Map<String,Object> search=request.getSearchColumns();
        if(search!=null){
            String key_1=null;
            String key_2=null;
            String key_3=null;
            if(!search.get("userName").toString().equals("")){
                key_1="%"+search.get("userName").toString()+"%";
            }
            if(!search.get("articleName").toString().equals("")){
                key_2="%"+search.get("articleName").toString()+"%";
            }
            if(!search.get("tagName").toString().equals("0")){
                key_3=search.get("tagName").toString();
            }

            if(null!=key_1&&null!=key_2&&null!=key_3){
                example.createCriteria().andUserNameLike(key_1).andArticleNameLike(key_2).andArticleTagLike(key_3).andArticlePassEqualTo(0);
            }else if(null!=key_1&&null!=key_2){
                example.createCriteria().andUserNameLike(key_1).andArticleNameLike(key_2).andArticlePassEqualTo(0);
            }else if(null!=key_1&&null!=key_3){
                example.createCriteria().andUserNameLike(key_1).andArticleTagLike(key_3).andArticlePassEqualTo(0);
            }else if(null!=key_2&&null!=key_3){
                example.createCriteria().andArticleNameLike(key_2).andArticleTagLike(key_3).andArticlePassEqualTo(0);
            }else if(null!=key_1){
                example.createCriteria().andUserNameLike(key_1).andArticlePassEqualTo(0);
            }else if(null!=key_2){
                example.createCriteria().andArticleNameLike(key_2).andArticlePassEqualTo(0);
            }else if(null!=key_3){
                example.createCriteria().andArticleTagLike(key_3).andArticlePassEqualTo(0);
            }else {
                example.createCriteria().andArticlePassEqualTo(0);
            }
        }
        List<Map<String,Object>> list=articleVOMapper.selectArticleById(example);
        for (Map<String,Object> apply:list){
            String articleDate= FormatTool.formatDate((Date) apply.get("articleDate"));
            apply.replace("articleDate", articleDate);
        }
        response.setDraw(request.getDraw());
        response.setRecordsTotal(list.size());
        response.setData(list);
        return response;
    }

    @Override
    public List<Map<String, Object>> getArticleByArticleId(Integer articleId) {
        return articleVOMapper.getDataByArticleId(articleId);
    }

    @Override
    public void passArticle(ArticleVO articleVO) {
        //状态码：0代表未审核，1代表审核通过，2代表审核不通过
        articleVO.setArticlePass(1);
        articleVOMapper.updateByPrimaryKeySelective(articleVO);
    }

    @Override
    public void notPassArticle(ArticleVO articleVO) {
        articleVO.setArticlePass(2);
        articleVOMapper.updateByPrimaryKeySelective(articleVO);
    }
}
