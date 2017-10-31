var user_login = (function(){
	var index = {
		login:function()
		{
			$("#loginsubmit").html('<a class="button button-block button-rounded button-primary">正在登录中..</a>');
			var user_login_phone = $.trim($("#user_login_phone").val());
			var user_password = $.trim($("#user_password").val());
			if(user_login_phone!="" && user_password!="")
			{
				var LoginUserForm = {
						user_login_phone:user_login_phone,
						user_password:user_password,
				};
				$.ajax({
				 	url:"/logininit.hjrz",
				 	data:JSON.stringify(LoginUserForm),
				 	type: 'post',
	                dataType: 'json',
	                contentType:"application/json",
				    success:function(data){
				    	if(data.callStatus == 'SUCCESS'){
				    			window.location.href='/common/home/index.hjrz';
				    	}
				    	else{
				    		alert(data.message);
				    	}
			   	 	}
			});
			}
			else
			{
				alert("请输入用户名及密码");
			}
		},
		initPage:function()
		{
			var self = this;
			document.onkeydown = function (e) {
	            var theEvent = window.event || e;
	            var code = theEvent.keyCode || theEvent.which;
	            if (code == 13) {
	              self.login();
	            }
	        }
			$("#loginsubmit").click(function(){
				self.login();
			});
		}
	}
	return index;
})();

$(document).ready(function() {
	user_login.initPage();
});