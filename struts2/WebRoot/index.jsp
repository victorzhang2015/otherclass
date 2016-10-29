<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
    <!-- 动态的方法调用 -->
    <a href="hello!add">add</a>
    <a href="path.action">path</a>
    <form action="hello.action" method="post">
    	realName:<input type="text" name="realName"><br>
    	userName:<input type="text" name="user.username"><br>
    	password:<input type="password" name="user.password"><br>
    	<input type="submit" value="提交">
    </form>
    <form action="User_add.action" method="post">
    	Name:<input type="text" name="name"><br>
    	<input type="submit" value="提交">
    </form>
    
    <form name="f" action="" method="post">
    	Name:<input type="text" name="name"><br>
    	Password:<input type="password" name="password">
    	<input type="button" value="提交1" onclick="javascript:document.f.action='login/LoginAction1';document.f.submit();">
    	<input type="button" value="提交2" onclick="javascript:document.f.action='login/LoginAction2';document.f.submit();">
    	<input type="button" value="提交3" onclick="javascript:document.f.action='login/LoginAction3';document.f.submit();">
    	<input type="button" value="提交4" onclick="javascript:document.f.action='login/LoginAction4';document.f.submit();">
    </form>
  </body>
</html>
