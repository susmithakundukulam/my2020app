    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manger Page</title>
</head>
<body>

<h1>Hiii.......</h1>

<p>
<a href="${pageContext.request.contextPath}/user">Home page</a>
</p>

<form:form action="${pageContext.request.contextPath}/logout" method="POST">
	<input type="submit" value="logout">
</form:form>

</body>
</html>