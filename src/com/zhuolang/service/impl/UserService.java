package com.zhuolang.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhuolang.dao.IUserDao;
import com.zhuolang.model.User;
import com.zhuolang.service.IUserService;
/**
 * 用户服务实现类，实现业务逻辑功能
 * @author jat
 *
 */
@Service("userService")
public class UserService implements IUserService {

	//注入服务层，操作数据持久化
	@Autowired
	IUserDao dao;
	/**
	 * 业务逻辑操作
	 */
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		try {
			dao.save(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
