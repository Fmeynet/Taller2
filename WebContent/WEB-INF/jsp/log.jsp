<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<form:form method="post" action="logear.html">
 
    <table>
    <tr>
        <td><form:label path="usuario"><spring:message code="label.usuario"/></form:label></td>
        <td><form:input path="usuario" /> <form:errors></form:errors></td> 
    </tr>
    <tr>
        <td><form:label path="password"><spring:message code="label.password"/></form:label></td>
        <td><form:input type ="password" path="password" /></td>
    </tr>
    
    <tr>
        <td colspan="2">
            <input type="submit" value="Logear"/>
        </td>
    </tr>
</table>  
     
</form:form>
</body>
</html>