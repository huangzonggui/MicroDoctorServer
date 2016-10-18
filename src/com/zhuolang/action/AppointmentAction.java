package com.zhuolang.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhuolang.model.Appointment;
import com.zhuolang.service.IAppointmentService;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

/**
 * Created by wnf on 2016/10/15.
 * AppointmentAction动作，需要继承ActionSupport父类
 */
@Controller
public class AppointmentAction extends ActionSupport{
    /**
     * 用来表明类的不同版本间的兼容性。如果你修改了此类, 要修改此值。 否则以前用老版本的类序列化的类恢复时会出错。
     * 为了在反序列化时，确保类版本的兼容性，最好在每个要序列化的类中加入 private static final long
     * serialVersionUID这个属性，具体数值自己定义
     */
//    private static final long serialVersionUID=1L;
    @Autowired
    IAppointmentService service;
    /**
     * 测试添加
     *
     * @throws IOException
     */
    public String add() throws IOException{
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();
		/*
		 * 在调用getWriter之前未设置编码(既调用setContentType或者setCharacterEncoding方法设置编码),
		 * HttpServletResponse则会返回一个用默认的编码(既ISO-8859-1)编码的PrintWriter实例。这样就会
		 * 造成中文乱码。而且设置编码时必须在调用getWriter之前设置,不然是无效的。
		 */
		response.setContentType("text/html;charset=utf-8");

        //测试插入数据
        Appointment appointment=new Appointment();
//        appointment.setId();
        appointment.setPatientId(38);
        appointment.setDoctorId(42);
        //appointment.setSeeTime(new Date());
        appointment.setDisease("喉咙发炎,喉咙痛");
        appointment.setDateTime(new Date());
        appointment.setDiagnose("感冒咳嗽");
        appointment.setDstar(5);

        service.addAppointment(appointment);
        //测试输出json数据
        PrintWriter out=response.getWriter();
        //json在传递过程中是普通字符串形式传递的，这里简单拼接一个做测试
        String jsonString = "{\"id\":\"123\",\"PatientId\":\"124\",\"DoctorId\":\"125\",\"SeeTime\":\"new Date()\",\"Disease\":\"喉咙发炎,喉咙痛\",\"DateTime\":\"new Date()\",\"Diagnose\":\"感冒咳嗽\",\"Dstar\":\"5\"}";
        //输出数据
        out.println(jsonString);
        out.flush();
        out.close();
        return "success";
    }

    /**
     * 测试删除
     *
     * @throws IOException
     */
    public String delete() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        // HttpServletRequest request = ServletActionContext.getRequest();
        // int id = (int) request.getAttribute("user_id");
        response.setContentType("text/html;charset=utf-8");

        String hql = "from Appointment where id = 3";
        service.deleteAppointment(service.findAppointment(hql));

        // 测试输出json数据
        PrintWriter out = response.getWriter();
        // JSON在传递过程中是普通字符串形式传递的，这里简单拼接一个做测试
        String jsonString = "{\"id\":\"123\",\"PatientId\":\"124\",\"DoctorId\":\"125\",\"SeeTime\":\"new Date()\",\"Disease\":\"喉咙发炎,喉咙痛\",\"DateTime\":\"new Date()\",\"Diagnose\":\"感冒咳嗽\",\"Dstar\":\"5\"}";
        // 输出数据
        out.println(jsonString);
        out.flush();
        out.close();

        return "success";
    }

    /**
     * 测试修改
     *
     */
    public String update() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
//        HttpServletRequest request = ServletActionContext.getRequest();
        // request.getAttribute("id");
        // request.getAttribute("");
        response.setContentType("text/html;charset=utf-8");
        Appointment appointment = new Appointment();
        // 根据主键id来更新信息，将整个appointment传到数据库，通过id找到要更新的appointment
        appointment.setId(4);
        appointment.setPatientId(38);
        appointment.setDoctorId(42);
        appointment.setSeeTime(new Date());
        appointment.setDisease("皮肤发痒");
        appointment.setDateTime(new Date());
        appointment.setDiagnose("皮肤炎症");
        appointment.setDstar(3);
        service.updateAppointment(appointment);

        PrintWriter out = response.getWriter();
        String jsonString = "{\"id\":\"123\",\"PatientId\":\"124\",\"DoctorId\":\"125\",\"SeeTime\":\"new Date()\",\"Disease\":\"喉咙发炎,喉咙痛\",\"DateTime\":\"new Date()\",\"Diagnose\":\"感冒咳嗽\",\"Dstar\":\"5\"}";
        out.println(jsonString);
        out.flush();
        out.close();

        return "success";
    }

    /**
     * 测试查询
     *
     * @throws IOException
     *
     * request.setCharacterEncoding（）是设置从request中取得的值或从数据库中取出的值
    response.setContentType("text/html;charset=gb2312")是设置页面中为中文编码
     */
    public String find() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request=ServletActionContext.getRequest();
        response.setContentType("text/html;charset=utf-8");

        String hql = "from Appointment where id = 2";
        List<Appointment> list=service.findAppointment(hql);
        if (list!=null&&list.size()>0){
            request.setAttribute("students_list",list);//获取参数
        }

        PrintWriter out = response.getWriter();
        out.println(list);
        out.flush();
        out.close();

        return "success";
    }
}








