<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title></title>

<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.custom.min.js"></script>
<script type="text/javascript" src="js/jquery.jstree.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
<link href="org/js/party.css" rel="stylesheet" type="text/css">
<script type="text/javascript">


</script>
<script type="text/javascript" src="org/js/person_table.js"></script>
</head>
<body>

<div id="formwrapper">
	<h3>添加用户</h3>
	<form action="system/user.action" method="post" enctype="multipart/form-data">
	<input type="hidden" name="method:update" value="">
	<input type="hidden" name="person.id" value="<s:property value="person.id"/>">
	<input type="hidden" name="id" value="<s:property value="id"/>">
	<fieldset>
		<legend>用户基本信息</legend>
		<div>
			<label for="name">用户名</label>
			<input type="text" name="username" id="username" value="<s:property value="username"/>" size="30"  /> 
			<br />	
		</div>
		<div>
			<label for="name">密码</label>
			<input type="text" name="password" id="password" value="<s:property value="password"/>" size="30"  /> 
			<br />	
		</div>
	
		
		<s:if test="roleList != null">
			
			<select id="roleIds" name="roleIds" multiple="multiple">
				<s:iterator value="roleList" >
					<option value="<s:property value="id" />" 
					<s:property value="hasSelected(id,#userRoleIds)"/>
					><s:property value="name" /></option>
				</s:iterator>
			</select>
			
		</s:if>
		
		
		<div class="enter">
		    <input name="submit" type="submit" class="buttom" value="提交" />
		    <input name="reset" type="reset" class="buttom" value="重置" />
		</div>
	</fieldset>
	</form>
</div>

</body>
</html>

