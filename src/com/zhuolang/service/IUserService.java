package com.zhuolang.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhuolang.model.User;
/**
 * 用户服务类接口，根据业务逻辑进行设置
 * @author jat
 *
 */
//@Service
public interface IUserService {
	void addUser(User user);
	void updateUser(User user);
	List<User> findUser(String hql);
	void deleteUser(List<User> findUser);
}
