package com.abc.bigWork.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.abc.bigWork.entity.Plan;
import com.abc.bigWork.entity.Task;
import com.abc.bigWork.utils.C3p0Utils;

public class PlanDao {
	//����task_id��ѯ�ƻ�
	public Plan findPlanById(int task_id) throws SQLException {
		QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
		String sql="select * from t_plan where task_id=?";
		Plan plan=qr.query(sql, new BeanHandler<>(Plan.class),new Object[] {task_id});
		return plan;
	}
	//��Ѱ�ƻ�
		public List<Plan> selectAll(int task_id) throws SQLException{
			QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
			String sql="select * from t_plan where task_id=?";
			List<Plan> list=qr.query(sql, new BeanListHandler<>(Plan.class),new Object[] {task_id});
			return list;
		}
		//�鿴����
		public List<Task> fdAll(int username) throws SQLException{
			QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
			String sql="select * from t_task where staff_id=?";
			List<Task> list=qr.query(sql, new BeanListHandler<>(Task.class),new Object[] {username});
			return list;
		}
		//��Ӽƻ�
		public int insert(Plan plan) throws SQLException {
			QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
			String sql="insert into t_plan  (task_id,plan_name,plan_state,feedback,plan_begin_time,plan_end_time,plan_description) values(?,?,?,?,?,?,?)";
			int num=qr.update(sql, new Object[] {plan.getTask_id(), plan.getPlan_name(),plan.getPlan_state(),plan.getFeedback(),plan.getPlan_begin_time(),plan.getPlan_end_time(),plan.getPlan_description()});
			return num;
		}
		//ɾ���ƻ�
		public int delete(int id) throws SQLException {
			QueryRunner qr=new QueryRunner(C3p0Utils.getDataSourse());
			String sql="delete from t_plan where id=?";
			int num=qr.update(sql, new Object[] {id});
			return num;
		}
}
