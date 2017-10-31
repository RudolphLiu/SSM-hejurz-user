<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>核聚瑞增</title>
<%@include file="../common/share_static.jsp" %>
<script type='text/javascript' src='/js/jquery.particleground/jquery.particleground.min.js'></script>
<link href="<%=contextPath %>/css/style_log.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="/css/formcss/forminput.css" />
</head>
<body>
	<div id="particles">
		<div class="intro">
		
		
	<div class="login_m">
	<img src="/images/hjrzlogo.png" style="width:400px; height:100px;">
		<div class="login_boder">
			<div class="login_padding" id="login_model">
				<h3 style="display:inline;">用户登录</h3>
				
	 			<span class="input input--kaede" style="margin-bottom:0px;">
					<input class="input__field input__field--kaede" type="text" id="user_login_phone"/>
					<label class="input__label input__label--kaede" for="user_login_phone">
						<span class="input__label-content input__label-content--kaede">手机号</span>
					</label>
				</span>
				<span class="input input--kaede">
					<input class="input__field input__field--kaede" type="password" id="user_password"/>
					<label class="input__label input__label--kaede" for="user_password">
						<span class="input__label-content input__label-content--kaede">密码</span>
					</label>
				</span>
				
			<a id="loginsubmit" class="button button-block button-rounded button-primary">登录</a>
	 	   </div>
		</div>
		
		<div style="text-align: center;display:block;">
			<p>还没账号？<a href="/Signup.hjrz">注册>>></a></p>
			<p>忘记密码？<a href="#">找回>>></a></p>
		</div>
	</div>
	
		</div>
	</div>
	
<script src="/js/jquery.particleground/particleplayer.js"></script>
<script src="/js/formjs/classie.js"></script>
		<script>
			(function() {
				// trim polyfill : https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/Trim
				if (!String.prototype.trim) {
					(function() {
						// Make sure we trim BOM and NBSP
						var rtrim = /^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g;
						String.prototype.trim = function() {
							return this.replace(rtrim, '');
						};
					})();
				}

				[].slice.call( document.querySelectorAll( 'input.input__field' ) ).forEach( function( inputEl ) {
					// in case the input is already filled..
					if( inputEl.value.trim() !== '' ) {
						classie.add( inputEl.parentNode, 'input--filled' );
					}

					// events:
					inputEl.addEventListener( 'focus', onInputFocus );
					inputEl.addEventListener( 'blur', onInputBlur );
				} );

				function onInputFocus( ev ) {
					classie.add( ev.target.parentNode, 'input--filled' );
				}

				function onInputBlur( ev ) {
					if( ev.target.value.trim() === '' ) {
						classie.remove( ev.target.parentNode, 'input--filled' );
					}
				}
			})();
		</script>
<script src="/js/users/userlogin.js"></script>
</body>
</html>