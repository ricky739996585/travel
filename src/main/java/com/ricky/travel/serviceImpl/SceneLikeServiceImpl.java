package com.ricky.travel.serviceImpl;

import com.ricky.travel.dao.ScenicLikeRecordMapper;
import com.ricky.travel.domain.ScenicLikeRecord;
import com.ricky.travel.domain.ScenicLikeRecordExample;
import com.ricky.travel.service.SceneLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ricky on 2018/3/25 0025
 */
@Service
public class SceneLikeServiceImpl implements SceneLikeService{

    @Autowired
    private ScenicLikeRecordMapper scenicLikeRecordMapper;


    @Override
    public List<ScenicLikeRecord> getLikeRecord(Integer id) {
        return null;
    }

    @Override
    public int insert(List<ScenicLikeRecord> list) {
        return 0;
    }

    @Override
    public void update(List<ScenicLikeRecord> list) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public int getLikeCount(Integer sceneId) {
        ScenicLikeRecordExample scenicLikeRecordExample = new ScenicLikeRecordExample();
        scenicLikeRecordExample.createCriteria().andScenicRecordScenicIdEqualTo(sceneId);

        int count=scenicLikeRecordMapper.countByExample(scenicLikeRecordExample);
        return count;
    }
}
