package com.abc.bigWork.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.entity.Task;
import com.abc.bigWork.exception.SltException;
import com.abc.bigWork.service.TaskService;

/**
 * 用于处理寻找实施中的任务
 */
	public class FindExecutoryServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			TaskService service=new TaskService();
			//调用service中的方法
			try {
				List<Task> list=service.slts();
				//将task的对象保存到request域对象中
				request.setAttribute("taskList", list);
				//通过请求转发跳转到sltTemp.jsp页面，显示要修改的数据
				request.getRequestDispatcher("/manager/sltsTask.jsp").forward(request, response);
			} catch (SltException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
