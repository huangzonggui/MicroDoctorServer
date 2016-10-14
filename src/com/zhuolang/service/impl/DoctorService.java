package com.zhuolang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhuolang.dao.IDoctorDao;
import com.zhuolang.model.Doctor;
import com.zhuolang.service.IDoctorService;

import java.util.List;

@Service("doctorService")
public class DoctorService implements IDoctorService {

	/* (non-Javadoc)
	 * @see com.zhuolang.service.IDoctorService#add(com.zhuolang.model.Doctor)
	 */
	@Autowired
	IDoctorDao dao;
	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		dao.save(doctor);
	}

	@Override
	public void updateDoctor(Doctor doctor) {
        dao.update(doctor);
	}

	@Override
	public List<Doctor> findDoctor(String hql) {
		return dao.find(hql);
	}

	@Override
	public void deleteDoctor(List<Doctor> findDoctor) {
		List<Doctor> list=findDoctor;
		if (list != null && list.size() > 0) {
			for(int i=0;i<list.size();i++) {
				dao.delete(list.get(i));
			}
		}

	}
}
