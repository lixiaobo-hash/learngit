package com.abc.bigWork.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.entity.Task;
import com.abc.bigWork.exception.MakeTaskException;
import com.abc.bigWork.service.TaskService;

/**
 * 处理制定计划请求
 */
public class MakeTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Task task=new Task();
		task.setTask_name(request.getParameter("task_name"));
		task.setTask_begin_time(request.getParameter("task_begin_time"));
		task.setTask_end_time(request.getParameter("task_end_time"));
		task.setTask_description(request.getParameter("task_description"));
		task.setTask_state(request.getParameter("task_state"));
		task.setStaff_id(request.getParameter("staff_id"));
		TaskService service=new TaskService();
		try {
			service.makeTask(task);
			request.setAttribute("task", task);
			response.sendRedirect(request.getContextPath()+"/FdAllTaskServlet");
		} catch (MakeTaskException e) {
			// TODO Auto-generated catch block
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
