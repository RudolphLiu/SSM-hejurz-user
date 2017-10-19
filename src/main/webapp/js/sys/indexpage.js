/**
 * this is indexpage javascript
 */
var hjrz_index = (function (){
	var index = {
			sendfeedback:function()
			{	
				var fb_user_name = $.trim($("#sendfb_username").val());
				var fbuseremail = $.trim($("#sendfb_email").val());
				var link_message = $.trim($("#fb_message").val());
				 var FeedbackForm = {
						fb_user_name:fb_user_name,
						fbuseremail:fbuseremail,
						link_message:link_message
				 }
					$.ajax({
						 	url:"/FeedBack/sendfeedback.hjrz",
						 	data:JSON.stringify(FeedbackForm),
						 	type: 'post',
			                dataType: 'json',
			                contentType:"application/json",
						    success:function(data){
						    	if(data.callStatus == 'SUCCESS'){
						    			alert("success");
						    	}
						    	else{
						    		alert("发送失败！");
						    	}
					   	 	}
					});
			},
			initpage:function()
			{
				var self = this;
				$("#sendfb").click(function(){
					self.sendfeedback();
				});
			}
	}
	return index;
})();

$(document).ready(function() {
	hjrz_index.initpage();
});