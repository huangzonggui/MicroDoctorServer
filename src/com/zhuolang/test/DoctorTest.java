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

import java.util.List;

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
		doctor.setDoctorId(42);
		doctor.setHospital("xx医院");
		doctor.setOffice("三楼办公室");
		
		service.addDoctor(doctor);
	}


	@Test
	public void testDelete(){
		int amount=123456;
		String hql = "from Doctor where amount = '"+amount+"'";
		service.deleteDoctor(service.findDoctor(hql));
	}

	@Test
	public void testUpdate(){
		Doctor doctor = new Doctor();
		doctor.setId(3);
		doctor.setAmount(234567);
		doctor.setHospital("江门人民医院");
		doctor.setOffice("妇科");
		doctor.setDoctorId(42);
		service.updateDoctor(doctor);
	}

	@Test
	public void testFind(){
//		String name="吴乃福";
//		String hql = "from User where name = '" + name + "'";
//		User user =
//		int doctorId=user.get
//		String hql2=  "select id from User where name ='"+name+"'";
//		System.out.println(hql2);
		String hql = "from Doctor where doctorId = '" +42 + "'";
		List<Doctor> list = service.findDoctor(hql);
		System.out.println(list);
	}
}
