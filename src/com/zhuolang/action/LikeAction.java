package com.zhuolang.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhuolang.model.Like;
import com.zhuolang.service.ILikeService;
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
 * Created by hzg on 2016/10/15.
 */
@Controller
public class LikeAction extends ActionSupport{
    @Autowired
    ILikeService service;

    public String add() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        //如何在Struts2中获取request对象
        HttpServletRequest request= ServletActionContext.getRequest();

        response.setContentType("text/html;charset=utf-8");
        Like like = new Like();
        like.setSendId(8);
        like.setLikesId(38);
        Date date = new Date();
        like.setLikesTime(date);

        service.addLike(like);

        PrintWriter out = response.getWriter();
        String jsonString="{\"like success\"}";
        out.println(jsonString);
        out.flush();
        out.close();

        return "success";
    }

    public String delete() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();

        response.setContentType("text/html;charset=utf-8");

        String hql = "from Like where id = '" + 7 + "'";
        service.deleteLike(service.findLike(hql));


        PrintWriter out = response.getWriter();
        String jsonString="{\"like success\"}";
        out.println(jsonString);
        out.flush();
        out.close();

        return "success";
    }

    public String update() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();

        response.setContentType("text/html;charset=utf-8");
        Like like = new Like();
        like.setId(8);
        like.setSendId(7);
        like.setLikesId(39);
        Date date = new Date();
        like.setLikesTime(date);
        service.updateLike(like);

        PrintWriter out = response.getWriter();
        String jsonString="{\"like success\"}";
        out.println(jsonString);
        out.flush();
        out.close();

        return "success";
    }

    public String find() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();

        response.setContentType("text/html;charset=utf-8");

        String hql = "from Like where id = '" +8 + "'";
        List<Like> list = service.findLike(hql);

        PrintWriter out = response.getWriter();
        String jsonString = "{\"success like\"}";
        out.println(jsonString);
        out.println(list);
        out.flush();
        out.close();

        return "success";
    }
}
