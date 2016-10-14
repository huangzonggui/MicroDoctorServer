package com.zhuolang.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhuolang.dao.IDoctorDao;
import com.zhuolang.model.Doctor;

@Repository("doctorDao")
public class DoctorDao extends BaseDao<Doctor> implements IDoctorDao {

}
