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
	//制定计划
	public int makeTask(Task task) throws MakeTaskException {
		try {
			return dao.makeTask(task);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MakeTaskException("制定计划失败");
		}
	}
	//查看所有任务
	public List<Task> fdAllTask() throws FdAllTaskException{
		try {
			return dao.fdAllTask();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			throw new FdAllTaskException("查询失败");
		}
	}
	//查看某个任务
	public Task findById(int id) throws FindTaskByIdException {
		try {
			return dao.findById(id);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			throw new FindTaskByIdException("查询失败");
		}
	}
	//查询实施中的任务
	 public List<Task> slts() throws SltException {
	    	try {
				return dao.slts();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new SltException("查询任务失败");
			}
	    }
	//查询未分配的任务
	    public List<Task> slt() throws SltException {
	    	try {
				return dao.slt();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new SltException("查询未分配任务失败");
			}
	    }
	  //修改任务信息
	    public int updateTask(Task task) throws UpdateTaskMessagException {
	    	try {
				return dao.updateTask(task);
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
				throw new UpdateTaskMessagException("修改任务信息失败");
			}
	    }
}
