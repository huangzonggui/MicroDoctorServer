package com.zhuolang.service;

import com.zhuolang.model.Send;

import java.util.List;

/**
 * Created by hzg on 2016/10/13.
 */
public interface ISendService {
    void addSend(Send send);
    void updateSend(Send send);
    List<Send> findSend(String sql);
    void deleteSend(List<Send> findSend);

}
