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
 * �����������Ա������
 */
public class FindAllEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ����UserService����
		UserService service=new UserService();
		//��session��ȡ������user�û���Ϣ�Ķ���
		User user=(User) request.getSession(false).getAttribute("user");
		//ȡ���û���id
		int id=user.getUsername();
		try {
			List<User> list=service.findAllEmployee(id);
			//��list���浽request�������
			request.setAttribute("employeeList", list);
			//����ת����ת��listEmployee.jsp
			request.getRequestDispatcher("/manager/listEmployee.jsp").forward(request, response);
		} catch (FindEmpolyeeException e) {
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
