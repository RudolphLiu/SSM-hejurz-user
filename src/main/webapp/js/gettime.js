 var t = null;
    t = setTimeout(time,1000);//开始执行
    function time()
    {
       clearTimeout(t);//清除定时器
       dt = new Date();
       var iYear = dt.getFullYear();
       var month = dt.getMonth()+1;
       var  day= dt.getDate();
       var weekend = dt.getDay();
       var h=dt.getHours();
       var m=dt.getMinutes();
       var s=dt.getSeconds();
       var str;
       if(weekend == 0){
           str = "星期日";
       }else if(weekend == 1){
           str = "星期一";
       }else if(weekend == 2){
           str = "星期二";
       }
       else if(weekend == 3){
           str = "星期三";
       }
       else if(weekend == 4){
           str = "星期四";
       }
       else if(weekend == 5){
           str = "星期五";
       }
       else if(weekend == 6){
           str = "星期六";
       }
       document.getElementById("timeShow").innerHTML = iYear+"年"+month+"月"+day+"日"+"<span>|</span>"+h+"时"+m+"分";
       t = setTimeout(time,1000); //设定定时器，循环执行            
    }