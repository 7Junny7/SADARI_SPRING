<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>result</h2>
	<c:forEach var="va" items="${li }">
		${va.s1 },${va.s2 },${va.s3 }
	</c:forEach>
</body>
</html>