<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>查看员工</title>
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no"/>
    <link rel="stylesheet" type="text/css" href="/css/listStyle.css"/>
	
    <link rel="stylesheet" type="text/css" href="/css/listBootstrap.css"/>
	
    <script src="/js/jquery.min.js"></script>
    <script src="/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="/js/bootbox.min.js"></script>
	
</head>
<body>
<div class="box">
    <div class="title">${sessionScope.user.name }的员工</div>
    <div class="content">
        <!--搜索输入框及查询、重置按钮-->
        <div class="container content_width">
            <div class="person_search">
                <div class="search_input">
                    <div class="input-group mb-3">
                        <span>姓名：</span>
                        <input id="Ktext" type="text" class="form-control" placeholder="请输入姓名">
                    </div>
                </div>
                <div class="search_input">
                    <div class="input-group mb-3" hidden>
                        <span>工号：</span>
                        <input id="job_num" type="text" class="form-control" placeholder="请输入工号">
                    </div>
                </div>
                <div class="search_input">
                    <button class="btn btn-primary search_btn" type="button" id="search_btn">查询</button>
                    <button class="btn btn-primary search_btn" type="button" id="back_btn">重置</button>
                </div>
            </div>
            <div class="line"></div>
        </div>
        <!--添加按钮及bootstrap的模态框-->
        <div class="export">
            <button id="new_add" type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#renyuan">
                <img src="img/add_two.png"/>
                <span>添加</span>
            </button>
            <div class="modal fade" id="renyuan">
                <div class="modal-dialog modal-lg modal_position">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title">添加</h4>
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                        </div>
                        <div class="modal-body">
                            <table id="xztb" class="table">
                                <!--新修改弹窗的样式-->
                                <tbody>
                                <tr>
                                    <td class="tb_bg"><label for=""><font style="font-size: 14px; color: red;">*</font>姓名</label>
                                    </td>
                                    <td><input class="userName" type="text" placeholder="请输入姓名"/></td>
                                    <td class="tb_bg"><label for=""><font style="font-size: 14px; color: red;">*</font>工号</label>
                                    </td>
                                    <td><input class="jobNum" type="number" placeholder="请输入工号"/></td>
                                </tr>
                                <tr>
                                    <td class="tb_bg"><label for=""><font style="font-size: 14px; color: red;">*</font>手机号</label>
                                    </td>
                                    <td><input class="phoneNum" type="number" placeholder="请输入手机号"/></td>
                                    <td class="tb_bg"><label for="">产品名称</label></td>
                                    <td><input type="text" placeholder="请输入产品名称"/></td>
                                </tr>
                                <tr>
                                    <td class="tb_bg"><label for="">技能等级</label></td>
                                    <td>
                                        <select class="form-control select_down" style="font-size: 13px; color: #666;">
                                            <option>一级</option>
                                            <option>二级</option>
                                            <option>三级</option>
                                        </select>
                                    </td>
                                    <td class="tb_bg"><label for="">用户类型</label></td>
                                    <td>
                                        <select class="form-control select_down" style="font-size: 13px; color: #666;">
                                            <option>初级</option>
                                            <option>中级</option>
                                            <option>高级</option>
                                            <option>专家</option>
                                        </select>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
                            <button id="add_btn" type="button" class="btn btn-secondary">确定</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--表格列表-->
        <table id="tb" class="table">
            <thead>
            <tr>
                <th>用户名</th>
                <th>姓名</th>
                <th>密码</th>
                <th>性别</th>
                <th>出生日期</th>
                <th>入职时间</th>
                <th>职位</th>
                <th>学历</th>
                <th>经历</th>
                <th>身份标志</th>
                <th>上级编号</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            <c:forEach items="${employeeList }" var="employee" varStatus="status">
            <tr>
                <td>${employee.username }</td>
                <td>${employee.name }</td>
                <td>${employee.password }</td>
                <td>${employee.sex }</td>
                <td>${employee.birthday }</td>
                <td>${employee.heir_date }</td>
                <td>${employee.qualificaton }</td>
                <td>${employee.position }</td>
                <td>${employee.professional }</td>
                <td>${employee.experience }</td>
                <td>${employee.flag }</td>
                <td>${employee.super_id }</td>
                <td>
                    <a href="#" class="edit">编辑</a>
                    <a href="#" class="del">删除</a>
                </td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<script src="/js/mejs.js"></script>
</body>
</html>
