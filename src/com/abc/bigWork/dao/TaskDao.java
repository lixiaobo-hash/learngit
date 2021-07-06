package com.abc.bigWork.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.abc.bigWork.entity.Task;
import com.abc.bigWork.utils.C3p0Utils;

public class TaskDao {
	//�ƶ�����
	public int makeTask(Task task) throws SQLException {
		QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
		String sql="insert into t_task(task_name,task_begin_time,task_end_time,task_description,task_state,staff_id)values(?,?,?,?,?,?)";
		int num=qr.update(sql,new Object[] {task.getTask_name(),task.getTask_begin_time(),task.getTask_end_time(),task.getTask_description(),task.getTask_state(),task.getStaff_id()});
		return num;
	}
	//��ѯ��������
	public List<Task> fdAllTask() throws SQLException{
		QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
		String sql="select * from t_task";
		List<Task> list=qr.query(sql,new BeanListHandler<>(Task.class));
		return list;
	}
	//��ѯĳ������
	public Task findById(int id) throws SQLException {
		QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
		String sql="select * from t_task where id=?";
		Task task=qr.query(sql, new BeanHandler<>(Task.class),new Object[]{id});
		return task;
	}
	//��ѯʵʩ������
	public List<Task> slts() throws SQLException {
		QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
		String sql="select * from t_task where task_state in('ʵʩ��')";
		List<Task> list=qr.query(sql, new BeanListHandler<>(Task.class));
		return list;
		}
	//��ѯδ��������
	public List<Task> slt() throws SQLException {
		QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
		String sql="select * from t_task where task_state in('δʵʩ')";
		List<Task> list=qr.query(sql, new BeanListHandler<>(Task.class));
		return list;
	}
	//�޸�������Ϣ
	public int updateTask(Task task) throws SQLException {
		QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
		String sql="update t_task set task_name=?,task_begin_time=?,task_end_time=?,staff_id=?,task_description=? where id=?";
		int num=qr.update(sql,new Object[] {task.getTask_name(),task.getTask_begin_time(),task.getTask_end_time(),task.getStaff_id(),task.getTask_description(),task.getId()});
		return num;
	}
}
