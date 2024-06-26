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
		<table>
			<tbody>
			<c:forEach items="${dojos}" var="dojo">
			<tr>
				<td><a href="/dojos/${dojo.id}">${dojo.name}</a></td>
			</tr>
			</c:forEach>
		</tbody>
		</table>
		
		<h1>New Dojo</h1>
		<form:form action="/processNew" method="post" modelAttribute="dojo">
			<form:label class="from-label" path="name">Name</form:label>
			<form:input class="from-control" path="name"/>
			<form:errors class="from-danger" path="name"></form:errors>
			<br/>
				<div class="d-flex justify-content-between">
					<input type="submit" value="Submit" class="btn btn-success">
				</div>
		</form:form>
	</div>
</div>
</body>
</html>