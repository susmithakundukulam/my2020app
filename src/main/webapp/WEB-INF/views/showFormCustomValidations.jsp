<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
	<style>
		.error{
			color:red;
		}
	</style>
</head>
<body>

	<h1>My First Program</h1>
	
	<form:form action="processFormValidations" modelAttribute="student">
		FirstName : <form:input  path="firstName"/> <br><br>   
		<br>
		LastName : <form:input  path="lastName"/>  
		<form:errors path="lastName" cssClass="error"></form:errors> 
		<br><br><br>   
		FreePasses : <form:input  path="freePasses"/>  
		<form:errors path="freePasses" cssClass="error"></form:errors> 
		<br><br><br>   
		CourseCode : <form:input  path="courseCode"/>  
		<form:errors path="courseCode" cssClass="error"></form:errors> 
		<br><br>   
		<input type="submit" value="Submit">
	</form:form>

</body>
</html>