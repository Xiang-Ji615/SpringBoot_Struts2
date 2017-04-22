<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="../webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<h1>This is Web Index.</h1>
		<div class="btn btn-primary">
			<s:property value="msg" />
		</div>
		<div class="btn btn-success">
			<s:property value="#request.tstMsg" />
		</div>
	</div>
</body>
</html>