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
	//根据task_id查询计划
	public Plan findPlanById(int task_id) throws FindTaskByIdException {
		try {
			return dao.findPlanById(task_id);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			throw new FindTaskByIdException("根据task_id查询失败");
		}
	}
	//查看所有任务
    public List<Plan> selectAll(int task_id) throws FdAllTaskException{
 	   try {
			return dao.selectAll(task_id);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new FdAllTaskException("查询任务失败");
		}
    }
  //查看所有任务
    public List<Task> fdAll(int username) throws FdAllTaskException{
 	   try {
			return dao.fdAll(username);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new FdAllTaskException("查询任务失败");
		}
    }
    //添加计划
    public int insert(Plan plan) throws InsertUserException{
  	   try {
 			return dao.insert(plan);
 		} catch (SQLException e) {
 			e.printStackTrace();
 			throw new InsertUserException("添加计划失败");
 		}
     } 
    //删除计划
    public int deleteByid(int id) throws DeleteByusernameException {
    	try {
			return dao.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DeleteByusernameException("根据id删除计划失败");
		} 
    } 
}
