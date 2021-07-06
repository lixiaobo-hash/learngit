package com.abc.bigWork.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.entity.User;
import com.abc.bigWork.exception.AddUserException;
import com.abc.bigWork.service.UserService;


/**
 * 处理添加员工请求
 */
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		user.setName(request.getParameter("name"));
		user.setPassword(request.getParameter("password"));
		user.setSex(request.getParameter("sex"));
		user.setBirthday(request.getParameter("birthday"));
		user.setHeir_date(request.getParameter("heir_date"));
		user.setPosition(request.getParameter("position"));
		user.setQualification(request.getParameter("qualification"));
		user.setProfessional(request.getParameter("professional"));
		user.setExperience(request.getParameter("experience"));
		user.setFlag(request.getParameter("flag"));
		UserService service=new UserService();
		//调用service方法
		try {
			service.addUser(user);
			response.sendRedirect(request.getContextPath()+"/FindAllUserServlet");
		} catch (AddUserException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
