package com.ricky.travel.serviceImpl;

import com.ricky.travel.dao.ScenicPhotoMapper;
import com.ricky.travel.dao.TrafficVOMapper;
import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.domain.ScenicPhoto;
import com.ricky.travel.domain.ScenicVO;
import com.ricky.travel.domain.ScenicVOExample;
import com.ricky.travel.domain.TrafficVO;
import com.ricky.travel.service.SceneService;
import com.ricky.travel.dao.ScenicVOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Map;
@Service
public class SceneServiceImpl implements SceneService {
    @Autowired
    public ScenicVOMapper scenicVOMapper;
    @Autowired
    public TrafficVOMapper trafficVOMapper;
    @Autowired
    public ScenicPhotoMapper scenicPhotoMapper;


    @Override
    public DataTablesResponse<ScenicVO> getAll(DataTablesRequest request) {
        DataTablesResponse<ScenicVO> response=new DataTablesResponse<>();
        ScenicVOExample example=new ScenicVOExample();
        example.createCriteria().andScenicIdIsNotNull();

        ScenicVOExample example2=new ScenicVOExample();
        example2.setOffset(request.getStart());
        example2.setLimit(request.getLength());
        String order=null;
        if(request.getOrder()!=null){
            switch (request.getOrder().get(0).getColumn()){
                case 3:
                    order="Scenic_Cost";
                    break;
                default:
                    order="Scenic_Id";
                    break;
            }
        }
        example2.setOrderByClause(order);
        example2.setOrderByDirection(request.getOrder().get(0).getDir());
        Map<String,Object> search=request.getSearchColumns();
        if(search!=null){
            if(!search.get("searchName").toString().equals("")){
                String key="%"+search.get("searchName").toString()+"%";
                example2.createCriteria().andScenicNameLike(key);
            }
            if(!search.get("tagName").toString().equals("0")){
                String key=search.get("tagName").toString();
                example2.createCriteria().andScenicTagEqualTo(key);
            }
        }
        response.setDraw(request.getDraw());
        response.setRecordsTotal(scenicVOMapper.countByExample(example2));
        response.setData(scenicVOMapper.selectByExampleWithBLOBs(example2));
        return response;
    }

    @Override
    public ScenicVO getScenic(Integer id) {
        return scenicVOMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(ScenicVO scenicVO, TrafficVO trafficVO) {
        scenicVOMapper.insertSelective(scenicVO);
        int id=scenicVO.getScenicId();
        trafficVO.setScenicId(id);
        trafficVOMapper.insertSelective(trafficVO);
        return id;
    }

    @Override
    public void update(ScenicVO scenicVO,TrafficVO trafficVO) {
        scenicVOMapper.updateByPrimaryKeySelective(scenicVO);
        trafficVO.setScenicId(scenicVO.getScenicId());
        trafficVOMapper.updateByPrimaryKeySelective(trafficVO);
    }

    @Override
    public void delete(Integer id) {
        scenicVOMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Map<String, Object> getScenicAndTraffic(Integer id) {
        return scenicVOMapper.selectByPrimaryKeyWithTraffic(id);
    }
}
