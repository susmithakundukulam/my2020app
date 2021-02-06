<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>my2020app</title>
	<style>
		.failed{
		 	color:red;
		}
	</style>
</head>
<body>
	<h1>Login with custom username and password</h1>
	<form:form
		action="${pageContext.request.contextPath}/authenticateTheUser"
		method="POST">
		<c:if test="${param.error != null }">
			<i class="failed">Sorry! you entered invalid username and password</i>
		</c:if>
		
		<c:if test="${param.logout != null }">
			<i class="failed">Sorry! you have logged out. Please login again..</i>
		</c:if>
		<p>
			UserName : <input type="text" name="username">
		</p>
		<p>
			Password : <input type="password" name="password">
		</p>
		<input type="submit" value="Login" />
	</form:form>
</body>
</html>