package com.zhuolang.service;

import org.springframework.stereotype.Service;

import com.zhuolang.model.Doctor;

@Service
public interface IDoctorService {

	/**
	 * @param doctor
	 */
	void add(Doctor doctor);
	
}
