package com.zhuolang.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import com.zhuolang.dao.IUserDao;
import com.zhuolang.model.User;
import com.zhuolang.service.IUserService;
@Component
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })  
public class UserTest {

	@Autowired
	IUserService service;
	@Test
	public void test() {
		System.out.println("service:"+service);
		User user = new User();
		user.setName("aaa");
		service.addUser(user);
	}

}
