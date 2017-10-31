<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>核聚瑞增</title>
<%@include file="../common/share_static.jsp" %>
<link rel="stylesheet" href="<%=contextPath %>/css/signinfo.css"/>
</head>
<body>
	 <div class="container">
					<div align="center">
						<a href="<%=basePath %>common/home/index.hjrz"><img src="<%=contextPath %>/images/sign/signlogo.png"><br/></a>
						<h3>用户注册</h3>
						<hr class="hru"/>
					</div>
					
				<div class="col-xs-8 col-md-8">
					<!-- form begin -->
						<div class="form-horizontal">
							<div class="form-group">
								<label class="col-sm-2 control-label">手机号码：</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="user_login_phone" placeholder="请输入手机号码">
								</div>
							</div>
							<hr/>
							<div class="form-group">
								<label class="col-sm-2 control-label">密码：</label>
								<div class="col-sm-9">
									<input type="password" class="form-control"  id="user_password" placeholder="输入密码">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">确认密码：</label>
								<div class="col-sm-9">
									<input type="password" class="form-control" id="re_password" placeholder="再次输入密码">
								</div>
							</div>
							<hr/>
							<div class="form-group">
								<label class="col-sm-2 control-label">邮箱地址：</label>
								<div class="col-sm-9">
									<input type="email" class="form-control" id="user_email" placeholder="请输入邮箱地址">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">真实姓名：</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="user_realname" placeholder="输入您的真实姓名">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">性别：</label>
								<div class="col-sm-9">
									<label class="radio-inline">
									  <input type="radio" name="user_sex" value="1">男
									</label>
									<label class="radio-inline">
									  <input type="radio" name="user_sex" value="2">女
									</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">所在地址：</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="user_address" placeholder="请输入详细地址">
								</div>
							</div>
							
							<hr/>
							<div class="form-group">
								<div class="col-sm-9" style="text-align: center;">
									<a id="btnsignup" class="button button-primary button-large">立即注册</a>
								</div>
							</div>
						</div>
					<!-- form end -->
				</div>
				<div  class="col-xs-4 col-md-4">
					<div class="otherright">
						<p>已有账号,<a href="<%=basePath %>login.hjrz">直接登录>>></a></p>
						<hr/>
						<b>注册指南：</b>						
						<a href="###">核聚瑞增注册操作指南</a>
						<a href="##">注册时显示手机已被绑定怎么办？</a>
				   </div>
				</div>
				
		</div>
<script type="text/javascript" src="/js/users/usersignin.js"></script>
</body>
</html>