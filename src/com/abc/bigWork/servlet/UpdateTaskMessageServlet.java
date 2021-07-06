package com.abc.bigWork.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.entity.Task;
import com.abc.bigWork.exception.FindTaskByIdException;
import com.abc.bigWork.service.TaskService;

/**
 * �����޸�������Ϣ����
 */
public class UpdateTaskMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// �������л�ȡ����ֵ
		int id=Integer.parseInt(request.getParameter("id"));
		TaskService service=new TaskService();
		try {
			Task task=service.findById(id);
			request.setAttribute("task", task);
			request.getRequestDispatcher("/manager/updateTaskMessage.jsp").forward(request, response);
		} catch (FindTaskByIdException e) {
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
