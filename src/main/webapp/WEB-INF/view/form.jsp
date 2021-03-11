<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: vipul
  Date: 3/11/2021
  Time: 8:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
    <style>
        .error { color: orangered}
    </style>
</head>
<body>
    <form:form action="${pageContext.request.contextPath}/process" modelAttribute="form">
    First Name: <form:input path="firstName"/>
        <form:errors path="firstName" cssClass="error"/><br/><br/><br/>
    Last Name (*): <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/><br/><br/><br/>
    Free Passes: <form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error"/><br/><br/><br/>
    Postal Code: <form:input path="postalCode"/>
        <form:errors path="postalCode" cssClass="error"/><br/><br/><br/>

    <input type="submit" value="Register">
    </form:form>
</body>
</html>
