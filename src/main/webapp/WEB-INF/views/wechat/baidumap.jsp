<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>核聚瑞增-地址</title>

	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=yeMT7mk7YiOj3Wyrgl2o0YgQLI9QDWR8"></script>  
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script><!--调用jQuery-->
    <style type="text/css">
        body, html,#allmap {width: 100%;height: 100%;overflow: hidden;margin:0;font-family:"微软雅黑";}
    </style> 
    
</head>
<body>
		<div id="allmap"></div>
</body>
<script type="text/javascript">  

    var map = new BMap.Map("allmap");  
    var point = new BMap.Point(116.347994,39.970454);
    map.centerAndZoom(point, 18);  
    map.enableScrollWheelZoom(); 

    var myIcon = new BMap.Icon("img/myicon.png",new BMap.Size(200,200),{
        anchor: new BMap.Size(20,30)    
    });

    var marker=new BMap.Marker(point,{icon: myIcon});  
    map.addOverlay(marker);  

    var geolocation = new BMap.Geolocation();
    geolocation.getCurrentPosition(function(r){
        if(this.getStatus() == BMAP_STATUS_SUCCESS){
            var mk = new BMap.Marker(r.point);
            map.addOverlay(mk);
            var latCurrent = r.point.lat;
            var lngCurrent = r.point.lng;
        }
        else {
            alert('failed'+this.getStatus());
        }        
    },{enableHighAccuracy: true})

	
	//提示框
    map.addOverlay(marker);  
    var licontent="<b>华杰大厦B座11楼11B1</b><br>";  
        licontent+="<span><strong>地址：</strong>北京市海淀区大钟寺13号</span><br>";  
        licontent+="<span><strong>电话：</strong>(010)82609188</span><br>";          
    var opts = { 
        width : 200,
        height: 90,
    };         
    var  infoWindow = new BMap.InfoWindow(licontent, opts);  
    marker.openInfoWindow(infoWindow);  
    marker.addEventListener('click',function(){
        marker.openInfoWindow(infoWindow);
    });  

</script>
</html>
