<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
	
		<title>工作站-核聚瑞增系统科技</title>
		<%@include file="../common/share_static.jsp" %>
		<link rel="stylesheet" type="text/css" href="/css/servicer/servicerpage.css" />
		<link rel="stylesheet" type="text/css" href="/css/servicer/main.css" />
		<link rel="stylesheet" type="text/css" href="/css/servicer/jquery.fancybox.css" />
		<link rel="stylesheet" type="text/css" href="/css/font-awesome.min.css" />
		<link rel="stylesheet" type="text/css" href="/css/servicer/indent.css" />
		<script type="text/javascript" src="/js/servicer/jquery.sticky.js"></script>
		<script type="text/javascript" src="/js/servicer/script.js"></script>
		<script type="text/javascript" src="/js/servicer/jquery.themepunch.tools.min.js"></script>
		<script type="text/javascript" src="/js/servicer/jquery.themepunch.revolution.min.js"></script>
		<script type="text/javascript" src="/js/servicer/imagesloaded.pkgd.min.js"></script>
		<script type="text/javascript" src="/js/gettime.js"></script>
	</head>
<body style="background-image: url(../images/bg-1.jpg);">
		<%@include file="../common/topnavbar.jsp" %>
	<!-- header page-->
    <header>
      <!-- site top panel-->
      <div class="site-top-panel">
        <div class="container p-relative">
          <div class="row">
            <div class="col-sm-6">
              <!-- lang select wrapper-->
              <div class="top-left-wrap">
                <div class="lang-wrap">
                  <div>
                    <ul>
                      <li>
                       <label id="timeShow"></lable>
                      </li>
                    </ul>
                  </div>
                </div><span>|</span>
              </div>
              <!-- ! lang select wrapper-->
            </div>
            <div class="col-sm-6 text-right">
              <div class="top-right-wrap">
                <div class="top-login"><i class="flaticon-people-2"></i>Login</div><span>|</span>
                <div class="top-shop"><i class="flaticon-commerce"></i>足迹
                  <aside class="widget-top-sellers #cart-menu">
                    <p>There Are <span>2 items</span> In Your Bag</p>
                    <!-- item recent post-->
                    <div class="item-top-sellers clearfix"><img src="pic/shop/70x80/1.jpg" data-at2x="pic/shop/70x80/1@2x.jpg" alt>
                      <h3 class="title"><a href="single.html">Integer ante arcu serius</a> <a href="#" class="#close"><i class="flaticon-cross"></i></a></h3>
                      <div class="price">$40.<span class="mini-price">99</span> <span class="old-price">$30.<span class="mini-price">99</span></span></div>
                      <div class="star-rating full"></div>
                      <div class="cws_divider mt-10 mb-10"> </div>
                    </div>
                    <!-- ! item recent post-->
                    <!-- item recent post-->
                    <div class="item-top-sellers clearfix"><img src="pic/shop/70x80/2.jpg" data-at2x="pic/shop/70x80/2@2x.jpg" alt>
                      <h3 class="title"><a href="single.html">Aenean tellus metus</a> <a href="#" class="#close"><i class="flaticon-cross"></i></a></h3>
                      <div class="price">$15.<span class="mini-price">99</span></div>
                      <div class="star-rating full"></div>
                      <div class="cws_divider mt-10 mb-10"></div>
                    </div>
                    <!-- ! item recent post-->
                    <div class="total clearfix">
                      <div class="sub-total">Subtotal: <span>$57</span></div><a href="#" class="clear">Clear All Data <i class="flaticon-recycle"></i></a>
                    </div>
                    <div class="cart-buttons"><a href="cart.html" class="cws-button alt mini">View Cart</a><a href="checkout.html" class="cws-button mini">Checkout</a></div>
                  </aside>
                </div><span>|</span>
                <div class="top-search"><i class="flaticon-interface"></i>Search</div>
              </div>
            </div>
            <div class="search_menu_cont">
              <form role="search" method="get" class="form">
                <div class="search-wrap">
                  <input type="text" placeholder="Search . . ." class="form-control search-field">
                </div>
              </form>
              <div class="search_back_button"><i class="fa fa-close"></i></div>
            </div>
          </div>
        </div>
      </div>
      <!-- ! site top panel-->
      <!-- Navigation panel-->
      <nav class="main-nav js-stick">
        <div class="full-wrapper relative clearfix container">
          <!-- Logo ( * your text or image into link tag *)-->
          <div class="nav-logo-wrap local-scroll"><a href="<%=basePath %>/common/home/index.hjrz" class="logo"><img src="/images/hjrzlogo.png"  style="width: 190px; height: 47px;" data-at2x="/images/hjrzlogo.png" alt><img src="/images/hjrzlogo.png" style="width: 190px; height: 47px;" alt class="sticky-logo"></a></div>
          <!-- Main Menu-->
          <div class="inner-nav desktop-nav switch-menu">
            <ul class="clearlist">
              <!-- Item With Sub-->
				<li><a href="<%=contextPath %>/common/home/index.hjrz">首页</a></li>
				<li><a href="about.html">服务器</a></li>
				<li><a href="single.html">工作站</a></li>
				<li><a href="grid.html">硬件产品</a></li>
				<li><a href="checkout.html">软件产品</a></li>
				<li><a href="contact.html">关于我们</a></li>
            </ul>
            <div class="menu-contacts">
              <div class="menu-contacts-item"><i class="glyphicon glyphicon-tasks cws-icon"></i>
                <p class="mb-0">优质服务器</p>
                <p class="mb-0">共-134-台</p>
                
              </div>
              <div class="menu-contacts-item"><i class="glyphicon glyphicon-earphone cws-icon"></i>
                <p class="mb-0">客户服务电话</p>
                <p class="mb-0">13177536625</p>
              </div>
              <div class="menu-contacts-item"><i class="glyphicon glyphicon-user cws-icon"></i>
                <p class="mb-0">客户：刘子丙</p>
                <p class="mb-0">Sunday: Closed</p>
              </div>
            </div><a href="#" class="menu-bar"><span class="ham"></span></a>
          </div>
          <!-- End Main Menu-->
        </div>
      </nav>
      <!-- End Navigation panel-->
    </header>
    <!-- ! header page-->
    
    <div class="container" style=" margin-top:70px;">
		<div class="navbar-wrapper">
		<div class="col-sm-3 col-sm-offset-1 blog-sidebar" style="margin-right:50px;">
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
        <div class="col-md-7 col-sm-7 sidebar-module-inset blog-main pull-left">
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
        	
        	<c:forEach items="${workstations}" var="w" begin="0" varStatus="status">
          	<div class="panel panel-default">
				<div class="panel-body">
					<img src="img/soft_1101.jpg" class="img-thumbnail col-sm-3 col-md-3">
					<p><a>${w.worksName}</a></p>
					<p><a>${w.workstatype.wks_typeName}</a></p>
					<p><a>${w.workstation_info.productdesc}</a><p>
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