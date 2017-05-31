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
				<div class="signform" style="align-content:center;">
					<div align="center">
						<img src="<%=contextPath %>/images/sign/signlogo.png"><br/>
						<h4>新用户注册</h4>
						<hr class="hru" />
					</div>
					<div class="textform">
						<form class="form-horizontal">
							<div class="form-group">
								<hr/>
								<label class="col-sm-3 control-label">手机号码：</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="inputEmail3" placeholder="请输入手机号码">
								</div>
							</div>
							<hr/>
							<div class="form-group">
								<label class="col-sm-3 control-label">密码：</label>
								<div class="col-sm-9">
									<input type="password" class="form-control" id="inputPassword3" placeholder="输入密码">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">确认密码：</label>
								<div class="col-sm-9">
									<input type="password" class="form-control" id="inputPassword3" placeholder="再次输入密码">
								</div>
							</div>
							<hr/>
							<div class="form-group">
								<label class="col-sm-3 control-label">邮箱地址：</label>
								<div class="col-sm-9">
									<input type="email" class="form-control" id="inputPassword3" placeholder="请输入邮箱地址">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">真实姓名：</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="inputPassword3" placeholder="输入您的真实姓名">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">性别：</label>
								<div class="col-sm-9">
									<label class="radio-inline">
									  <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">男
									</label>
									<label class="radio-inline">
									  <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">女
									</label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">所在地址：</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="inputPassword3" placeholder="请输入详细地址">
								</div>
							</div>
							<div class="form-group">
							    <div class="col-sm-offset-4 col-sm-10">
							      <a href="http://www.bootcss.com/" class="button button-highlight button-large">注册</a>
							    	<a href="<%=basePath %>home/index.do">返回主页</a>
							    </div>
							</div>
							
						</form>
					</div>
				</div>
			</div>
</body>
</html>