package com.abc.bigWork.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.abc.bigWork.entity.User;
import com.abc.bigWork.utils.C3p0Utils;

public class UserDao {
	//�����Ա
	public int addUser(User user) throws SQLException {
		QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
		String sql="insert into t_emp (username,name,password,sex,birthday,heir_date,position,qualification,professional,experience,flag,super_id) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		int num=qr.update(sql, new Object[] {user.getUsername(),user.getName(),user.getPassword(),user.getSex(),user.getBirthday(),user.getHeir_date(),user.getPosition(),user.getQualification(),user.getProfessional(),user.getExperience(),user.getFlag(),user.getSuper_id()});
		return num;
	}
	//��ѯ��¼����
	public User findUser(String name,String password) throws SQLException {
		QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
		String sql="select * from t_emp where name=? and password=?";
		User user=qr.query(sql, new BeanHandler<>(User.class),new Object[] {name,password});	
		return user;
	}
	//�鿴���ܵ�����Ա��
	public List<User> selectAllEmployee(int super_id) throws SQLException{
		QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
		String sql="SELECT * FROM t_emp WHERE super_id=?";
		List<User> list=qr.query(sql, new BeanListHandler<>(User.class),new Object[] {super_id});
		return list;
	}
	//��������Ա��
	public List<User> fdAll() throws SQLException{
		QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
		String sql="select * from t_emp";
		List<User> list=qr.query(sql, new BeanListHandler<>(User.class));
		return list;
	}
	//ɾ��Ա��
	public int delete(String username) throws SQLException {
		QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
		String sql="delete from t_emp where username=?";
		int num=qr.update(sql,new Object[] {username});
		return num;
	}
	//����δ�����Ա��
	public List<User> distributeUser() throws SQLException{
		QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
		String sql="SELECT * FROM t_emp WHERE super_id is null";
		List<User> list=qr.query(sql, new BeanListHandler<>(User.class));
		return list;
	}
	//�鿴Ա����ϸ��Ϣ
	public User select(int username) throws SQLException {
		QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
		String sql="select * from t_emp where username=?";
		User user=qr.query(sql, new BeanHandler<>(User.class),new Object[] {username});
		return user;
	}
	//���δ����Ա����Ϣ
	public int update(User user) throws SQLException {
		QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
		String sql="update t_emp set super_id=? where username=?";
		int num= qr.update(sql, new Object[] {user.getSuper_id(),user.getUsername()});
		return num;
	}
}
