<%@ include file="/WEB-INF/templates/includes.jsp"%>
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