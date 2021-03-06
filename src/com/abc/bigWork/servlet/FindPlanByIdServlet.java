package com.abc.bigWork.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.entity.Plan;
import com.abc.bigWork.entity.Task;
import com.abc.bigWork.exception.FindPlanByIdException;
import com.abc.bigWork.exception.FindTaskByIdException;
import com.abc.bigWork.service.PlanService;
import com.abc.bigWork.service.TaskService;

/**
 * 处理根据查找计划请求
 */
public class FindPlanByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int id=Integer.parseInt(request.getParameter("id"));
//		TaskService service=new TaskService();
		int task_id=Integer.parseInt(request.getParameter("task_id"));
		PlanService service2=new PlanService();
		try {
//			Task task=service.findById(id);
			Plan plan=service2.findPlanById(task_id);
//			request.setAttribute("task", task);
			request.setAttribute("plan", plan);
			request.getRequestDispatcher("/manager/findPlanById.jsp").forward(request, response);
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
