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
<div class="main mx-auto my-5 w-50">
<h1>${book.title}</h1>
<a href="/books" class="btn btn-primary">Back to the shelves</a>
<c:if test = "${user.id!=book.user.id}">
	<h2><c:out value="${book.user.name } read ${book.title} by ${book.author}"/></h2>
	<hr/>
	<h4><c:out value="Here are ${book.user.name }'s thoughts"/></h4>
	<h6><c:out value="${book.thoughts}"/></h6>
</c:if>

<c:if test = "${user.id==book.user.id}">
	<h2><c:out value="You read this book by ${book.author}"/></h2>
	<hr/>
	<h4><c:out value="Here are your thoughts"/></h4>
	<h6><c:out value="${book.thoughts}"/></h6>
</c:if>




		<c:if test = "${user.id==book.user.id}">
		<a class="btn btn-primary" href="/books/edit/${id }" >Edit</a>
			<form action="/books/delete/${book.id}" method="post">
			    <input type="hidden" name="_method" value="delete">
			    <input type="submit" value="Delete" class="btn btn-danger">
			</form>
		</c:if>
	</div>
</div>
</body>
</html>