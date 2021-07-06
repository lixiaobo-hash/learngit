package com.abc.bigWork.service;

import java.sql.SQLException;
import java.util.List;

import com.abc.bigWork.dao.PlanDao;
import com.abc.bigWork.entity.Plan;
import com.abc.bigWork.entity.Task;
import com.abc.bigWork.exception.DeleteByusernameException;
import com.abc.bigWork.exception.FdAllTaskException;
import com.abc.bigWork.exception.FindTaskByIdException;
import com.abc.bigWork.exception.InsertUserException;

public class PlanService {
	private PlanDao dao=new PlanDao();
	//����task_id��ѯ�ƻ�
	public Plan findPlanById(int task_id) throws FindTaskByIdException {
		try {
			return dao.findPlanById(task_id);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			throw new FindTaskByIdException("����task_id��ѯʧ��");
		}
	}
	//�鿴��������
    public List<Plan> selectAll(int task_id) throws FdAllTaskException{
 	   try {
			return dao.selectAll(task_id);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new FdAllTaskException("��ѯ����ʧ��");
		}
    }
  //�鿴��������
    public List<Task> fdAll(int username) throws FdAllTaskException{
 	   try {
			return dao.fdAll(username);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new FdAllTaskException("��ѯ����ʧ��");
		}
    }
    //��Ӽƻ�
    public int insert(Plan plan) throws InsertUserException{
  	   try {
 			return dao.insert(plan);
 		} catch (SQLException e) {
 			e.printStackTrace();
 			throw new InsertUserException("��Ӽƻ�ʧ��");
 		}
     } 
    //ɾ���ƻ�
    public int deleteByid(int id) throws DeleteByusernameException {
    	try {
			return dao.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DeleteByusernameException("����idɾ���ƻ�ʧ��");
		} 
    } 
}
