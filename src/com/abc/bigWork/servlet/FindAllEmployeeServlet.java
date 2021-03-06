package com.abc.bigWork.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.entity.User;
import com.abc.bigWork.exception.FindEmpolyeeException;
import com.abc.bigWork.service.UserService;

/**
 * 处理查找所有员工请求
 */
public class FindAllEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 创建UserService对象
		UserService service=new UserService();
		//从session中取出保存user用户信息的对象
		User user=(User) request.getSession(false).getAttribute("user");
		//取出用户的id
		int id=user.getUsername();
		try {
			List<User> list=service.findAllEmployee(id);
			//将list保存到request域对象中
			request.setAttribute("employeeList", list);
			//请求转发跳转到listEmployee.jsp
			request.getRequestDispatcher("/manager/listEmployee.jsp").forward(request, response);
		} catch (FindEmpolyeeException e) {
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
