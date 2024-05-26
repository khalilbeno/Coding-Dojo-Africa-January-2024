<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result</title>

</head>
<body>
    <div class="container"> 
        <div>
            <h1>Here's Your Omikuji!</h1>
        </div>
        <div class="response">
            <p>In <c:out value="${number}"/>years, you will</p>
            <p>live in <c:out value="${city}"/> with <c:out value="${person}"/> as your roommate,</p>
            <p><c:out value="${profession}"/> for living.</p>
            <p>The next time you see a <c:out value="${living}"/>,</p>
            <p>you will have good luck.</p>
            <p>Also,<c:out value="${nice}"/></p>
        </div>
        <div class="link">
            <a href="/omikuji">Go Back</a>
        </div>
    </div>          
</body>
</html>