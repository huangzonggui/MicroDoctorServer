package com.zhuolang.service;

import com.zhuolang.model.Appointment;

import java.util.List;

/**
 * Created by wnf on 2016/10/15.
 * 用户服务类接口，根据业务逻辑进行设置
 * @author wnf
 *
 */
//@Service
public interface IAppointmentService {
    void addAppointment(Appointment appointment);
    void updateAppointment(Appointment appointment);
    List<Appointment> findAppointment(String hql);
    void deleteAppointment(List<Appointment> findAppointment);
}
