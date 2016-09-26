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
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class UserTest {

	@Autowired
	IUserService service;
	@Test
	public void testAdd() {
		System.out.println("service:"+service);
		User user = new User();
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

		service.addUser(user);
	}
	
	@Test
	public void testDeleteByName(){
		String name="黄宗贵";
		String hql = "from User where name = '"+name+"'";
		service.deleteUser(service.findUser(hql));
	}
	
	@Test
	public void testDeleteByNickname(){
		String nickname="nickname";
		String hql = "from User where nickname = '"+nickname+"'";
		service.deleteUser(service.findUser(hql));
	}
	
	@Test
	public void testUpdate(){
		User user = new User();
		// 根据主键id来更新信息，将整个user传到数据库，通过id找到要更新的user
		user.setId(21);
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
	public void testFind(){
		String name="吴乃福";
		String hql = "from User where name = '"+name+"'";
		List<User> list = service.findUser(hql);
		System.out.println(list);
	}

}
