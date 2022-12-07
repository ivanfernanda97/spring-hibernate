<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
	<title>Vanxyr Company Home Page</title>
</head>

<body>
	<h2>Vanxyr Company Home Page - Yoohoo - Dyl-Yeah!!!</h2>
	<hr>
	
	<p>
	Welcome to the Vanxyr company home page!
	</p>
	
	<!-- Add a logout button -->
	<form:form action="${pageContext.request.contextPath}/logout" 
			   method="POST">
	
		<input type="submit" value="Logout" />
	
	</form:form>
	
</body>

</html>










