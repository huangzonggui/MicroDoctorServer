package com.zhuolang.dao.impl;

import org.springframework.stereotype.Repository;

import com.zhuolang.dao.IUserModelDao;
import com.zhuolang.model.UserModel;

/**
 * 用户持久层实现类,进行数据持久操作
 * 
 * @author gui
 *
 */
@Repository("userModelDao")
public class UserModelDao extends BaseDao<UserModel> implements IUserModelDao {

}
