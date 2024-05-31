<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!-- for Bootstrap CSS -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container mt-3">
	<div>
		<h1>New Ninja</h1>
		<form:form action="/create" method="post" modelAttribute="ninja">
		<form:label path="dojo">Dojo</form:label>
		<form:select path="dojo">
			<c:forEach items="${dojos}" var="dojo">
        		<form:option value="${dojo.id}" path="dojo">
        			<c:out value="${dojo.name }"/>
        		</form:option>
     		</c:forEach>
     </form:select><br/>
    <p>
        <form:label path="firstName">First Name</form:label>
        <form:errors path="firstName" />
        <form:input path="firstName"/>
    </p>
    <p>
        <form:label path="lastName">Last Name</form:label>
        <form:errors path="lastName"/>
        <form:textarea path="lastName"/>
    </p>
    <p>
        <form:label path="age">Age</form:label>
        <form:errors path="age"/>
        <form:input type="number" path="age"/>     
    </p>   
     
    <input type="submit" value="Create"/>
</form:form>
	</div>
</div>
</body>
</html>