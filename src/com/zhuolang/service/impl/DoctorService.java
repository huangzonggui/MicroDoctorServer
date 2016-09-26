package com.zhuolang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhuolang.dao.IDoctorDao;
import com.zhuolang.model.Doctor;
import com.zhuolang.service.IDoctorService;

@Service("doctorService")
public class DoctorService implements IDoctorService {

	/* (non-Javadoc)
	 * @see com.zhuolang.service.IDoctorService#add(com.zhuolang.model.Doctor)
	 */
	@Autowired
	IDoctorDao dao;
	@Override
	public void add(Doctor doctor) {
		// TODO Auto-generated method stub
		dao.save(doctor);
	}
	
}
