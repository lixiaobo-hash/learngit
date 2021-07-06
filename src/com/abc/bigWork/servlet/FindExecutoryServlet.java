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
 * ���ڴ���Ѱ��ʵʩ�е�����
 */
	public class FindExecutoryServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			TaskService service=new TaskService();
			//����service�еķ���
			try {
				List<Task> list=service.slts();
				//��task�Ķ��󱣴浽request�������
				request.setAttribute("taskList", list);
				//ͨ������ת����ת��sltTemp.jspҳ�棬��ʾҪ�޸ĵ�����
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
