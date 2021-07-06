package com.abc.bigWork.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.entity.Plan;
import com.abc.bigWork.exception.InsertUserException;
import com.abc.bigWork.service.PlanService;

/**
 * 处理添加任务请求
 */
public class InsertPlanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Plan plan=new Plan();
		plan.setTask_id(request.getParameter("task_id"));
		plan.setPlan_name(request.getParameter("plan_name"));
		plan.setPlan_state(request.getParameter("plan_state"));
		plan.setPlan_begin_time(request.getParameter("plan_begin_time"));
		plan.setPlan_end_time(request.getParameter("plan_end_time"));
		plan.setFeedback(request.getParameter("feedback"));
		plan.setPlan_description(request.getParameter("plan_description"));
		PlanService service=new PlanService();
		try {
			service.insert(plan);
			request.setAttribute("plan", plan);
			response.sendRedirect(request.getContextPath()+"/FindPlanServlet");
		} catch (InsertUserException e) {
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
