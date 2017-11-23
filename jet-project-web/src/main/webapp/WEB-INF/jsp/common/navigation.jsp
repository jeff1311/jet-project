<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.navigation{
	margin:0 auto;
	padding:0;
	width:100%;
	height:45px;
	background:#3e3e3e;
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
	background:url(image/icon/airplane64.png) no-repeat center;
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
	background:#bdbdbd url(image/portrait/skull39.png) no-repeat center;
	background-size:100%;
	overflow:hidden;
	box-shadow:0px 0px 8px #333333;/* 水平位移 垂直位移 模糊半径 */
	-webkit-box-shadow:0px 0px 8px #333333;
	-moz-box-shadow:0px 0px 8px #333333;
}
</style>
</head>
<div class="navigation">
	<div>
		<span class="icon"></span>
		<span class="com">www.jet.com 喷气航模论坛</span>
		<span class="portrait"><img alt="" src="${BASE_URL }/jet/image/portrait/skull39.png"></span>
		<span class="nickName">jeff1311</span>
	</div>
</div>
</html>