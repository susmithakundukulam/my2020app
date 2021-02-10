<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<h1>Hiii.......</h1>

User : <sec:authentication property="principal.username" /> 
<br>
Role : <sec:authentication property="principal.authorities"/>

<br><br>

<a href="user/showForm">showForm Link</a>
<br>
<a href="user/showFormTags">showFormTags Link</a>
<br>
<a href="user/showFormValidations">showFormValidations Link</a>
<br>
<a href="user/showFormCustomValidations">showFormCustomAnnotation Validations Link</a>
<p></p>

<sec:authorize access="hasRole('MANAGER')">
	<p>
	<a href="${pageContext.request.contextPath}/manager">Manager meeting</a>
	</p>
</sec:authorize>

<form:form action="${pageContext.request.contextPath}/logout" method="POST">
	<input type="submit" value="logout">
</form:form>

</body>
</html>