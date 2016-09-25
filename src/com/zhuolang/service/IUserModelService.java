package com.zhuolang.service;

import org.springframework.stereotype.Service;

import com.zhuolang.model.UserModel;

@Service
public interface IUserModelService {

	public void addUserModel(UserModel userModel);
}
