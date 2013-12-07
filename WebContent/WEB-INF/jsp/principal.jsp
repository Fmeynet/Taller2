<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>

	<form:form action="show.html">
	<tr>
		<td colspan="2">
 		<input type="submit" value= "<spring:message  code="label.mostrar"/>"/>
 		</td>
 		</tr>
 	
 	
	</form:form>
	
	<form:form action="showHistorico.html">
	<tr>
		<td colspan="2">
 		<input type="submit" value= "<spring:message  code="label.mostrarH"/>"/>
 		</td>
 		</tr>
 	
 	
	</form:form>
	
	<form:form action="clientes.html">
	<tr>
		<td colspan="2">
 		<input type="submit" value= "<spring:message  code="label.agregar"/>"/>
 		</td>
 		</tr>
 	
 	
	</form:form>
	
</body>
</html>