package com.zhuolang.service;

import com.zhuolang.model.Doctor;
import org.springframework.stereotype.Service;

//@Service
// 如果这里也注释，就会重复注释service了，无法自动注入doctorService，在DoctorService里注释就可以了
public interface IDoctorService {

	/**
	 * @param doctor
	 */
	void add(Doctor doctor);
	
}
