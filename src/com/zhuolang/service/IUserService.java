package com.zhuolang.service;

import org.springframework.stereotype.Service;

import com.zhuolang.model.User;
/**
 * 用户服务类接口，根据业务逻辑进行设置
 * @author jat
 *
 */
@Service
public interface IUserService {
	public void addUser(User user);
}
