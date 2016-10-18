package com.zhuolang.test;

import com.zhuolang.model.Appointment;
import com.zhuolang.service.IAppointmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by wnf on 2016/10/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Component
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AppointmentTest {
    @Autowired
    IAppointmentService service;
    @Test
    public void testAdd(){

        System.out.println("service:"+service);
        //测试插入数据
        Appointment appointment=new Appointment();
//        appointment.setId(5);
        appointment.setPatientId(38);
        appointment.setDoctorId(42);
        appointment.setSeeTime(new Date());
        appointment.setDisease("喉咙发炎,喉咙痛test");
        appointment.setDateTime(new Date());
        appointment.setDiagnose("感冒咳嗽test");
        appointment.setDstar(5);

        service.addAppointment(appointment);
        System.out.println("执行到这里1");
    }

    @Test
    public void testDeleteById(){

        String hql = "from Appointment where id = 1";
        service.deleteAppointment(service.findAppointment(hql));
    }

    @Test
    public void testUpdate(){
        Appointment appointment = new Appointment();
        // 根据主键id来更新信息，将整个appointment传到数据库，通过id找到要更新的appointment
        appointment.setId(2);
        appointment.setPatientId(38);
        appointment.setDoctorId(42);
        appointment.setSeeTime(new Date());
        appointment.setDisease("皮肤发痒,更新");
        appointment.setDateTime(new Date());
        appointment.setDiagnose("皮肤炎症");
        appointment.setDstar(3);
        service.updateAppointment(appointment);

    }

    @Test
    public void testFind(){
        String hql = "from Appointment where patientId = 2";
        List<Appointment> list = service.findAppointment(hql);
        System.out.println(list);
    }

}
