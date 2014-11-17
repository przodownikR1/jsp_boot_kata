<%@ include file="/WEB-INF/templates/includes.jsp"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href='${pageContext.request.contextPath}/favicon.ico' rel='icon' type='image/x-icon'/>
 

<title>Hi </title>
</head>
<body>

<spring:message code="hello" var="hello1" >

<c:out value="${hello1}"/>

<c:out value="${time}"/>

<c:out value="${message}"/>

</body>
</html>