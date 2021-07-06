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
	//用户登录
	public User login(String name,String password) throws LoginException {
		try {
			User user=dao.findUser(name, password);
			if(user!=null) {
				return user;
			}
			throw new LoginException("用户名或密码错误");
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			throw new LoginException("登陆失败");
		}
	}
	//查看员工
	public List<User> findAllEmployee(int super_id) throws FindEmpolyeeException{
		try {
			return dao.selectAllEmployee(super_id);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			throw new FindEmpolyeeException("查询失败");
		}
	}
	//查看所有员工
	public List<User> fdAll() throws FindEmpolyeeException{
		try {
			return dao.fdAll();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			throw new FindEmpolyeeException("查询员工失败");
		}
	}
	//添加员工
	public int addUser(User user) throws AddUserException{
 	   try {
			return dao.addUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new AddUserException("添加员工信息失败");
		}
    }
	//删除员工
	 public int delete(String username) throws DeleteUserException{
  	   try {
			return dao.delete(username);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DeleteUserException("删除好友信息失败");
		}
     }
	 //分配员工
	 public List<User> distributeUser() throws DistributeUserException{
			try {
				return dao.distributeUser();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
				throw new DistributeUserException("查询失败");
			}
		}
	 //查看员工详细信息
	 public User select(int username) throws LookDetailsException {
		 try {
			return dao.select(username);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			throw new LookDetailsException("查询失败");
		}
	 }
	//为未分配人员添加主管
	  public int update(User user) throws UpdateTempException {
			try {
				return dao.update(user);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new UpdateTempException("添加主管信息失败");
			} 	   
	       }
}
