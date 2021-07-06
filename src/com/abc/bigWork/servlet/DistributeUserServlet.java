package com.abc.bigWork.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.entity.User;
import com.abc.bigWork.exception.DistributeUserException;
import com.abc.bigWork.exception.FindEmpolyeeException;
import com.abc.bigWork.service.UserService;

/**
 * �������Ա������
 */
public class DistributeUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ����UserService����
				UserService service=new UserService();
				//��session��ȡ������user�û���Ϣ�Ķ���
//				User user=(User) request.getSession(false).getAttribute("user");
				try {
					List<User> distributeList=service.distributeUser();
					//��list���浽request�������
					request.setAttribute("distributeList", distributeList);
					//����ת����ת��listEmployee.jsp
					request.getRequestDispatcher("/admin/distributeUser.jsp").forward(request, response);
				} catch (DistributeUserException e) {
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
