<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>办公自动化(OA)平台</title>
</head>
<frameset rows="127,*,11" frameborder="no" border="0" framespacing="0">
	<frame src="view/top.jsp" name="topFrame" scrolling="No"
		noresize="noresize" id="topFrame" />
	<frame src="view/center.jsp" name="mainFrame" id="mainFrame" />
	<frame src="view/down.jsp" name="bottomFrame" scrolling="No"
		noresize="noresize" id="bottomFrame" />
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>

