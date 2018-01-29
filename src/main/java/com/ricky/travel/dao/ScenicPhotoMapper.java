package com.ricky.travel.dao;

import com.ricky.travel.domain.ScenicPhoto;
import com.ricky.travel.domain.ScenicPhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ScenicPhotoMapper {
    int countByExample(ScenicPhotoExample example);

    int deleteByExample(ScenicPhotoExample example);

    int deleteByPrimaryKey(Integer scenicPhotoId);

    int insert(ScenicPhoto record);

    int insertSelective(ScenicPhoto record);

    List<ScenicPhoto> selectByExampleWithBLOBs(ScenicPhotoExample example);

    List<ScenicPhoto> selectByExample(ScenicPhotoExample example);

    ScenicPhoto selectByPrimaryKey(Integer scenicPhotoId);

    int updateByExampleSelective(@Param("record") ScenicPhoto record, @Param("example") ScenicPhotoExample example);

    int updateByExampleWithBLOBs(@Param("record") ScenicPhoto record, @Param("example") ScenicPhotoExample example);

    int updateByExample(@Param("record") ScenicPhoto record, @Param("example") ScenicPhotoExample example);

    int updateByPrimaryKeySelective(ScenicPhoto record);

    int updateByPrimaryKeyWithBLOBs(ScenicPhoto record);

    int updateByPrimaryKey(ScenicPhoto record);
}