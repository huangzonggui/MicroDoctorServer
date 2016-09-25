package com.zhuolang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhuolang.dao.impl.UserModelDao;
import com.zhuolang.model.UserModel;
import com.zhuolang.service.IUserModelService;

@Service("userModelService")
public class UserModelService implements IUserModelService {

	@Autowired
	UserModelDao userModelDao;
	
	@Override
	public void addUserModel(UserModel userModel) {
		// TODO Auto-generated method stub
		try {
			userModelDao.save(userModel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
