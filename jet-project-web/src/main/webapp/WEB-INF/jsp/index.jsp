<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome to jet</title>
<style type="text/css">
.body{
	margin:0 auto;
	background:#f8f8f8;
}
.main{
	margin:0 auto;
	margin-top:30px;
	margin-bottom:30px;
	width:70%;
}
.banner{
	margin:0;
	width:100%;
	height:700px;
	/* background:url(image/banner/f22.jpg) no-repeat fixed center; */
 	background:url(image/banner/f22.jpg) no-repeat center;
	background-size:100%;
/* 	box-shadow:0px 0px 20px #333333 inset;/* 水平位移 垂直位移 模糊半径 */
/*	-webkit-box-shadow:0px 0px 20px #333333 inset;
	-moz-box-shadow:0px 0px 20px #333333 inset; */
}
.module{
	width:100%;
	height:500px;
	margin-top:10px;
	background:white;
}
</style>
</head>
<body class="body">
	<%@ include file="./common/navigation.jsp" %>
	<div class="banner"></div>
	<div class="main">
		<div class="module" id="news">资讯</div>
		<div class="module" id="forum">论坛</div>
		<div class="module" id="multi-rotor">多旋翼</div>
		<div class="module" id="UAV">无人机</div>
		<div class="module" id="fixed-wing">固定翼</div>
		<div class="module" id="helicopter">直升机</div>
		<div class="module" id="market">交易区</div>
	</div>
</body>
</html>