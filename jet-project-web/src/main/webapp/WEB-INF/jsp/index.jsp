<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome to jet</title>
<link rel="stylesheet" type="text/css" href="WEB-INF/css/common/animate.min.css">
<style type="text/css">
.body{
	margin:0 auto;
	background:#ececec;
}
.main{
	margin:0 auto;
	margin-top:30px;
	margin-bottom:30px;
	width:70%;
	height:1000px;/* 100% */
	background:white;
}
.banner{
	margin:0;
	width:100%;
	height:700px;
	/* background:url(image/banner/f22.jpg) no-repeat fixed center; */
	background-size:100%;
	box-shadow:0px 0px 20px #333333 inset;/* 水平位移 垂直位移 模糊半径 */
	-webkit-box-shadow:0px 0px 20px #333333 inset;
	-moz-box-shadow:0px 0px 20px #333333 inset;
}

</style>
</head>
<body class="body">
	<%@ include file="./common/navigation.jsp" %>
	<div class="banner"></div>
	<div class="main"></div>
	
</body>
</html>