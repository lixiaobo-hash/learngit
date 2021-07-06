package com.abc.bigWork.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.entity.User;
import com.abc.bigWork.exception.LookDetailsException;
import com.abc.bigWork.service.UserService;

/**
 * Servlet implementation class LookDetailsServlet
 */
public class LookDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// �������л�ȡid������ֵ
				int id=Integer.parseInt(request.getParameter("username"));
				UserService service=new UserService();
				try {
					User user=service.select(id);
					request.setAttribute("user", user);
					request.getRequestDispatcher("/manager/lookDetails.jsp").forward(request, response);
				} catch (LookDetailsException e) {
					// TODO �Զ����ɵ� catch ��
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