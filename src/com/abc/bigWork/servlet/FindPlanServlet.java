package com.abc.bigWork.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.entity.Task;
import com.abc.bigWork.entity.User;
import com.abc.bigWork.exception.FdAllTaskException;
import com.abc.bigWork.service.PlanService;

/**
 * 处理查找计划请求
 */
public class FindPlanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=(User) request.getSession(false).getAttribute("user");
		PlanService service=new PlanService();
		try {
			List<Task> list=service.fdAll(user.getUsername());
			request.setAttribute("taskList", list);
			request.getRequestDispatcher("/employee/listPlan.jsp").forward(request, response);
		} catch (FdAllTaskException e) {
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
