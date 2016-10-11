package com.zhuolang.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.zhuolang.model.UserModel;
import com.zhuolang.service.IUserModelService;

public class UserModelAction extends ActionSupport {
	/**
	 * 用来表明类的不同版本间的兼容性。如果你修改了此类, 要修改此值。 否则以前用老版本的类序列化的类恢复时会出错。
	 * 为了在反序列化时，确保类版本的兼容性，最好在每个要序列化的类中加入 private static final long
	 * serialVersionUID这个属性，具体数值自己定义
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	IUserModelService service;
	String user_name;
	String password;
	/**
	 * 测试添加
	 *
	 * @throws IOException
	 */
	public String add() throws IOException {
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();

		user_name = (String) request.getAttribute("user_name");
		password = (String) request.getAttribute("password");

		response.setContentType("text/html;charset=utf-8");
		// 测试插入数据
		UserModel userModel = new UserModel();
		userModel.setName("gui");
		service.addUserModel(userModel);
		// 测试输出json数据
		PrintWriter out = response.getWriter();
		String jsonString = "{\"user\":{\"id\":\"123\",\"name\":\"张三\",\"say\":\"Hello , i am a action to print a json!\",\"password\":\"JSON\"},\"success\":true}";
		//输出数据
		out.println(jsonString);
		out.flush();
		out.close();

		return "success";
	}

}
