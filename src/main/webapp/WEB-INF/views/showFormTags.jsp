<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<body>

<h1>My First Program</h1>

<form:form action="processFormTags" modelAttribute="student">
	FirstName : <form:input  path="firstName"/> <br><br>   
	<br>
	LastName : <form:input  path="lastName"/> <br><br>   
	<br>
	<input type="submit" value="Submit">
</form:form>

</body>
</html>