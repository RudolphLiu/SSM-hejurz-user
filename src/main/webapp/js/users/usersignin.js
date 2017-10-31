var user_sign = (function(){
	var index = {
		signup:function()
		{
			var user_login_phone = $.trim($("#user_login_phone").val());
			var user_password = $.trim($("#user_password").val());
			var re_password = $.trim($("#re_password").val());
			var user_email = $.trim($("#user_email").val());
			var user_realname = $.trim($("#user_realname").val());
			var user_sex = $("input[name='user_sex']:checked").val();
			var user_address = $.trim($("#user_address").val());
			if(user_password == re_password)
			{
				var SignUserForm = {
						user_login_phone:user_login_phone,
						user_password:user_password,
						user_email:user_email,
						user_realname:user_realname,
						user_sex:user_sex,
						user_address:user_address
				};
				$.ajax({
				 	url:"/signinfo.hjrz",
				 	data:JSON.stringify(SignUserForm),
				 	type: 'post',
	                dataType: 'json',
	                contentType:"application/json",
				    success:function(data){
				    	if(data.callStatus == 'SUCCESS'){
				    			alert("success");
				    			window.location.href='/login.hjrz';
				    	}
				    	else{
				    		alert(data.message);
				    	}
			   	 	}
			});
			}
			else
			{
				alert("两次密码输入不一致");
			}
		},
		initPage:function()
		{
			var self = this;
			$("#btnsignup").click(function(){
				self.signup();
			});
		}
	}
	return index;
})();

$(document).ready(function() {
	user_sign.initPage();
});