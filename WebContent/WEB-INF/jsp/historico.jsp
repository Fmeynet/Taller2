<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Clientes Historicos</title>
</head>
<body>
<h2>Clientes Historicos</h2>
<table width="100%" cellpadding="10" table-layout="auto">
    <tr>
    	<th>Rut</th>
        <th>Nombre</th>
        <th>Apellido_p</th>
        <th>Apellido_m</th>
        <th>Celular</th>
        <th>Correo</th>
        <th>Direccion</th>
        <th>Modificado por</th>
        
    </tr>
    <c:forEach items="${Formulario.obj}" var="cliente" varStatus="status">
        <tr>
        	<td>${cliente.rut}</td>
            <td>${cliente.nombre}</td>
            <td>${cliente.apellidoPaterno}</td>
            <td>${cliente.apellidoMaterno}</td>
            <td>${cliente.fono}</td>
            <td>${cliente.email}</td>
            <td>${cliente.direccion}</td>
            <td>${cliente.login.admin.usuario}</td>
            
        </tr>
    </c:forEach>
</table>  
<br/>
   <form:form action="principal.html">
	<tr>
		<td colspan="2">
 		<input type="submit" value= "<spring:message  code="label.volver"/>"/>
 		</td>
 		</tr>
 	
 	
	</form:form>
</body>
</html>