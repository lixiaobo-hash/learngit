package com.abc.bigWork.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.entity.Task;
import com.abc.bigWork.exception.FdAllTaskException;
import com.abc.bigWork.service.TaskService;

/**
 * �����ѯ������������
 */
public class FdAllTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TaskService service=new TaskService();
		try {
			List<Task> taskList=service.fdAllTask();
			request.setAttribute("taskList", taskList);
			request.getRequestDispatcher("/manager/listTask.jsp").forward(request, response);
		} catch (FdAllTaskException e) {
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
