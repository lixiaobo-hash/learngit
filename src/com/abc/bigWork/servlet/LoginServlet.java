package com.abc.bigWork.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.entity.User;
import com.abc.bigWork.exception.LoginException;
import com.abc.bigWork.service.UserService;

/**
 * 处理用户登录请求
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取登录页面用户输入的用户名和密码和角色和角色
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String flag=request.getParameter("flag");
		//调用service层的完成用户登陆操作
		UserService service=new UserService();
		try {
			User user=service.login(name, password);
			//登陆成功，将用户信息保存到session中
			request.getSession().setAttribute("user", user);
			if("1".equals(flag)) {
				response.sendRedirect(request.getContextPath()+"/admin/index.jsp");
				return;
			}
			else if("2".equals(flag)) {
				response.sendRedirect(request.getContextPath()+"/manager/index.jsp");
				return;
			}
			else {
				response.sendRedirect(request.getContextPath()+"/employee/index.jsp");
				return;
			}
		} catch (LoginException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			//将异常消息保存到request域对象中
			request.setAttribute("login_message", e.getMessage());
			//请求转发跳转到login.jsp
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
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
