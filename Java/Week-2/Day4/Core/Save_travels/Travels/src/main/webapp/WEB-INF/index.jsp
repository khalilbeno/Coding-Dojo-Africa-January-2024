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
		<h1>Save Travels</h1>
		<table class="table">
		<thead>
		<tr>
		<th>Expense</th>
		<th>Vendor</th>
		<th>Amount</th>
		<th>Actions</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${ allTravels}" var="travel">
		<tr>
		<td><a href="/travels/${travel.id}"><c:out value="${travel.expenseName}"></c:out></a></td>
		<td><c:out value="${travel.vendor}"></c:out></td>
		<td><c:out value="$ ${travel.amount}"></c:out></td>
		<td>
			<a href="/travels/edit/${travel.id }">Edit</a>
		</td>
		<td>
			<form action="/delete/${travel.id}" method="POST">
				<input type="hidden" name="_method" value="delete"/>
				<input type="submit" value="Delete"/>
			</form>
		</td>
		</tr>
		</c:forEach>
		</tbody>
		</table>
	</div>
	<div>
		<h1>Add an expense</h1>
		<form:form action="/processNew" method="post" modelAttribute="travel">
			<form:label class="from-label" path="expenseName">Expense Name</form:label>
			<form:input class="from-control" path="expenseName"/>
			<form:errors class="from-danger" path="expenseName"></form:errors>
			<br/>
			<form:label class="from-label" path="vendor">Vendor</form:label>
			<form:input class="from-control" path="vendor"/>
			<form:errors class="from-danger" path="vendor"></form:errors>
			<br/>
			<form:label class="from-label" path="amount">Amount</form:label>
			<form:input type="number" class="from-control" path="amount"/>
			<form:errors class="from-danger" path="amount"></form:errors>
			<br/>
			<form:label class="from-label" path="description">Description</form:label>
			<form:input class="from-control" path="description"/>
			<form:errors class="from-danger" path="description"></form:errors>
			<br/>
				<div class="d-flex justify-content-between">
					<input type="submit" value="Submit" class="btn btn-success">
				</div>
		</form:form>
	</div>
</div>
</body>
</html>