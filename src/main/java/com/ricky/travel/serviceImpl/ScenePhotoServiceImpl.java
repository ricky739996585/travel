package com.ricky.travel.serviceImpl;

import com.ricky.travel.dao.ScenicPhotoMapper;
import com.ricky.travel.domain.ScenicPhoto;
import com.ricky.travel.domain.ScenicPhotoExample;
import com.ricky.travel.service.ScenePhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class ScenePhotoServiceImpl implements ScenePhotoService {
    @Autowired
    public ScenicPhotoMapper scenicPhotoMapper;

    @Override
    public List<ScenicPhoto> getPhotoes(Integer id) {
        ScenicPhotoExample example=new ScenicPhotoExample();
        example.createCriteria().andScenicIdEqualTo(id);
        return scenicPhotoMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public int insert(List<ScenicPhoto> list) {
        for(ScenicPhoto photo : list){
            photo.setScenicPhotoDate(new Date(System.currentTimeMillis()));
            scenicPhotoMapper.insertSelective(photo);
        }
        return 0;
    }

    @Override
    public void update(List<ScenicPhoto> list) {
        for(ScenicPhoto photo : list){
            photo.setScenicPhotoDate(new Date(System.currentTimeMillis()));
            scenicPhotoMapper.updateByPrimaryKeySelective(photo);
        }
    }

    @Override
    public void delete(Integer id) {
        scenicPhotoMapper.deleteByPrimaryKey(id);
    }
}
