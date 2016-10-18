package com.zhuolang.service.impl;

import com.zhuolang.dao.IAppointmentDao;
import com.zhuolang.model.Appointment;
import com.zhuolang.service.IAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wnf on 2016/10/15.
 */
@Service("appointmentService")
public class AppointmentService implements IAppointmentService{

    // 注入服务层，操作数据持久化
    @Autowired
    IAppointmentDao dao;

    /**
     * 业务逻辑操作
     */

    @Override
    public void addAppointment(Appointment appointment) {

        try {
            dao.save(appointment);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateAppointment(Appointment appointment) {
        dao.update(appointment);
    }

    @Override
    public List<Appointment> findAppointment(String hql) {
        return dao.find(hql);
    }

    @Override
    public void deleteAppointment(List<Appointment> findAppointment) {
        List<Appointment> list=findAppointment;
        if (list!=null&&list.size()>0){
            for (int i=0;i<list.size();i++){
                dao.delete(list.get(i));
            }
        }
    }
}
