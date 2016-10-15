package com.zhuolang.service.impl;

import com.zhuolang.dao.IDiscussDao;
import com.zhuolang.model.Discuss;
import com.zhuolang.service.IDiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hzg on 2016/10/15.
 */
@Service("discussService")
public class DiscussService implements IDiscussService {
    @Autowired
    IDiscussDao dao;

    @Override
    public void addDiscuss(Discuss discuss) {
        dao.save(discuss);
    }

    @Override
    public void updateDiscuss(Discuss discuss) {
        dao.update(discuss);
    }

    @Override
    public List<Discuss> findDiscuss(String hql) {
        return dao.find(hql);
    }

    @Override
    public void deleteDiscuss(List<Discuss> findDiscuss) {
        List<Discuss> list = findDiscuss;
        if (list != null && list.size() > 0) {
            for (int i=0;i<list.size();i++) {
                dao.delete(list.get(i));
            }
        }
    }
}
