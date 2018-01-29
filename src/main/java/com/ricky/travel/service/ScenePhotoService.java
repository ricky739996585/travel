package com.ricky.travel.service;

import com.ricky.travel.domain.ScenicPhoto;

import java.util.List;

public interface ScenePhotoService {
    public List<ScenicPhoto> getPhotoes(Integer id);

    public int insert(List<ScenicPhoto> list);

    public void update(List<ScenicPhoto> list);

    public void delete(Integer id);
}
