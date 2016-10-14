package com.zhuolang.dao.impl;

import com.zhuolang.dao.ILikeDao;
import com.zhuolang.model.Like;
import org.springframework.stereotype.Repository;

/**
 * Created by hzg on 2016/10/14.
 */
@Repository("likeDao")
public class LikeDao extends BaseDao<Like> implements ILikeDao {

}
