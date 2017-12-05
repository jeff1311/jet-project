<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${BASE_URL }/jet/js/layer/css/layui.css">
<link rel="stylesheet" type="text/css" href="${BASE_URL }/jet/plugin/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${BASE_URL }/jet/plugin/font-awesome-4.7.0/css/font-awesome.min.css">
<!--[if IE 7]>
<link rel="stylesheet" href="${BASE_URL }/jet/css/font-awesome/css/font-awesome-ie7.min.css">
<![endif]-->
<style type="text/css">
.navigation{
	position:fixed;
	margin:0 auto;
	padding:0;
	width:100%;
	height:50px;
/*	background:#24292e;
	background:rgba(36,41,46,0.9); */
/* 	box-shadow:0px 0px 8px #333333;/* 水平位移 垂直位移 模糊半径 */
/*	-webkit-box-shadow:0px 0px 8px #333333;
	-moz-box-shadow:0px 0px 8px #333333; */
	background:#ffffff;
	color:#8a8a8a;
	font-family:"微软雅黑";
	font-size:xx-small;
}
.navigation > div{
	margin:0 auto;
	width:70%;
	height:50px;
}
.icon{
	float:left;
	width:50px;
	height:50px;
	background:url(image/icon/airplane64.png) no-repeat center;
	background-size:100%;
}
.com{
	float:left;
	height:50px;   
  	line-height:50px;
}
.message{
	float:left;
	margin-top:12.5px;
	width:25px;
	height:25px;
	background:url(image/icon/message.png);
	background-size:100%;
}
.message-tip{
	float:left;
	margin-top:2px;
	margin-left:-17px;
	width:30px;
	height:30px;
	background:url(image/icon/redpoint.png);
	background-size:100%;
}
.nickName{
	float:right;
	margin-right:5px;
	height:50px;
	line-height:50px;
}
.portrait{
	float:right;
	margin-top:7.5px;
	width:35px;
	height:35px;
	border-radius:100%;
	background:white url(image/portrait/skull39.png) no-repeat center;
	background-size:100%;
	overflow:hidden;
	box-shadow:0px 0px 8px #333333;/* 水平位移 垂直位移 模糊半径 */
	-webkit-box-shadow:0px 0px 8px #333333;
	-moz-box-shadow:0px 0px 8px #333333;
}
.f-right{
	float:right;
	height:50px;
	line-height:50px;
}
.font-link{
	float:left;
	margin-right:10px;
	cursor:pointer;
	transition:0.5s;
	-moz-transition:0.5s; /* Firefox 4 */
	-webkit-transition:0.5s; /* Safari 和 Chrome */
	-o-transition:0.5s; /* Opera */
}
.font-link:HOVER{
	color:#3c3c3c;
}
.green{
	/* background:#28a745; */
	background:linear-gradient(0deg,#175625,#28a745);
}
.blue{
	/* background:#0088cc; */
	/*background:linear-gradient(0deg,#02486b,#0088cc);*/
}
.login-form{
	text-align:center;
}
.login_input{
	margin-top:5%;
	padding:5px;
	width:90%;
	height:30px;
	border:none;
	background:#f8f8f8;
	outline:none;
	transition:0.5s;
	-moz-transition:0.5s; /* Firefox 4 */
	-webkit-transition:0.5s; /* Safari 和 Chrome */
	-o-transition:0.5s; /* Opera */
}
.login_input:FOCUS {
	background:#e8e8e8;
}
.login-button{
	margin-top:5%;
	width:93%;
	height:38px;
	line-height:38px;
	background:#0088cc;
	color:white;
	border:none;
	cursor:pointer;
	outline:none;
	transition:0.5s;
	-moz-transition:0.5s; /* Firefox 4 */
	-webkit-transition:0.5s; /* Safari 和 Chrome */
	-o-transition:0.5s; /* Opera */
}
.login-button:HOVER {
	background:#009be8;
}
.navi{
	margin-left:50px;
	height:50px;
	line-height:50px;
}
</style>
</head>

<div class="navigation">
	<div>
		<span class="icon"></span>
		<span class="com">www.jet.com</span>
		<!-- <span class="message"></span><div class="message-tip"></div> -->
		<span class="layui-breadcrumb navi" lay-separator="|">
		  <a href="javascript:;" class="anchor" name="news">资讯</a>
		  <a href="javascript:;" class="anchor" name="forum">论坛</a>
		  <a href="javascript:;" class="anchor" name="multi-rotor">多旋翼</a>
		  <a href="javascript:;" class="anchor" name="UAV">无人机</a>
		  <a href="javascript:;" class="anchor" name="fixed-wing">固定翼</a>
		  <a href="javascript:;" class="anchor" name="helicopter">直升机</a>
		  <a href="javascript:;" class="anchor" name="market">交易区</a>
		</span>
		<span id="userModule" class="f-right">
			<c:choose>
				<c:when test="${!empty userInfo }">
					<span class="portrait"><img alt="" src="${BASE_URL }/jet/image/portrait/skull39.png"></span>
					<span class="nickName">${userInfo.nickName }</span>
				</c:when>
				<c:otherwise>
					<div id="login" class="font-link">登录 </div>
					<div id="register" class="font-link">注册</div>
				</c:otherwise>
			</c:choose>
		</span>
	</div>
</div>
<script type="text/javascript" src="${BASE_URL }/jet/js/common/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${BASE_URL }/jet/js/layer/layui.all.js"></script>
<script type="text/javascript">
var loginForm = ['<form id="loginForm" class="login-form">	',
             '		<input type="text" name="email" placeholder="邮箱" class="login_input">',
             '		<input type="password" name="password" placeholder="密码" class="login_input">',
             '		<input type="button" value="登录" class="login-button" onclick="login()">',
             '	</form>'].join("");
             
$('#login').click(function(){
	//自定页
	layer.open({
	  type: 1, //弹窗种类
	  title: "登陆", //主题
	  area: ['350px', '230px'], //窗口大小
	  skin: 'login-layer', //样式类名
	  closeBtn: 1, //不显示关闭按钮
	  anim: 4, //动画
	  shadeClose: true, //开启遮罩关闭
	  content: loginForm //内容
	});
})

function login(){	
	$.ajax({
		type:'post',
		url:'${BASE_URL}/jet/login',
		data:$('#loginForm').serialize(),
		dataType:'json',
		success:function(result){
			if(result.code==1){
				layer.closeAll();
				var userHtml=['<span class="portrait"><img alt="" src="${BASE_URL }/jet/image/portrait/skull39.png"></span>',
				              '<span class="nickName">jeff1311</span>'].join("");
				$('#userModule').html(userHtml);
			}else{
				layer.msg(result.errMsg);
			}
		}
	})
}

$('#register').click(function(){	
	window.location="html/register.html"; 
})

$('.anchor').click(function(){
	var id=$(this).attr('name');
	$("html,body").animate({scrollTop: $("#"+id).offset().top-60}, 100);
})
</script>
</html>