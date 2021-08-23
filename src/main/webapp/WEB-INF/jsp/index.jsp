<%-- 
    Document   : index
    Created on : Aug 4, 2021, 10:01:33 AM
    Author     : Neet Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"  %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HomePage</title>
        <link href="<c:url value="/css/style.css"/>" rel="stylesheet">
    </head>
    <body>
        <img src="<c:url value="/images/2.png" />" alt="test" />
        <a href="<c:url value="/test" />">Redirect/forward</a>
        <h1>Welcome to my website</h1>
        <h1>Hello ${name}</h1>
        <c:if test="${fullName != null}">           
            <h1>${fullName}</h1>
        </c:if>
            
            <ul>
                <c:forEach var="i" begin ="1" end ="10">
                    <c:choose>
                        <c:when test="${i%2==0}">
                            <li style="color:green">${i}</li>
                        </c:when>
                        <c:when test="${i%2!=0}">
                            <li style="color:brown">${i}</li>
                        </c:when>
                        
                    </c:choose>
                    
                </c:forEach>
            
            </ul>
            
            <ol>
                <c:forEach var="u" items="${users}">
                    <li>${u.firstName} ${u.lastName}</li> 
                </c:forEach>
                
            </ol>
            
            <ul>
                <c:forTokens var="f"
                             delims="," items="Iphone, samsung, nokia">
                    <li>${f}</li>
                    
                </c:forTokens>
            </ul>
            
            <c:url value="/hello-post" var="action" />
        <form:form method="post" action="${action}" modelAttribute="user">
            <spring:message code="label.firstName"/>
            <form:input path="firstName"/>
            <br>
            <spring:message code="label.lastName" />
            <form:input  path="lastName" />
            
            <input type="submit" value="send" />
            
        </form:form>
    </body>
</html>
