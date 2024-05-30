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
<title>edit</title>
</head>
<body>
<div class="container mt-3">
<div>
		<h1>Edit a burger</h1>
		<form:form action="/edit/${burger.id}" method="post" modelAttribute="burger">
			<input type="hidden" name="_method" value="put">
			<form:label class="from-label" path="burgerName">Burger Name</form:label>
			<form:input class="from-control" path="burgerName"/>
			<form:errors class="from-danger" path="burgerName"></form:errors>
			<br/>
			<form:label class="from-label" path="restaurentName">Restaurent Name</form:label>
			<form:input class="from-control" path="restaurentName"/>
			<form:errors class="from-danger" path="restaurentName"></form:errors>
			<br/>
			<form:label class="from-label" path="rating">Rating</form:label>
			<form:input type="number" class="from-control" path="rating"/>
			<form:errors class="from-danger" path="rating"></form:errors>
			<br/>
			<form:label class="from-label" path="notes">Notes</form:label>
			<form:input class="from-control" path="notes"/>
			<form:errors class="from-danger" path="notes"></form:errors>
			<br/>
				<div class="d-flex justify-content-between">
					<input type="submit" value="Submit" class="btn btn-success">
				</div>
		</form:form>
	</div>
</div>
</body>
</html>