package com.zhuolang.dao.impl;

import com.zhuolang.dao.IDiscussDao;
import com.zhuolang.model.Discuss;
import org.springframework.stereotype.Repository;

/**
 * Created by hzg on 2016/10/15.
 */
@Repository("discussDao")
public class DiscussDao extends BaseDao<Discuss> implements IDiscussDao {
}
