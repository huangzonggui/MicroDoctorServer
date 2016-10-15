package com.zhuolang.service;

import com.zhuolang.model.Discuss;

import java.util.List;

/**
 * Created by hzg on 2016/10/15.
 */
public interface IDiscussService {
    void addDiscuss(Discuss discuss);
    void updateDiscuss(Discuss discuss);
    List<Discuss> findDiscuss(String hql);
    void deleteDiscuss(List<Discuss> findDiscuss);
}
