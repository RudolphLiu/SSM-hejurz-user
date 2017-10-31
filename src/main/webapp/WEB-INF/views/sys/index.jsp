<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>核聚瑞增</title>
<%@include file="../common/share_static.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/main.css" />
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/carousel.css" />
<script type="text/javascript" src="<%=contextPath %>/js/main.js" ></script>
</head>
<body data-spy="scroll" data-target="#navbar">
<!-- 导航栏begin -->
<header id="header" role="banner">
  <div class="container">
    <div id="navbar" class="navbar navbar-default">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
        <a class="navbar-brand" href="/common/home/index.hjrz"><img src="<%=contextPath %>/images/hjrzlogo.png" style="width: 190px; height: 47px;"></a> </div>
	      <div class="collapse navbar-collapse">
			        <ul class="nav navbar-nav">
			          <li class="active"><a href="#myCarousel">首页</a></li>
			          <li> <a href="#services">服务简介</a> </li>
			          <li> <a href="#portfolio">硬件产品</a> </li>
			          <li> <a href="#pricing">软件产品</a> </li>
			          <li> <a href="#about-us">解决方案</a> </li>
			          <li> <a href="#contact">联系我们</a> </li>
			        </ul>
	        </div>
	        
      <c:choose>
        	<c:when test="${empty userdata.user_basic_Code}">
        	<div class="navbar-button">
					<a href="<%=basePath %>login.hjrz" class="button button-glow button-border button-rounded button-primary button-small">登录</a>
			</div>
        	</c:when>
        	<c:when test="${not empty userdata.user_basic_Code}">
        		<div class="navbar-button">
							<button class="btn btn-info dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
								${userdata.user_realname}
								<span class="caret"></span>
							</button>
							<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
								<li><a href="#">个人主页</a></li>
								<li><a href="#">私信</a></li>
								<li><a href="#">设置</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">退出</a></li>
							</ul>
					</div>
        	</c:when>
        	<c:otherwise>
        		<div class="navbar-button">
							<button class="btn btn-info dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
								${userdata.user_realname}
								<span class="caret"></span>
							</button>
							<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
								<li><a href="#">个人主页</a></li>
								<li><a href="#">私信</a></li>
								<li><a href="#">设置</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">退出</a></li>
							</ul>
        		</div>
        	</c:otherwise>
        </c:choose>
       </div>
  </div>
</header>
<!-- 导航栏end -->

<!-- 轮播横幅begin -->
<section id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="3000">
    <ol class="carousel-indicators" style="margin-bottom: 50px;">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
         <li data-target="#myCarousel" data-slide-to="3"></li>
          <li data-target="#myCarousel" data-slide-to="4"></li>
    </ol>
    <div class="carousel-inner">
        <div class="item active">
			<img src="<%=contextPath %>/images/banner11.jpg" alt="First slide">
		</div>
		<div class="item">
			<img src="<%=contextPath %>/images/banner12.jpg" alt="Second slide">
		</div>
		<div class="item">
			<img src="<%=contextPath %>/images/banner13.jpg" alt="Third slide">
		</div>
		<div class="item">
			<img src="<%=contextPath %>/images/banner14.jpg" alt="Second slide">
		</div>
		<div class="item">
			<img src="<%=contextPath %>/images/banner15.jpg" alt="Second slide">
		</div>
	</div>
	<!-- 轮播（Carousel）导航 -->
	<a class="carousel-control left"  href="#myCarousel" 
	   data-slide="prev"><i class="glyphicon glyphicon-chevron-left"></i></a>
	<a class="carousel-control right" href="#myCarousel" 
	   data-slide="next"><i class="glyphicon glyphicon-chevron-right"></i></a>
 </section>
 <!-- 轮播横幅end -->
 
 <!-- 服务简介begin -->

 <section id="services">
        <div class="container">
            <div class="box first">
                <div class="row">
                    <div class="col-md-3 col-sm-6">
                        <div class="center">
                            <i class="glyphicon glyphicon-hdd icon-md"></i>
                            <h4>优质服务器</h4>
                            <p>客户无需自己购买服务器，由睿江科技根据客户需求提供指定品牌和配置的服务器，完成系统安装和相应带宽接入后提供给客户使用，降低客户前期业务风险，操作简便快捷。</p>
                        </div>
                    </div><!--/.col-md-4-->
                     <div class="col-md-3 col-sm-6">
                        <div class="center">
                            <i class="glyphicon glyphicon-briefcase icon-md"></i>
                            <h4>服务器托管</h4>
                            <p>根据用户放置服务器大小及台数的不同，提供1U、2U、4U、7U、塔式、整机柜租用服务、VIP机房服务，保证良好的空间、散热、空调环境及标准稳定的电量供应;根据客户需求提供不同档次端口共享、独享带宽服务;根据客户各种的运维需求，量身定做全面系统的售后服务支持，为用户的业务保驾护航。 </p>
                        </div>
                    </div><!--/.col-md-4-->
                    <div class="col-md-3 col-sm-6">
                        <div class="center">
                            <i class="glyphicon glyphicon-tasks icon-md"></i>
                            <h4>网络加速CDN</h4>
                            <p>访问响应迅速，用户体验更好，电信、联通、移动无差别体验，无需改动现有系统，即可实现按需使用，支持千万级的同时在线访问，快速部署及使用，最短1个工作日内完成部署， 前端加速，源站更安全 </p>
                        </div>
                    </div><!--/.col-md-4-->
                     <div class="col-md-3 col-sm-6">
                        <div class="center">
                            <i class="glyphicon glyphicon-send icon-md"></i>
                            <h4>硬件供应</h4>
                            <p>主营DELL、IBM、HP计算机等硬件，包括：台式机、笔记本、服务器、工作站。高端计算机网络；SUSE LINUX、SQLSERVER NETWORKER等软件产品分销和为客户提供完整的信息化建设解决方案，专注于信息技术服务、信息系统的安全和集成</p>
                        </div>
                    </div><!--/.col-md-4-->
                </div><!--/.row-->
            </div><!--/.box-->
        </div><!--/.container-->
    </section><!--/#services-->
 <!-- 服务简介end -->
 <!-- 硬件推广begin -->
 <section id="portfolio">
  <div class="container">
    <div class="hardbox">
      <div class="center gap">
        <h1>硬件供应服务</h1>
        <p>本公司供应各种硬件、电脑、服务器等多种商务机械用品，您可以通过下面的标签栏进行了解</p>
      </div>
      <!--/.center-->
      <!--/#portfolio-filter-->
      <ul class="portfolio-items col-3">
        <li class="portfolio-item">
          <div class="item-inner">
          	<h4>服务器</h4>
            <a href="<%=contextPath %>/server/serverlist.hjrz" class="button button-small-caps button-primary">机架式服务器</a>
            <a href="<%=contextPath %>/server/serverlist.hjrz" class="button button-small-caps button-primary">直立式服务器</a>
            <a href="<%=contextPath %>/server/serverlist.hjrz" class="button button-small-caps button-primary">存储式服务器</a>
            <a href="<%=contextPath %>/server/serverlist.hjrz" class="button button-small-caps button-primary">刀片式服务器</a>
          </div>
        </li>
        <!--/.portfolio-item-->
        <li class="portfolio-item">
          <div class="item-inner">
          	<h4>工作站</h4>
            <a href="<%=contextPath %>/workstation/workstation.hjrz" class="button button-uppercase button-primary">英特尔工作站</a>
            <a href="<%=contextPath %>/workstation/workstation.hjrz" class="button button-uppercase button-primary">AMD工作站</a>
            <a href="<%=contextPath %>/workstation/workstation.hjrz" class="button button-uppercase button-primary">高性能工作站</a>
            <a href="<%=contextPath %>/workstation/workstation.hjrz" class="button button-uppercase button-primary">GPU工作站</a>
          </div>
        </li>
        <!--/.portfolio-item-->
        <li class="portfolio-item">
          <div class="item-inner">
          	<h4>电脑相关</h4>
            <a href="<%=contextPath %>/Hardwares/Hardwares.hjrz" class="button button-uppercase button-primary">整机</a>
            <a href="<%=contextPath %>/Hardwares/Hardwares.hjrz" class="button button-uppercase button-primary">笔记本</a>
            <a href="<%=contextPath %>/Hardwares/Hardwares.hjrz" class="button button-uppercase button-primary">显示器</a>
            <a href="<%=contextPath %>/Hardwares/Hardwares.hjrz" class="button button-uppercase button-primary">显卡</a>
          </div>
        </li>
        <!--/.portfolio-item-->
       <!-- <li class="portfolio-item">
          <div class="item-inner">
          	<h4>显示器</h4>
            <a href="" class="button button-uppercase button-primary">uppercase</a>
            <a href="" class="button button-uppercase button-primary">uppercase</a>
            <a href="" class="button button-uppercase button-primary">uppercase</a>
            <a href="" class="button button-uppercase button-primary">uppercase</a>
          </div>
        </li>
        /.portfolio-item-->
      </ul>
    </div>
    <!--/.box--> 
  </div>
  <!--/.container--> 
</section>
<!-- 硬件推广end -->

<!-- 软件定制begin-->
<section id="pricing">
  <div class="container">
    <div class="box">
      <div class="center">
        <h2>软件定制</h2>
      </div>
      <!--/.center-->
     <!--  <div class="big-gap"></div> -->
      <div id="pricing-table" class="row">
        <div class="col-sm-4">
          <ul class="plan">
            <li class="plan-name">智慧教育</li>
            <li><img src="http://www.hejurz.com/Admin/umeditor/asp/UploadFile/images/SERVER/825SR-S8.jpg" style="width:300px;height:250px;"></li>
       			<li>
						利用教育行业特有的数据（视频课程、电子读物、成绩数据），形成独具教育领域特色的教育教学“私有云”智慧平台，把教育内容、教学手段、教学改进数据化，利用“教育私有云”把教育教学引入大数据时代。</li>
            <li class="plan-action"><span class="button-wrap">
						    <a href="<%=basePath %>/ad/adview.hjrz?id=8" class="button button-pill button-raised button-primary">查看</a>
						  </span></li>
          </ul>
        </div>
        <!--/.col-sm-4-->
        <div class="col-sm-4">
          <ul class="plan">
            <li class="plan-name">云端智能处理地下管网系统</li>
            <li><img src="http://www.gisroad.com/images/3dpline/image001.jpg" style="width:300px;height:250px;"></li>
            <li>综合管廊可视化管理平台是北京核聚瑞增系统科技有限公司利用HGIS平台，整合可视化视频监控、电子智能感应元件、电子智能控制元件、数据智能分析、现实工作仿真模拟等模块，推出的一套专业的、权威的针对地下综合管廊管理的解决方案。</li>
            <li class="plan-action"><span class="button-wrap">
						    <a href="<%=basePath %>/ad/adview.hjrz?id=9" class="button button-pill button-raised button-primary">查看</a>
						  </span></li>
          </ul>
        </div>
        <!--/.col-sm-4-->
        <div class="col-sm-4">
          <ul class="plan">
            <li class="plan-name">软件定制开发</li>
            <li><img src="<%=contextPath %>/images/soft_1101.jpg" style="width:300px;height:250px;"></li>
            <li>核聚瑞增凭借在教育培训行业的经验积累，针对传统教育培训行业所面临的诸多运营和管理问题，能够根据企业的具体需求，从以下方面为教育培训企业提供定制开发服务，借助信息化的力量帮助企业提高运营和管理效率，增强竞争力</li>
            <li class="plan-action"> <span class="button-wrap">
						    <a href="<%=basePath %>/ad/adview.hjrz?id=10" class="button button-pill button-raised button-primary">查看</a>
						  </span></li>
          </ul>
        </div>
        <!--/.col-sm-4--> 
      </div>
    </div>
  </div>
</section>
<!-- 软件定制end -->

<!-- 采购专栏begin -->
<section id="about-us">
  <div class="container">
    <div class="box">
      <div class="center">
        <h2>综合集成解决方案</h2>
        <p class="lead"></p>
      </div>
     <div id="team-scroller">
        <div class="carousel-inner">
         	<!--context start-->
         	<div class="row">
         		
			  <div class="col-sm-6 col-md-3">
			    <div class="thumbnail">
			      <img src="<%=basePath %>/images/index/shenduxuexi.jpg" style="width:250px;height:150px">
				      <div class="caption" style="text-align: center;">
				      <h4><a href="<%=basePath %>/ad/adview.hjrz?id=1">GPU服务器-应用于深度</a></h4>
				        <p>深度学习--GPU服务器方案
				        CAFFE，Tesorflow软件</p>
				      </div>
			    </div>
			  </div>
			  
			  <div class="col-sm-6 col-md-3">
			    <div class="thumbnail">
			      <img src="<%=basePath %>/images/index/Abaqus-1.jpg" style="width:250px;height:150px">
			       <div class="caption" style="text-align: center;">
			         <h4><a href="<%=basePath %>/ad/adview.hjrz?id=2">有限元分析解决方案</a></h4>
				        <p>Abaqus数值模 拟计算Patran/Nastran软件</p>
			      </div>
			    </div>
			  </div>
			  
			  <div class="col-sm-6 col-md-3">
			    <div class="thumbnail">
			      <img src="<%=basePath %>/images/index/Landmark-1.jpg" style="width:250px;height:150px">
			      <div class="caption" style="text-align: center;">
			       <h4><a href="<%=basePath %>/ad/adview.hjrz?id=3">地震数值模拟计算</a></h4>
				        <p>FELAC地震数值模拟Landmark软件</p>
			      </div>
			    </div>
			  </div>
			  
			  <div class="col-sm-6 col-md-3">
			    <div class="thumbnail">
			      <img src="<%=basePath %>/images/index/yixueyingxiang.jpg" style="width:250px;height:150px">
			     <div class="caption" style="text-align: center;">
			       <h4><a href="<%=basePath %>/ad/adview.hjrz?id=4">有限元分析解决方案</a></h4>
				        <p>Abaqus数值模 拟计算Patran/Nastran软件</p>
			      </div>
			    </div>
			  </div>
			  
			  <div class="col-sm-6 col-md-3">
			    <div class="thumbnail">
			      <img src="<%=basePath %>/images/index/liangzihuaxue.jpg" style="width:250px;height:150px">
			     <div class="caption" style="text-align: center;">
			        <h4><a href="<%=basePath %>/ad/adview.hjrz?id=5">量子化学模拟计算</a></h4>
				        <p>Gaussian分子模拟计算ADF软计算</p>
			      </div>
			    </div>
			  </div>
			  
			  <div class="col-sm-6 col-md-3">
			    <div class="thumbnail">
			      <img src="<%=basePath %>/images/index/VASP-1.jpg" style="width:250px;height:150px">
			     <div class="caption" style="text-align: center;">
			        <h4><a href="<%=basePath %>/ad/adview.hjrz?id=6">材料物理计算</a></h4>
				        <p>VASP数值模拟计算MS，GAUSSIAN软件</p>
			      </div>
			    </div>
			  </div>
			  
			  <div class="col-sm-6 col-md-3">
			    <div class="thumbnail">
			      <img src="http://www.hejurz.com/Admin/umeditor/asp/UploadFile/files/%E8%84%B1%E6%9C%BA%E5%8C%85_meitu_3.jpg" style="width:250px;height:150px">
			      <div class="caption" style="text-align: center;">
			        <h4><a href="<%=basePath %>/ad/adview.hjrz?id=7">拖机宝</a></h4>
			        <p>可以轻松解决所有问题。实施变得简单，维护变得容易</p>
			      </div>
			    </div>
			  </div>
			</div>
			
         	<!--context end-->
        </div>
      </div>
      <!--/.carousel--> 
    </div>
    <!--/.box--> 
  </div>
  <!--/.container--> 
</section>
<!-- 采购专栏end -->

<!-- 关于我们begin -->
<section id="contact">
  <div class="container">
    <div class="box last">
      <div class="row">
        <div class="col-sm-6">
          <h1>通知我们</h1>
          <p>请将您的需求、建议发送给我们，留下您的电子邮箱，在我们收到之后会给您回复</p>
          <div class="status alert alert-success" style="display: none"></div>
          <form id="main-contact-form" class="contact-form">
            <div class="row">
              <div class="col-sm-6">
                <div class="form-group">
                  <input type="text" id="sendfb_username" class="form-control" required="required" placeholder="如何称呼您" style="color:#fff">
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <input type="text" id="sendfb_email" class="form-control" required="required" placeholder="您的电子邮箱" style="color:#fff">
                </div>
              </div>
            </div>
            <div class="row">
              <div class="col-sm-12">
                <div class="form-group">
                  <textarea id="fb_message" required class="form-control" rows="8" placeholder="请输入信息"  style="color:#fff;resize:none" ></textarea>
                </div>
                <div class="form-group">
                  <button id="sendfb" type="button" class="btn btn-danger btn-lg">发送</button>
                </div>
              </div>
            </div>
          </form>
        </div>
        <!--/.col-sm-6-->
        <div class="col-sm-6">
          <h4>公司地址：</h4>
          <div class="row">
            <div class="col-md-12">
            	<h3>北京市海淀区大钟寺13号院华杰大厦B座11BI室</h3>
            	<h3>北京市海淀区北京航空航天大学新主楼D座D504</h3>
            </div>
          </div>
          <h4>联系电话：</h4>
          <div class="row">
            <div class="col-md-5">
             	<h3>010-82609188</h3>
			  </div>
          </div>
          <span>Copyright 2016 www.hejurz.com 北京核聚瑞增系统科技有限公司 版权所有 All Rights Reserved
          <br/>
					备案号：京ICP备16018094号
					010-82609188
          </span>
        </div>
        <!--/.col-sm-6--> 
      </div>
      <!--/.row--> 
    </div>
    <!--/.box--> 
  </div>
  <!--/.container--> 
</section>
<!-- 关于我们end -->

<footer id="footer">
  <div class="container">
    <div class="row">
     	<div></div>
    </div>
  </div>
</footer>

<script type="text/javascript" src="/js/sys/indexpage.js"></script>
</body>
</html>