package com.zhuolang.dao.impl;

import com.zhuolang.dao.IAppointmentDao;
import com.zhuolang.model.Appointment;
import org.springframework.stereotype.Repository;

/**
 * Created by wnf on 2016/10/15.
 * 用户持久层实现类,进行数据持久操作
 *
 * @author jat
 *
 */
@Repository("appointmentDao")
public class AppointmentDao extends BaseDao<Appointment> implements IAppointmentDao{

}
