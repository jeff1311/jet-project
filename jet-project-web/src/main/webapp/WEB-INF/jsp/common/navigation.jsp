<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${BASE_URL }/jet/js/layer/css/layui.css">
<style type="text/css">
.navigation{
	margin:0 auto;
	padding:0;
	width:100%;
	height:45px;
	background:#24292e;
	/* background:rgba(36,41,46,0.9); */
	color:white;
	box-shadow:0px 0px 8px #333333;/* 水平位移 垂直位移 模糊半径 */
	-webkit-box-shadow:0px 0px 8px #333333;
	-moz-box-shadow:0px 0px 8px #333333;
	font-family:"微软雅黑";
	font-size:xx-small;
}
.navigation > div{
	margin:0 auto;
	width:70%;
	height:45px;
}
.icon{
	float:left;
	width:45px;
	height:45px;
	background:url(image/icon/ios-jet.png) no-repeat center;
	background-size:100%;
}
.com{
	height:45px;   
  	line-height:45px;
}
.nickName{
	float:right;
	margin-right:5px;
	height:45px;
	line-height:45px;
}
.portrait{
	float:right;
	margin-top:5px;
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
.right{
	float:right;
	height:45px;
	line-height:45px;
}
.f_left{
	float:left;
}
.button{
	margin:5px;
	width:80px;
	height:35px;
	line-height:35px;
	text-align:center;
	border-radius:5px;
	cursor:pointer;
	transition:1s;
	-moz-transition:1s; /* Firefox 4 */
	-webkit-transition:1s; /* Safari 和 Chrome */
	-o-transition:1s; /* Opera */
}
.green{
	/* background:#28a745; */
	background:linear-gradient(0deg,#175625,#28a745);
}
.blue{
	/* background:#0088cc; */
	/*background:linear-gradient(0deg,#02486b,#0088cc);*/
}
#register:hover{
	background:linear-gradient(0deg,#02486b,#0088cc);
}
.login_input{
	margin-left:4%;
	margin-top:4%;
	width:90%;
	height:40px;
	font-family:"微软雅黑";
	padding-left:8px;
	border:none;
	border-radius:1px;
	background:#e8e8e8;
	outline: none;
	-webkit-appearance: none;
}
</style>
</head>

<div class="navigation">
	<div>
		<span class="icon"></span>
		<span class="com">www.jet.com 喷气航模论坛</span>
		<span class="right">
			<c:choose>
				<c:when test="${!empty userInfo }">
					<span class="portrait"><img alt="" src="${BASE_URL }/jet/image/portrait/skull39.png"></span>
					<span class="nickName">jeff1311</span>
				</c:when>
				<c:otherwise>
					<div id="login" class="button f_left green">登录</div>
					<div id="register" class="button f_left blue">注册</div>
				</c:otherwise>
			</c:choose>
		</span>
	</div>
</div>
<script type="text/javascript" src="${BASE_URL }/jet/js/common/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${BASE_URL }/jet/js/layer/layui.all.js"></script>
<script type="text/javascript">
var login = "";
	login += "<form class=\"\">\n";
	login += "	<input type=\"text\" placeholder=\"邮箱\" class=\"login_input\">\n";
	login += "	<input type=\"password\" placeholder=\"密码\" class=\"login_input\">\n";
	login += "<\/form>\n";
$('#login').click(function(){
	//自定页
	layer.open({
	  type: 1,
	  title: "登陆",
	  area: ['400px', '250px'],
	  skin: 'layui-layer-demo', //样式类名
	  closeBtn: 0, //不显示关闭按钮
	  anim: 2,
	  shadeClose: true, //开启遮罩关闭
	  content: login	
	});
})
$('#register').click(function(){	
	window.location="html/register.html"; 
})
</script>
</html>