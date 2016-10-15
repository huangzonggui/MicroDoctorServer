package com.zhuolang.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhuolang.model.Discuss;
import com.zhuolang.service.IDiscussService;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hzg on 2016/10/15.
 */
@Controller
public class DiscussAction extends ActionSupport{
    @Autowired
    IDiscussService service;

    public String add() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();

        response.setContentType("text/html;charset=utf-8");

        Discuss discuss = new Discuss();
        discuss.setSendId(7);
        discuss.setObserverId(39);
        discuss.setDcontent(null);//"我喜欢评论，我最喜欢评论了，这个是我的评论内容，够长了吧，text类型的"

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String time = dateFormat.format(date);

        discuss.setDtime(time);

        service.addDiscuss(discuss);

        PrintWriter out = response.getWriter();
        String jsonString="{\"discuss success\"}";
        out.println(jsonString);
        out.flush();
        out.close();

        return "success";
    }

    public String update() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();

        response.setContentType("text/html;charset=utf-8");

        Discuss discuss = new Discuss();
        discuss.setId(2);
        discuss.setSendId(8);
        discuss.setObserverId(38);
        discuss.setDcontent(null);//"我喜欢评论，我最喜欢评论了，这个是我的评论内容，够长了吧，text类型的"

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String time = dateFormat.format(date);

        discuss.setDtime(time);

        service.updateDiscuss(discuss);

        PrintWriter out = response.getWriter();
        String jsonString="{\"discuss success\"}";
        out.println(jsonString);
        out.flush();
        out.close();

        return "success";
    }

    public String delete() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();

        response.setContentType("text/html;charset=utf-8");
        String hql = "from Discuss where id = '" + 2 + "'";
        service.deleteDiscuss(service.findDiscuss(hql));

        PrintWriter out = response.getWriter();
        String jsonString="{\"discuss success\"}";
        out.println(jsonString);
        out.flush();
        out.close();

        return "success";
    }

    public String find() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();

        response.setContentType("text/html;charset=utf-8");
        String hql="from Discuss where id ='"+3+"'";

        PrintWriter out = response.getWriter();
        String jsonString="{\"discuss success\"}";
        out.println(jsonString);
        out.println(service.findDiscuss(hql));
        out.flush();
        out.close();
        return "success";
    }
}
