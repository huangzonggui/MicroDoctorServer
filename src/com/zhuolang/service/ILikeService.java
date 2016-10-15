package com.zhuolang.service;

import com.zhuolang.model.Like;

import java.util.List;

/**
 * Created by hzg on 2016/10/14.
 */
public interface ILikeService {
    void addLike(Like like);
    void updateLike(Like like);
    List<Like> findLike(String hql);
    void deleteLike(List<Like> findLike);
}
