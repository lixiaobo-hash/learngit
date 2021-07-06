package com.abc.bigWork.service;

import java.sql.SQLException;
import java.util.List;

import com.abc.bigWork.dao.UserDao;
import com.abc.bigWork.entity.User;
import com.abc.bigWork.exception.AddUserException;
import com.abc.bigWork.exception.DeleteUserException;
import com.abc.bigWork.exception.DistributeUserException;
import com.abc.bigWork.exception.FindEmpolyeeException;
import com.abc.bigWork.exception.LoginException;
import com.abc.bigWork.exception.LookDetailsException;
import com.abc.bigWork.exception.UpdateTempException;

public class UserService {

	private UserDao dao=new UserDao();
	//�û���¼
	public User login(String name,String password) throws LoginException {
		try {
			User user=dao.findUser(name, password);
			if(user!=null) {
				return user;
			}
			throw new LoginException("�û������������");
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			throw new LoginException("��½ʧ��");
		}
	}
	//�鿴Ա��
	public List<User> findAllEmployee(int super_id) throws FindEmpolyeeException{
		try {
			return dao.selectAllEmployee(super_id);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			throw new FindEmpolyeeException("��ѯʧ��");
		}
	}
	//�鿴����Ա��
	public List<User> fdAll() throws FindEmpolyeeException{
		try {
			return dao.fdAll();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			throw new FindEmpolyeeException("��ѯԱ��ʧ��");
		}
	}
	//���Ա��
	public int addUser(User user) throws AddUserException{
 	   try {
			return dao.addUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new AddUserException("���Ա����Ϣʧ��");
		}
    }
	//ɾ��Ա��
	 public int delete(String username) throws DeleteUserException{
  	   try {
			return dao.delete(username);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DeleteUserException("ɾ��������Ϣʧ��");
		}
     }
	 //����Ա��
	 public List<User> distributeUser() throws DistributeUserException{
			try {
				return dao.distributeUser();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				throw new DistributeUserException("��ѯʧ��");
			}
		}
	 //�鿴Ա����ϸ��Ϣ
	 public User select(int username) throws LookDetailsException {
		 try {
			return dao.select(username);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			throw new LookDetailsException("��ѯʧ��");
		}
	 }
	//Ϊδ������Ա�������
	  public int update(User user) throws UpdateTempException {
			try {
				return dao.update(user);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new UpdateTempException("���������Ϣʧ��");
			} 	   
	       }
}
