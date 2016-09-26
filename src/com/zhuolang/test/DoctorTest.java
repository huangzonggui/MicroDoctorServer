package com.zhuolang.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhuolang.model.Doctor;
import com.zhuolang.model.User;
import com.zhuolang.service.IDoctorService;

@RunWith(SpringJUnit4ClassRunner.class)
@Component
@ContextConfiguration("classpath:applicationContext.xml")
public class DoctorTest {
	@Autowired
	IDoctorService service;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		System.out.println("service:"+service);	
		Doctor doctor = new Doctor();
		doctor.setAmount(123456);
		User user=new User();
		user.setId(26);
		doctor.setDoctorId(user.getId());
		doctor.setHospital("xx医院");
		doctor.setOffice("三楼办公室");
		
		service.add(doctor);
	}

}
