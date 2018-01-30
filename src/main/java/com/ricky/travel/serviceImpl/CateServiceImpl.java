package com.ricky.travel.serviceImpl;

import com.ricky.travel.dao.CateVOMapper;
import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.domain.CateVO;
import com.ricky.travel.domain.CateVOExample;
import com.ricky.travel.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CateServiceImpl implements CateService {
    @Autowired
    public CateVOMapper cateVOMapper;

    @Override
    public DataTablesResponse<CateVO> getAll(DataTablesRequest request) {
        DataTablesResponse<CateVO> response=new DataTablesResponse<>();
        CateVOExample example=new CateVOExample();
        example.createCriteria().andCateIdIsNotNull();

        CateVOExample example2=new CateVOExample();
        example2.setOffset(request.getStart());
        example2.setLimit(request.getLength());
        String order=null;
        if(request.getOrder()!=null){
            switch (request.getOrder().get(0).getColumn()){
                default:
                    order="Cate_Id";
                    break;
            }
        }
        example2.setOrderByClause(order);
        example2.setOrderByDirection(request.getOrder().get(0).getDir());
        Map<String,Object> search=request.getSearchColumns();
        if(search!=null){
            if(!search.get("searchName").toString().equals("")){
                String key="%"+search.get("searchName").toString()+"%";
                example2.createCriteria().andCateNameLike(key);
            }
        }
        response.setDraw(request.getDraw());
        response.setRecordsTotal(cateVOMapper.countByExample(example2));
        response.setData(cateVOMapper.selectByExampleWithBLOBs(example2));
        return response;
    }

    @Override
    public CateVO getCate(Integer id) {

        return cateVOMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(CateVO cateVO) {
        cateVOMapper.insertSelective(cateVO);
        int id=cateVO.getCateId();
        return id;
    }

    @Override
    public void update(CateVO cateVO) {
        cateVOMapper.updateByPrimaryKeySelective(cateVO);
    }

    @Override
    public void delete(Integer id) {
        cateVOMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Map<String, Object> selectByPrimaryKeyWithCity(Integer cateId) {

        return cateVOMapper.selectByPrimaryKeyWithCity(cateId);
    }
}
