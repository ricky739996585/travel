package com.ricky.travel.serviceImpl;

import com.ricky.travel.dao.DataVOMapper;
import com.ricky.travel.domain.DataVO;
import com.ricky.travel.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ricky on 2018/4/6 0006
 */
@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private DataVOMapper dataVOMapper;

    @Override
    public DataVO getData(Integer id) {
        return dataVOMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(DataVO dataVO) {
        dataVOMapper.insertSelective(dataVO);
        return dataVO.getDataId();
    }

    @Override
    public void update(DataVO dataVO) {
        dataVOMapper.updateByPrimaryKeySelective(dataVO);
    }

    @Override
    public void delete(Integer id) {
        dataVOMapper.deleteByPrimaryKey(id);
    }
}
