package com.zhuolang.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhuolang.model.User;
import com.zhuolang.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@Component
@ContextConfiguration(locations = { "file:WebRoot/WEB-INF/applicationContext.xml"})  
//@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class UserTest {

	@Autowired
	IUserService service;
	@Test
	public void testadd() {
		System.out.println("service:"+service);
		User user = new User();
		user.setNickname("nickname");
		user.setPassword("123456");
		user.setName("黄宗贵");
		user.setAge(18);
		user.setGender(1);
		user.setPhone("18925060991");
		user.setAddress("廉江");
		user.setSignature("道不同，不相为谋");
		user.setIntroduction("大家好，我叫黄阿贵jaslfjlajflajsfajsd|");
		user.setType(1);

		service.addUser(user);
	}
	
	@Test
	public void testdelete() {
		service.deleteUser(15);
	}
	
	@Test
	public void testupdate(){
		User user = new User();
		// 根据主键id来更新信息，将整个user传到数据库，通过id找到要更新的user
		user.setId(12);
		user.setNickname("nickname");
		user.setPassword("123456");
		user.setName("吴乃福");
		user.setAge(18);
		user.setGender(1);
		user.setPhone("18925060991");
		user.setAddress("廉江");
		user.setSignature("道不同，不相为谋");
		user.setIntroduction("大家好，我叫吴乃福jaslfjlajflajsfajsd");
		user.setType(0);
		service.updateUser(user);
	}
	
	@Test
	public void testfind(){
		List<User> list = service.findUser();
		System.out.println(list);
	}

}
