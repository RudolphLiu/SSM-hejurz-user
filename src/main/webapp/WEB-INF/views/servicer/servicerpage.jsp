<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>服务器—核聚瑞增系统科技</title>
		<%@include file="../common/share_static.jsp" %>
		<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/servicer/servicerpage.css" />
	</head>
<body style="background: #e5e5e5;">
	<%@include file="../common/topnavbar.jsp" %>
	<div class="container" style=" margin-top:50px;">
		<div class="navbar-wrapper">
		<div class="col-md-3 col-sm-3 blog-sidebar pull-left" style="margin-right:10px;">
          <div class="sidebar-module sidebar-module-inset">
            <h4>关于服务器</h4>
            <p>Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>
          </div>
          <div class="sidebar-module sidebar-module-inset">
            <h4>服务器类型</h4>
            <ol class="list-unstyled">
            <c:forEach items="${servertype}" var="s" begin="0" varStatus="status">
              <li><a href="#">${s.typeName}</a></li>
              </c:forEach>
            </ol>
          </div>
          <div class="sidebar-module sidebar-module-inset">
            <h4>友情链接</h4>
            <ol class="list-unstyled">
              <li><a href="http://www.baidu.com" target="view_window">百度</a></li>
              <li><a href="https://www.aliyun.com/" target="view_window">阿里云</a></li>
              <li><a href="http://www.hejurz.com/" target="view_window">核聚瑞增</a></li>
            </ol>
          </div>
          
          <div class="sidebar-module sidebar-module-inset">
            <h4>联系我们</h4>
            <ol class="list-unstyled">
              <li><p>电话:010-82609188</p></li>
              <li><p>手机:18911292847</p></li>
              <li><p>邮箱:HR@hejuruz.com</p></li>
              <li><p>地址:北京市海淀区大钟寺华杰大厦11B1</p></li>
            </ol>
          </div>
        </div><!-- /.blog-sidebar -->

		<!--正文内容-->
		<div class="row">
        <div class="col-md-8 col-sm-8 sidebar-module-inset blog-main pull-left">
        	<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">查找服务器</h3>
				</div>
				<div class="panel-body">
					<form class="form-horizontal">
					  <div class="form-group">
					    <label class="col-sm-2 control-label">名称：</label>
					    <div class="col-sm-10">
					      <input type="email" class="form-control" id="inputEmail3" placeholder="根据名称查找到服务器">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">简介内容：</label>
					    <div class="col-sm-10">
					      <input type="password" class="form-control" id="inputPassword3" placeholder="根据简介内容查找到服务器">
					    </div>
					  </div>
					  <div class="form-group">
					    <div class="col-sm-offset-2 col-sm-10">
					      <button type="submit" class="btn btn-default">条件查询</button>
					    </div>
					  </div>
					</form>
        		</div>
        	</div>
        	
        	<c:forEach items="${servicerModel}" var="s" begin="0" varStatus="status">
          	<div class="panel panel-default">
				<div class="panel-body">
					<img src="img/soft_1101.jpg" class="img-thumbnail col-sm-3 col-md-3">
					<p><a>${s.serverName}</a></p>
					<p>${s.productdesc}</p>
				</div>
			</div>
			</c:forEach>
	
        </div><!-- /.blog-main -->
     </div>
      <a href="#top" id="goTop"><i class="fa fa-angle-up fa-3x"></i></a>
	</div>
	</div>
	
    <footer class="blog-footer">
      <p>Blog template built for <a href="http://getbootstrap.com">Bootstrap</a> by <a href="https://twitter.com/mdo">@mdo</a>.</p>
      <p>
        <a href="#">Back to top</a>
      </p>
    </footer>
	
</body>
</html>