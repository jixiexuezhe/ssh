<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<script src="js/jquery-easyui-1.2.3/jquery-1.4.4.min.js"
	type="text/javascript"></script>
<script src="js/jquery-easyui-1.2.3/jquery.easyui.min.js"
	type="text/javascript"></script>
<link href="js/jquery-easyui-1.2.3/themes/default/easyui.css"
	rel="stylesheet" type="text/css" />
<link href="js/jquery-easyui-1.2.3/themes/icon.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
<h1>success</h1>
	<table id="dg" title="My Users" class="easyui-datagrid"
		style="width:700px;height:250px" url="get_users.php"
		toolbar="#toolbar" pagination="true" rownumbers="true"
		fitColumns="true" singleSelect="true">
		<thead>
			<c:forEach items="${userList}" var="user">
				<tr>
					<th field="id" width="50">id</th>
					<th field="name" width="50">name</th>
					<th field="address" width="50">address</th>
				</tr>
				<tr>
					<th field="id" width="50">${user.id }</th>
					<th field="name" width="50">${user.name }</th>
					<th field="address" width="50">${user.address }</th>
				</tr>
			</c:forEach>
		</thead>
	</table>
</body>
</html>