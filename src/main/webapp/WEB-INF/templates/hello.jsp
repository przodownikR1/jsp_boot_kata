<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%> --%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='${pageContext.request.contextPath}/favicon.ico' rel='icon' type='image/x-icon'/>
 <link rel="shortcut icon" href="${pageContext.request.contextPath}/favicon.ico"/>

<title>Hi </title>
</head>
<body>
<c:out value="${time}"/>

<c:out value="${message}"/>



<img src="${pageContext.request.contextPath}/favicon.ico"/>

<img src="http://localhost:8080/favicon.ico"/>

</body>
</html>