<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <title>Agregar Cuenta</title>
</head>
<body>
<h2>Agregar cuenta</h2>
<form:form method="post" action="addCuenta.html">
 
    <table>
    
    <tr>
        <td><form:label path="cliente.rut"><spring:message code="label.rut"/></form:label></td>
        <td><form:input path="cliente.rut"/></td>
    </tr>
    <tr>
    	<td><form:label path="servicio.tipo_servicio"><spring:message code="label.tipo"/></form:label></td>
    	<td><form:input path="servicio.tipo_servicio"/></td>
    
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