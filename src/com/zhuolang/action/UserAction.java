package com.zhuolang.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.zhuolang.dao.IUserDao;
import com.zhuolang.model.User;
import com.zhuolang.service.IUserService;

/**
 * UserAction动作，需要继承ActionSupport父类
 * @author jat
 *
 */
public class UserAction extends ActionSupport{
	/**
	 * 用来表明类的不同版本间的兼容性。如果你修改了此类, 要修改此值。
	 * 否则以前用老版本的类序列化的类恢复时会出错。
	 * 为了在反序列化时，确保类版本的兼容性，最好在每个要序列化的类中加入
	 * private static final long serialVersionUID这个属性，具体数值自己定义
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	IUserService service;
	String user_name;
	String password;
	/**
	 * 测试添加
	 * @throws IOException
	 */
	public void add() throws IOException{
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
		/* 
	     * 在调用getWriter之前未设置编码(既调用setContentType或者setCharacterEncoding方法设置编码), 
	     * HttpServletResponse则会返回一个用默认的编码(既ISO-8859-1)编码的PrintWriter实例。这样就会 
	     * 造成中文乱码。而且设置编码时必须在调用getWriter之前设置,不然是无效的。 
	     * */
		/**
		 * 获取参数
		 */
		user_name = (String) request.getAttribute("user_name");
		password = (String) request.getAttribute("password");
		//进行操作。。。
	    response.setContentType("text/html;charset=utf-8");  
	    //response.setCharacterEncoding("UTF-8");
	    //测试插入数据
	    User user = new User();
        user.setName("jjj");  
        service.addUser(user);
        //测试输出json数据
	    PrintWriter out = response.getWriter();  
	    //JSON在传递过程中是普通字符串形式传递的，这里简单拼接一个做测试  
	    String jsonString="{\"user\":{\"id\":\"123\",\"name\":\"张三\",\"say\":\"Hello , i am a action to print a json!\",\"password\":\"JSON\"},\"success\":true}";  
	    //输出数据
	    out.println(jsonString);  
	    out.flush();
	    out.close();
	}
}