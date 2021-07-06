package com.abc.bigWork.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.bigWork.exception.DeleteByusernameException;
import com.abc.bigWork.service.PlanService;


/**
 * ����ɾ���ƻ�����
 */
public class DeletePlanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		PlanService service=new PlanService();
		try {
			service.deleteByid(id);
			//ͨ������ת����ת��FindAllTempServlet����ʾҪɾ��������
			response.sendRedirect(request.getContextPath()+"/FindPlanServlet");
		} catch (DeleteByusernameException e) {
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
