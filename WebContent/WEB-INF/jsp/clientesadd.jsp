<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <title>Formulario Clientes</title>
</head>
<body>
<h2>Formulario clientes</h2>
<form:form method="post" action="addCliente.html">
 
    <table>
    <tr>
        <td><form:label path="nombre"><spring:message code="label.nombre"/></form:label></td>
        <td><form:input path="nombre" /> <form:errors></form:errors></td> 
    </tr>
    <tr>
        <td><form:label path="apellidoPaterno"><spring:message code="label.apellidoPaterno"/></form:label></td>
        <td><form:input path="apellidoPaterno" /></td>
    </tr>
    <tr>
        <td><form:label path="apellidoMaterno"><spring:message code="label.apellidoMaterno"/></form:label></td>
        <td><form:input path="apellidoMaterno" /></td>
    </tr>
    <tr>
        <td><form:label path="rut"><spring:message code="label.rut"/></form:label></td>
        <td><form:input path="rut" /></td>
    </tr>
    <tr>
        <td><form:label path="fono"><spring:message code="label.fono"/></form:label></td>
        <td><form:input path="fono" /></td>
    </tr>
    <tr>
        <td><form:label path="direccion"><spring:message code="label.direccion"/></form:label></td>
        <td><form:input path="direccion" /></td>
    </tr>
    <tr>
        <td><form:label path="email"><spring:message code="label.email"/></form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    
    <tr>
        <td colspan="2">
            <input type="submit" value="Agregar"/>
        </td>
    </tr>
</table>  
     
</form:form>
<form:form action="principal.html">
	<tr>
		<td colspan="2">
 		<input type="submit" value= "<spring:message  code="label.volver"/>"/>
 		</td>
 		</tr>
 	
 	
	</form:form>
</body>
</html>