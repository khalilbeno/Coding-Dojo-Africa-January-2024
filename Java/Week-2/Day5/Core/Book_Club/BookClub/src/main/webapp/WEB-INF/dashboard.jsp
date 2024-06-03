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
<div class="navbar bg-body-primary">
		<div class="container-fluid">
			<h1>Welcome, ${user.name}</h1>
			<br/>
			
			<a href="/logout" class="btn btn-danger">Log Out</a>
			<a href="/books/new" class="btn btn-primary">+ Add a book to my shelf!</a>
		</div>
	</div>
	<div class="main">
		<h6>Books from everyone's shelves:</h6>
		<table class="table">
		<thead>
		<tr>
		<th>ID</th>
		<th>Title</th>
		<th>Author Name</th>
		<th>Posted By</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${ books}" var="book">
		<tr>
		<td>${book.id }</td>
		<td><a href="/books/${book.id}">${book.title }</a></td>
		<td>${book.author }</td>
		<td>${book.user.name}</td>
		</tr>
		</c:forEach>
		</tbody>
		</table>
	</div>
</div>
</body>
