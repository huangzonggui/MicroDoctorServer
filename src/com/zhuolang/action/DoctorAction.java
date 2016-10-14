package com.zhuolang.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhuolang.model.Doctor;
import com.zhuolang.service.IDoctorService;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by hzg on 2016/10/13.
 */
@Controller
public class DoctorAction extends ActionSupport {
    private static final long serialVersionUID = 3L;
    @Autowired
    IDoctorService service;

    public String add() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();

        response.setContentType("text/html;charset=utf-8");

        Doctor doctor = new Doctor();
        doctor.setDoctorId(41);
        doctor.setAmount(123456);
        doctor.setHospital("廉江市人民医院");
        doctor.setOffice("办公室");

        service.addDoctor(doctor);

        PrintWriter out = response.getWriter();
        String jsonString = "{\"doctor\"}";
        out.println(jsonString);
        out.flush();
        out.close();

        return "success";
    }

    public String delete() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("text/html;charset=utf-8");
        int amount = 234567;
        String hql = "from Doctor where amount = '" + amount + "'";
        service.deleteDoctor(service.findDoctor(hql));

        PrintWriter out = response.getWriter();
        String jsonString = "{\"doctor\"}";
        out.println(jsonString);
        out.flush();
        out.close();

        return "success";
    }

    public String update() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();

        response.setContentType("text/html;charset=utf-8");
        Doctor doctor = new Doctor();
        doctor.setId(7);
        doctor.setAmount(123456123);
        doctor.setHospital("江门人民医院");
        doctor.setOffice("妇科");
        doctor.setDoctorId(42);
        service.updateDoctor(doctor);

        PrintWriter out = response.getWriter();
        String jsonString = "{\"doctor\"}";
        out.println(jsonString);
        out.flush();
        out.close();
        return "success";
    }

    public String find() throws IOException {
        HttpServletResponse response=ServletActionContext.getResponse();
        HttpServletRequest request=ServletActionContext.getRequest();
        response.setContentType("text/html;charset=utf-8");
//        String name="吴乃福";


        String hql = "from Doctor where doctorId = '" + 42 + "'";
        List<Doctor> list = service.findDoctor(hql);
        System.out.println(list);

        PrintWriter out = response.getWriter();
//        String jsonString = "{\"doctor\"}";
        out.println(list);
        out.flush();
        out.close();
        return "success";
    }
}
