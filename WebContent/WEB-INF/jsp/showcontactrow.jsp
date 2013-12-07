<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Ejemplo de Resultado en Tabla</title>
</head>
<body>
<h2>Registros Ingresados</h2>
<table width="100%" cellpadding="10" table-layout="auto">
    <tr>
    	<th>Rut</th>
        <th>Nombre</th>
        <th>Apellido Paterno</th>
        <th>Apellido Materno</th>
        <th>Celular</th>
        <th>Correo</th>
        <th>Direccion</th>
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
            <!-- <td> 
				<form:form method="POST" action="delete.html">   
					
					<input type="hidden" name="rut" value="${cliente.rut}">
					<input type="hidden" name="nombre" value="${cliente.nombre}">
					<input type="hidden" name="apellidoPaterno" value="${cliente.apellidoPaterno}">
					<input type="hidden" name="apellidoMaterno" value="${cliente.apellidoMaterno}">
					<input type="hidden" name="celular" value="${cliente.fono}">
					<input type="hidden" name="correo" value="${cliente.email}">
					<input type="hidden" name="direccion" value="${cliente.direccion}">
					<input type="submit" value="<spring:message code="label.delete"/>"/>
				</form:form>
			</td> -->
			<td> 
				<form:form method="POST" action="modificarCliente.html">   
					
					<input type="hidden" name="rut" value="${cliente.rut}">
					<input type="hidden" name="nombre" value="${cliente.nombre}">
					<input type="hidden" name="apellidoPaterno" value="${cliente.apellidoPaterno}">
					<input type="hidden" name="apellidoMaterno" value="${cliente.apellidoMaterno}">
					<input type="hidden" name="fono" value="${cliente.fono}">
					<input type="hidden" name="email" value="${cliente.email}">
					<input type="hidden" name="direccion" value="${cliente.direccion}">
					<input type="submit" value="<spring:message code="label.modificar"/>"/>
				</form:form>
			</td>
			<!--<td>
				<form:form method="POST" action="cuentaForm.html">
				
				<input type="hidden" name="rut" value="${cliente.rut}">
				<input type="submit" value="<spring:message code ="label.cuenta"/>"/>
				</form:form>
			</td>-->
			
            
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