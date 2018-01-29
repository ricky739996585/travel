package com.ricky.travel.voDao;

import com.ricky.travel.domain.PhotoVO;
import com.ricky.travel.domain.PhotoVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoVOMapper {
    int countByExample(PhotoVOExample example);

    int deleteByExample(PhotoVOExample example);

    int deleteByPrimaryKey(Integer scenicPhotoId);

    int insert(PhotoVO record);

    int insertSelective(PhotoVO record);

    List<PhotoVO> selectByExampleWithBLOBs(PhotoVOExample example);

    List<PhotoVO> selectByExample(PhotoVOExample example);

    PhotoVO selectByPrimaryKey(Integer scenicPhotoId);

    int updateByExampleSelective(@Param("record") PhotoVO record, @Param("example") PhotoVOExample example);

    int updateByExampleWithBLOBs(@Param("record") PhotoVO record, @Param("example") PhotoVOExample example);

    int updateByExample(@Param("record") PhotoVO record, @Param("example") PhotoVOExample example);

    int updateByPrimaryKeySelective(PhotoVO record);

    int updateByPrimaryKeyWithBLOBs(PhotoVO record);

    int updateByPrimaryKey(PhotoVO record);
}