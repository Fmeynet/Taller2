<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Modificar</title>
</head>
<body>
	<h2>Modificar Cliente</h2>
	
	<form:form method="post" action="modificar.html">
	
		<table>
		
			
			<tr>
				<td><form:label path="nombre">
						<spring:message code="label.nombre" />
					</form:label></td>
				<td><form:input path="nombre" /></td>
			</tr>
			<tr>
				<td><form:label path="apellidoPaterno">
						<spring:message code="label.apellidoPaterno" />
					</form:label></td>
				<td><form:input path="apellidoPaterno" /></td>
			</tr>
			<tr>
				<td><form:label path="apellidoMaterno">
						<spring:message code="label.apellidoMaterno" />
					</form:label></td>
				<td><form:input path="apellidoMaterno" /></td>
			</tr>
			<tr>
				<td><form:label path="fono">
						<spring:message code="label.fono" />
					</form:label></td>
				<td><form:input path="fono" /></td>
			</tr>
			<tr>
				<td><form:label path="direccion">
						<spring:message code="label.direccion" />
					</form:label></td>
				<td><form:input path="direccion" /></td>
			</tr>
			<tr>
				
				<td><form:input type ="hidden" path="email"/></td>
			</tr>
			
			<tr>
				
				<td><form:input type = "hidden" path="rut" /></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="<spring:message code="label.modificar" />" />
				</td>
			</tr>
		
		</table>
		
	</form:form>
<form:form action="show.html">
	<tr>
		<td colspan="2">
 		<input type="submit" value= "<spring:message  code="label.volver"/>"/>
 		</td>
 		</tr>
 	
 	
	</form:form>
	
	
</body>

</html>