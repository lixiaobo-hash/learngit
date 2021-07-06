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
 * 处理修改任务信息请求
 */
public class UpdateTaskMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 从请求中获取参数值
		int id=Integer.parseInt(request.getParameter("id"));
		TaskService service=new TaskService();
		try {
			Task task=service.findById(id);
			request.setAttribute("task", task);
			request.getRequestDispatcher("/manager/updateTaskMessage.jsp").forward(request, response);
		} catch (FindTaskByIdException e) {
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
