package com.zhuolang.service.impl;

import com.zhuolang.dao.ISendDao;
import com.zhuolang.model.Send;
import com.zhuolang.service.ISendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hzg on 2016/10/13.
 */
@Service("sendService")
public class SendService implements ISendService {

    @Autowired
    ISendDao dao;

    @Override
    public void addSend(Send send) {
        dao.save(send);
    }

    @Override
    public void updateSend(Send send) {
        dao.update(send);
    }

    @Override
    public List<Send> findSend(String sql) {
        return dao.find(sql);
    }

    @Override
    public void deleteSend(List<Send> findSend) {
        List<Send> list = findSend;
        if (list != null && list.size() > 0) {
           for (int i = 0; i < list.size(); i++) {
                dao.delete(list.get(i));
            }
        }
    }
}
