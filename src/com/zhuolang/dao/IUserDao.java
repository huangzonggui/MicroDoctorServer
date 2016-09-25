package com.zhuolang.dao;

import com.zhuolang.model.User;
/**
 * 用户dao层操作，继承basedao，根据业务逻辑对此进行扩展
 * @author jat
 *
 */
public interface IUserDao extends IBaseDao<User>{
	public void delete(int id);
//	public void update(String name, User user);
}
