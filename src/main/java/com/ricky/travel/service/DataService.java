package com.ricky.travel.service;

import com.ricky.travel.domain.DataVO;

/**
 * Created by ricky on 2018/4/6 0006
 */
public interface DataService {
    public DataVO getData(Integer id);

    public int insert(DataVO dataVO);

    public void update(DataVO dataVO);

    public void delete(Integer id);

}
