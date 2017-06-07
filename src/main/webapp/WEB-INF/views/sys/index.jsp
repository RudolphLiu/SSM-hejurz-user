<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>核聚瑞增</title>
<%@include file="../common/share_static.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/main.css" />
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/css/signinfo.css"/>
</head>
<body data-spy="scroll" data-target="#navbar">
<!-- 导航栏begin -->
<header id="header" role="banner">
  <div class="container">
    <div id="navbar" class="navbar navbar-default">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
        <a class="navbar-brand" href="index.html"><img src="/images/hjrzlogo.png" style="width: 190px; height: 47px;"></a> </div>
	      <div class="collapse navbar-collapse">
			        <ul class="nav navbar-nav">
			          <li class="active"> <a href="#myCarousel">首页</a> </li>
			          <li> <a href="#services">服务简介</a> </li>
			          <li> <a href="#portfolio">硬件推广</a> </li>
			          <li> <a href="#pricing">软件定制</a> </li>
			          <li> <a href="#about-us">采购专栏</a> </li>
			          <li> <a href="#contact">联系我们</a> </li>
			        </ul>
	        </div>
    </div>
      <c:choose>
        	<c:when test="${user_basic_info.user_login_phone}!=null">
        		<div class="userbtn">
        			<div class="dropdown">
							<button class="btn btn-info dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
								${user_basic_info.user_login_phone}
								<span class="caret"></span>
							</button>
							<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
								<li><a href="#">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">Separated link</a></li>
							</ul>
					</div>
        		</div>
        	</c:when>
        	<c:when test="${user_basic_info.user_login_phone}!=null && ${user_detail_info.user_realname}!=null">
        		<div class="userbtn">
        			<div class="dropdown">
							<button class="btn btn-info dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
								${user_detail_info.user_realname}
								<span class="caret"></span>
							</button>
							<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
								<li><a href="#">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">Separated link</a></li>
							</ul>
					</div>
        		</div>
        	</c:when>
        	<c:otherwise>
        	<div class="userbtn">
        		<div class="dropdown">
					<a href="http://www.bootcss.com/" class="button button-glow button-border button-rounded button-primary button-small">登录</a>
				</div>
			</div>
        	</c:otherwise>
        </c:choose>
  </div>
</header>
<!-- 导航栏end -->

<!-- 轮播横幅begin -->
<section id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="3000">
    <ol class="carousel-indicators" style="margin-bottom: 50px;">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
        <div class="item active">
			<img src="<%=contextPath %>/images/explogo1.jpg" alt="First slide">
		</div>
		<div class="item">
			<img src="<%=contextPath %>/images/explogo2.jpg" alt="Second slide">
		</div>
		<div class="item">
			<img src="<%=contextPath %>/images/explogo4.jpg" alt="Third slide">
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
      <ul class="portfolio-items col-4">
        <li class="portfolio-item">
          <div class="item-inner">
          	<h4>服务器</h4>
            <a href="" class="button button-small-caps button-primary">机架式服务器</a>
            <a href="" class="button button-small-caps button-primary">直立式服务器</a>
            <a href="" class="button button-small-caps button-primary">存储式服务器</a>
            <a href="" class="button button-small-caps button-primary">刀片式服务器</a>
          </div>
        </li>
        <!--/.portfolio-item-->
        <li class="portfolio-item">
          <div class="item-inner">
          	<h4>工作站</h4>
            <a href="" class="button button-uppercase button-primary">英特尔工作站</a>
            <a href="" class="button button-uppercase button-primary">AMD工作站</a>
            <a href="" class="button button-uppercase button-primary">高性能工作站</a>
            <a href="" class="button button-uppercase button-primary">GPU工作站</a>
          </div>
        </li>
        <!--/.portfolio-item-->
        <li class="portfolio-item">
          <div class="item-inner">
          	<h4>电脑组件</h4>
            <a href="" class="button button-uppercase button-primary">商用台式机</a>
            <a href="" class="button button-uppercase button-primary">商用笔记本</a>
            <a href="" class="button button-uppercase button-primary">商用显示器</a>
          </div>
        </li>
        <!--/.portfolio-item-->
        <li class="portfolio-item">
          <div class="item-inner">
          	<h4>显示器</h4>
            <a href="" class="button button-uppercase button-primary">uppercase</a>
            <a href="" class="button button-uppercase button-primary">uppercase</a>
            <a href="" class="button button-uppercase button-primary">uppercase</a>
            <a href="" class="button button-uppercase button-primary">uppercase</a>
          </div>
        </li>
        <!--/.portfolio-item-->
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
        <p class="lead">我们将以个性化的创意策划、成熟的网站建设技术、
        	杰出的多媒体网站设计能力、强大的程序开发实力、
        	丰富的网站维护经验以及全方位的网络营销策略，
        	力求为企业提供真正专业、全面的网站建设服务。</p>
      </div>
      <!--/.center-->
      <div class="big-gap"></div>
      <div id="pricing-table" class="row">
        <div class="col-sm-4">
          <ul class="plan">
            <li class="plan-name">ERP系统开发</li>
            <li><img src="<%=contextPath %>/images/soft_1101.jpg"></li>
       			<li>
						量身定制企业资源计划管理系统,提高企业生产力和竞争力,满足业务需要和市场要求。</li>
            <li class="plan-action"><span class="button-wrap">
						    <a href="" class="button button-pill button-raised button-primary">查看</a>
						  </span></li>
          </ul>
        </div>
        <!--/.col-sm-4-->
        <div class="col-sm-4">
          <ul class="plan">
            <li class="plan-name">application开发</li>
            <li><img src="<%=contextPath %>/images/soft_1102.jpg"></li>
            <li>精通各平台应用微信公众号开发，APP软件定制开发.有丰富的实战经验,品质保证。</li>
            <li class="plan-action"><span class="button-wrap">
						    <a href="" class="button button-pill button-raised button-primary">查看</a>
						  </span></li>
          </ul>
        </div>
        <!--/.col-sm-4-->
        <div class="col-sm-4">
          <ul class="plan">
            <li class="plan-name">OA系统开发</li>
            <li><img src="<%=contextPath %>/images/soft_1103.jpg"></li>
            <li>专业定制开发企业客户关系管理软件,应用快速开发平台帮助企业提高工作效率。</li>
            <li class="plan-action"> <span class="button-wrap">
						    <a href="" class="button button-pill button-raised button-primary">查看</a>
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
        <h2>采购专栏</h2>
        <p class="lead">根据您的需求，选择适合的服务，我们将为您提供....</p>
      </div>
      <div class="gap"></div>
      <div id="team-scroller" class="carousel scale">
        <div class="carousel-inner">
          <div class="item active">
            <div class="row">
              <!--<div class="col-sm-4">
                <div class="member">
                  <p><img class="img-responsive img-thumbnail img-circle" src="images/team1.jpg" alt=""></p>
                  <h3>Agnes Smith<small class="designation">CEO &amp; Founder</small></h3>
                </div>
              </div>
              <div class="col-sm-4">
                <div class="member">
                  <p><img class="img-responsive img-thumbnail img-circle" src="images/team2.jpg" alt=""></p>
                  <h3>Donald Ford<small class="designation">Senior Vice President</small></h3>
                </div>
              </div>
              <div class="col-sm-4">
                <div class="member">
                  <p><img class="img-responsive img-thumbnail img-circle" src="images/team3.jpg" alt=""></p>
                  <h3>Karen Richardson<small class="designation">Assitant Vice President</small></h3>
                </div>
              </div>-->
            </div>
          </div>
          <div class="item">
            <div class="row">
              <div class="col-sm-4">
                <div class="member">
                  <p><img class="img-responsive img-thumbnail img-circle"></p>
                  <h3>David Robbins<small class="designation">Co-Founder</small></h3>
                </div>
              </div>
              <div class="col-sm-4">
                <div class="member">
                  <p><img class="img-responsive img-thumbnail img-circle"></p>
                  <h3>Philip Mejia<small class="designation">Marketing Manager</small></h3>
                </div>
              </div>
              <div class="col-sm-4">
                <div class="member">
                  <p><img class="img-responsive img-thumbnail img-circle" ></p>
                  <h3>Charles Erickson<small class="designation">Support Manager</small></h3>
                </div>
              </div>
            </div>
          </div>
        </div>
        <a class="left-arrow" href="#team-scroller" data-slide="prev"> <i class="icon-angle-left icon-4x"></i> </a> <a class="right-arrow" href="#team-scroller" data-slide="next"> <i class="icon-angle-right icon-4x"></i> </a> </div>
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
          <form id="main-contact-form" class="contact-form" name="contact-form" method="post" action="sendemail.php" role="form">
            <div class="row">
              <div class="col-sm-6">
                <div class="form-group">
                  <input type="text" class="form-control" required="required" placeholder="如何称呼您">
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <input type="text" class="form-control" required="required" placeholder="您的电子邮箱">
                </div>
              </div>
            </div>
            <div class="row">
              <div class="col-sm-12">
                <div class="form-group">
                  <textarea name="message" id="message" required class="form-control" rows="8" placeholder="请输入信息"  style="resize:none" ></textarea>
                </div>
                <div class="form-group">
                  <button type="submit" class="btn btn-danger btn-lg">发送</button>
                </div>
              </div>
            </div>
          </form>
        </div>
        <!--/.col-sm-6-->
        <div class="col-sm-6">
          <h4>公司地址：</h4>
          <div class="row">
            <div class="col-md-10">
            	<h3>北京市海淀区大钟寺13号院华杰大厦B座11BI室</h3>
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

</body>
</html>