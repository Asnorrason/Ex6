<%-- 
    Document   : display.jsp
    Created on : Mar 6, 2015, 10:21:03 AM
    Author     : sofus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="p" items="${parts}">
            <p> ${p}</p>
        </c:forEach>
    </body>
</html>
