package com.abc.bigWork.service;

import java.sql.SQLException;
import java.util.List;

import com.abc.bigWork.dao.TaskDao;
import com.abc.bigWork.entity.Task;
import com.abc.bigWork.exception.FdAllTaskException;
import com.abc.bigWork.exception.FindTaskByIdException;
import com.abc.bigWork.exception.MakeTaskException;
import com.abc.bigWork.exception.SltException;
import com.abc.bigWork.exception.UpdateTaskMessagException;

public class TaskService {
	private TaskDao dao=new TaskDao();
	//�ƶ��ƻ�
	public int makeTask(Task task) throws MakeTaskException {
		try {
			return dao.makeTask(task);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MakeTaskException("�ƶ��ƻ�ʧ��");
		}
	}
	//�鿴��������
	public List<Task> fdAllTask() throws FdAllTaskException{
		try {
			return dao.fdAllTask();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			throw new FdAllTaskException("��ѯʧ��");
		}
	}
	//�鿴ĳ������
	public Task findById(int id) throws FindTaskByIdException {
		try {
			return dao.findById(id);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			throw new FindTaskByIdException("��ѯʧ��");
		}
	}
	//��ѯʵʩ�е�����
	 public List<Task> slts() throws SltException {
	    	try {
				return dao.slts();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new SltException("��ѯ����ʧ��");
			}
	    }
	//��ѯδ���������
	    public List<Task> slt() throws SltException {
	    	try {
				return dao.slt();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new SltException("��ѯδ��������ʧ��");
			}
	    }
	  //�޸�������Ϣ
	    public int updateTask(Task task) throws UpdateTaskMessagException {
	    	try {
				return dao.updateTask(task);
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				throw new UpdateTaskMessagException("�޸�������Ϣʧ��");
			}
	    }
}
