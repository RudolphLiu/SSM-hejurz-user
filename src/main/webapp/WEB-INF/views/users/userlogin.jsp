<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>核聚瑞增</title>
<%@include file="../common/share_static.jsp" %>
<link href="<%=contextPath %>/css/style_log.css" rel="stylesheet" type="text/css">
</head>
<body class="login">
	<%-- <div align="center">
		<form action="<%=basePath %>signin/sign.do" method="post">
	 		<p>手机号：</p><input type="text" name="user_login_phone"/>
			<p>密码：</p><input type="password" name="user_password"/>
			<input type="submit" value="注册"/>
	 	</form>
	</div> --%>
	<div class="ad_m">
		<img src="<%=contextPath %>/images/login/log_guanggao1.jpg"/>
	</div>
	<!--登录框begin-->
	<div class="login_m">
	<div class="login_boder">
	<div class="login_padding" id="login_model">
	 				<form id="contact" action="" method="post">
						<div class="form-group">
							<label for="exampleInputEmail1">用户名：</label>
							<input type="text" id="username" class="form-control" required autofocus placeholder="用户名" autocomplete="off">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">密码：</label>
							<input type="password" id="upassword" class="form-control" placeholder="密码" required autocomplete="off">
						</div>
						<div class="checkbox">
							<label>
						      <input type="checkbox">记住密码
						    </label>
						</div>
						 <a href="http://www.bootcss.com/" class="button button-primary button-pill button-small">登录</a>
						<a href="#" style="margin-left:120px">立即注册>>></a>
					</form>
	  </div>
	</div>
	</div>
	<!--登录框end-->
</body>
<script type="text/javascript">
			document.getElementById('username').setCustomValidity("请输入用户名");
			document.getElementById('upassword').setCustomValidity("请输入密码");
</script>
</html>