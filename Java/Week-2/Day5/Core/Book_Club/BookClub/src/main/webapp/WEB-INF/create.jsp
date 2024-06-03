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
<h1>Add a book to your shelf !</h1>
		<form:form action="/createbook" method="post" modelAttribute="book">
			<form:label class="from-label" path="title">Title</form:label>
			<form:input class="from-control" path="title"/>
			<form:errors class="from-danger" path="title"></form:errors>
			<br/>
			<form:label class="from-label" path="author">Author</form:label>
			<form:input class="from-control" path="author"/>
			<form:errors class="from-danger" path="author"></form:errors>
			<br/>
			<form:label class="from-label" path="thoughts">My thoughts</form:label>
			<form:input type="text" class="from-control" path="thoughts"/>
			<form:errors class="from-danger" path="thoughts"></form:errors>
			<br/>
				<div class="d-flex justify-content-between">
					<input type="submit" value="Submit" class="btn btn-success">
				</div>
		</form:form>
		<a href="/books" class="btn btn-primary">Back to shelves</a>
</div>
</body>
</html>