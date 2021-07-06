package com.abc.bigWork.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.entity.Plan;
import com.abc.bigWork.entity.Task;
import com.abc.bigWork.exception.FdAllTaskException;
import com.abc.bigWork.exception.FindTaskByIdException;
import com.abc.bigWork.service.PlanService;
import com.abc.bigWork.service.TaskService;

public class FindPlanTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 从请求中获取参数的值 
		int id=Integer.parseInt(request.getParameter("id"));
		TaskService service1=new TaskService();	
		PlanService service2=new PlanService();
		try {
			Task task =service1.findById(id);
			List<Plan> plan=service2.selectAll(id);
			request.setAttribute("task", task);
			request.setAttribute("plan", plan);
			//通过请求转发跳转到updateTask.jsp页面，显示要修改的数据
			request.getRequestDispatcher("/employee/updatePlan.jsp").forward(request, response);
		} catch (FdAllTaskException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
