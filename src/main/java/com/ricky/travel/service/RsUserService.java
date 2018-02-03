package com.ricky.travel.service;

import com.ricky.travel.datatable.DataTablesRequest;
import com.ricky.travel.datatable.DataTablesResponse;
import com.ricky.travel.domain.RsUser;

public interface RsUserService {
    public DataTablesResponse<RsUser> getAll(DataTablesRequest request);

    public RsUser getRsUser(Integer rsUserId);
}
