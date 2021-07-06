package com.abc.bigWork.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.entity.User;
import com.abc.bigWork.exception.UpdateTempException;
import com.abc.bigWork.service.UserService;

/**
 * 处理分配员工请求
 */
public class UpdateIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		user.setUsername(Integer.parseInt(request.getParameter("username")));
		user.setSuper_id(request.getParameter("super_id"));
		UserService service=new UserService();
		try {
			service.update(user);
			response.sendRedirect(request.getContextPath()+"/FindAllUserServlet");
		} catch (UpdateTempException e) {
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
