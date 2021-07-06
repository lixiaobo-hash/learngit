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
 * �����û���¼����
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��ȡ��¼ҳ���û�������û���������ͽ�ɫ�ͽ�ɫ
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String flag=request.getParameter("flag");
		//����service�������û���½����
		UserService service=new UserService();
		try {
			User user=service.login(name, password);
			//��½�ɹ������û���Ϣ���浽session��
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			//���쳣��Ϣ���浽request�������
			request.setAttribute("login_message", e.getMessage());
			//����ת����ת��login.jsp
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
