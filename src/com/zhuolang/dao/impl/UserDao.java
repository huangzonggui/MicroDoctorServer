package com.zhuolang.dao.impl;


import org.springframework.stereotype.Repository;

import com.zhuolang.dao.IUserDao;
import com.zhuolang.model.User;

/**
 * 用户持久层实现类,进行数据持久操作
 *
 * @author jat
 *
 */
@Repository("userDao")
public class UserDao extends BaseDao<User> implements IUserDao {
	
}
