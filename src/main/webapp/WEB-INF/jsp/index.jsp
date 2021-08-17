<%-- 
    Document   : index
    Created on : Aug 4, 2021, 10:01:33 AM
    Author     : Neet Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HomePage</title>
    </head>
    <body>
        <h1>Welcome to my website</h1>
        <h1>Hello ${name}</h1>
        
        <h1>${fullName}</h1>
        <form:form method="post" action="/HospitalManager//hello-post" modelAttribute="user">
            <form:input path="firstName"/>
            <form:input  path="lastName" />
            
            <input type="submit" value="send" />
            
        </form:form>
    </body>
</html>
