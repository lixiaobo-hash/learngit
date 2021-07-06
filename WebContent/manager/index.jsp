<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>左侧导航栏</title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<link rel="stylesheet" type="text/css" href="/css/page.css" />
		<link href="/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
		<link href="/css/icons.min.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		<div class="page" id="app">
			<div class="nav-left" v-show="navLeftFlag" ref="navLeft">
				<div class="LogoName">
					任务管理系统
				</div>
				<div class="navDiv">
					<div class="nav-list">
						<ul>
							<li class="nav-tab a_active waves-effect">
								<a href="${pageContext.request.contextPath }/FdAllTaskServlet" class="li-a" target="iframe"><i class='bx bx-home-smile'></i> 查看任务
								</a>
							</li>
							<li class="nav-tab nav-ul">
								<a href="makeTask.jsp" class="li-a active" target="iframe"><i class='bx bx-home-smile'></i> 制定任务
								</a>
							</li>
							
							<li class="nav-tab nav-ul">
								<a href="${pageContext.request.contextPath }/FindStateServlet" class="li-a" target="iframe"><i class='bx bx-home-smile'></i> 调整任务
								</a>
							</li>
							<li class="nav-tab nav-ul">
								<a href="${pageContext.request.contextPath }/FindExecutoryServlet" class="li-a" target="iframe"><i class='bx bx-home-smile'></i> 跟踪任务
								</a>
							</li>
							<li class="nav-tab nav-ul">
								<a href="${pageContext.request.contextPath }/FindAllEmployeeServlet" class="li-a" target="iframe"><i class='bx bx-home-smile'></i> 查看人员
								</a>
							</li>
							<li class="nav-tab nav-ul">
								<a href="${pageContext.request.contextPath }/ExitServlet" class="li-a" ><i class='bx bx-home-smile'></i> 退出登录
								</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="nav-right" ref="navRight">
				<div class="nav-top">
					<button type="button" class="btn btn-primary btn-sm hiddenBtn" style="line-height: 10px;" @click="isShowLeft">
						<i class="bx bx-grid-alt" style="font-size: 16px;"></i>
					</button>
					<!-- <button type="button" class="btn btn-primary btn-sm showBtn" style="line-height: 10px; display: none;" onclick="showNavRight">
						<i class="bx bx-expand" style="font-size: 16px;"></i>
					</button> -->
				</div>
				<div class="content-page" ref="cPage">
					<iframe name="iframe" width="100%" height="100%" frameborder="0" src="${pageContext.request.contextPath }/FdAllTaskServlet"></iframe>
				</div>
			</div>
		</div>
		<script src="/js/vue.min.js"></script>
		<script src="https://www.jq22.com/jquery/jquery-1.10.2.js"></script>
		<script type="text/javascript">
			$(function() {
				let navflag = false;
				$('.nav-tab').click(function() {
					$(this).siblings().each(function() {
						$(this).removeClass('a_active');
						// $(this).removeClass('a_active');
						$(this).find('.nav-box').css('height', '0')
						//关闭右侧箭头
						if ($(this).attr('class').indexOf('nav-ul') != -1) {
							$(this).find('.bx-chevron-right').css('transform', 'rotateZ(0deg)')
							$(this).find('.bx-chevron-right').css('transition', 'all .5s')
							$(this).removeClass('nav-show')
							// $(this).find('div').removeClass('nav-box')
						}
					})
					//当前选中
					$(this).addClass('a_active')
					$(this).find('.li-a').addClass('active')
					// 打开右侧箭头
					$(this).find('.bx-chevron-right').css('transform', 'rotateZ(90deg)')
					$(this).find('.bx-chevron-right').css('transition', 'all .5s')
					$(this).addClass('nav-show')
					// $(this).find('div').addClass('nav-box')
				})
				/* 二级菜单a点击事件 */
				$(".li-a-a").click(function() {
					$(".li-a-a").each(function() {
						$(this).removeClass('active-li-a');
					})
					$(this).addClass('active-li-a');
				})

			})
			const vue = new Vue({
				el: '#app',
				data: {
					navLeftFlag: true
				},
				methods: {
					isShowLeft() {
						if (this.navLeftFlag ) {
							this.$refs.navRight.style.paddingLeft = '0px'
							this.$refs.cPage.style.left = '0px';
							this.navLeftFlag = false;
							// this.$refs.navLeft.style.width = '0px';
							// setTimeout(()=>{
							// 	this.navLeftFlag = false;
							// },200)
						} else {
							this.$refs.navRight.style.paddingLeft = '240px';
							this.$refs.cPage.style.left = '240px';
							this.navLeftFlag = true;
							// this.$refs.navLeft.style.width = '240px';
							// setTimeout(()=>{
							// 	this.navLeftFlag = true;
							// },200)
						}
					}
				}
			})
		</script>
	</body>
</html>

