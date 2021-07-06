package com.abc.bigWork.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.entity.Task;
import com.abc.bigWork.exception.UpdateTaskMessagException;
import com.abc.bigWork.service.TaskService;

/**
 * 处理提交修改任务信息请求
 */
public class SubmitUpdateTaskMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Task task=new Task();
		task.setId(Integer.parseInt(request.getParameter("id")));
		task.setTask_name(request.getParameter("task_name"));
		task.setTask_begin_time(request.getParameter("task_begin_time"));
		task.setTask_end_time(request.getParameter("task_end_time"));
		task.setStaff_id(request.getParameter("staff_id"));
		task.setTask_description(request.getParameter("task_description"));
		TaskService service=new TaskService();
		try {
			service.updateTask(task);
			response.sendRedirect(request.getContextPath()+"/FdAllTaskServlet");
		} catch (UpdateTaskMessagException e) {
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
