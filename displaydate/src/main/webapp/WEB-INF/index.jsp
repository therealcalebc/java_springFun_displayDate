<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><c:out value="${title}"/></title>
	<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
	<h1 class=<c:out value="${title}"/>><c:out value="${datetime}"/></h1>
	<script type="text/javascript" src="js/<c:out value="${title}"/>.js"></script>
</body>
</html>
