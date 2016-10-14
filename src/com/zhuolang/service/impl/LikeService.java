package com.zhuolang.service.impl;

import com.zhuolang.dao.ILikeDao;
import com.zhuolang.model.Like;
import com.zhuolang.service.ILikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hzg on 2016/10/14.
 */
@Service("likeService")
public class LikeService implements ILikeService {

    @Autowired
    ILikeDao dao;

    @Override
    public void addLike(Like like) {
        dao.save(like);
    }

    @Override
    public void updateLike(Like like) {
        dao.update(like);
    }

    @Override
    public List<Like> findLike(String hql) {
        return dao.find(hql);
    }

    @Override
    public void deleteLike(List<Like> findLike) {
        List<Like> list = findLike;
        if (list != null && list.size() > 0) {
            for (int i=0;i<list.size();i++) {
                dao.delete(list.get(i));
            }
        }
    }
}
