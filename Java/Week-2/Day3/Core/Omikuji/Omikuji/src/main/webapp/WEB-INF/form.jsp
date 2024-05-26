<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div class="container">
        <h1 class="mb-3">Send an Omikuji!</h1>
        <div class="form">
            <form action="/send" method="post">
                <div class="form-group">
                    <div class="mb-1">
                        <label for="number">Pick any number from 5 to 25:</label>
                        <select class="form-select select" id="number" name="number">
                            <c:forEach begin="5" end="25" var="i">
                                <option value="${i}">${i}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="mb-1">
                        <label for="city">Enter the name of any city:</label>
                        <input type="text" class="form-control" id="city" name="city">
                    </div>
                    <div class="mb-1">
                        <label for="person">Enter the name of any real person:</label>
                        <input type="text" class="form-control" id="person" name="person">
                    </div>
                    <div class="mb-1">
                        <label for="profession">Enter professional endeavor or hobby:</label>
                        <input type="text" class="form-control" id="profession" name="profession">
                    </div>
                    <div class="mb-1">
                        <label for="living">Enter any type of living thing :</label>
                        <input type="text" class="form-control" id="living" name="living">
                    </div>
                    <div class="mb-1">
                        <label for="nice">Say something nice to someone:</label>
                        <textarea class="form-control" id="nice" name="nice"></textarea>
                    </div>
                    <div class="mb-1">
                        <p>Send and show a friend</p>
                    </div>
                    <div class="button">
                        <input type="submit" class="btn btn-primary" value="Send">
                    </div>
                </div>
            </form>
        </div>
</body>
</html>