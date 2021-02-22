<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejercicio Cine Evaluacion V2</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<style>
h1{
justify-content:flex end;
font-size:52px;
color:#6061b1;
text-decoration: underline;
}
</style>
</head>
<body>
	<div class="container">
	
	<h1 class="text-center">Ejercicio Cine Evaluacion V2</h1>
		<table class="table table-striped table-dark">
				<thead class="thead-light text-dark">
					<tr class="text-center">
						<th colspan="2" class="bg-primary text-light"><h4>Director: ${director}</h4></th>
					</tr>
					<tr class="lead text-center">
					<th>Peliculas</th>
					<th>Fechas</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="pelicula" items="${peliculas}">
						<tr class="lead text-center">
							<td>${pelicula.titulo}</td>
							<td>${pelicula.fecha}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<a class="btn btn-primary mt-3 ml-3" href="${pageContext.request.contextPath}/peliculaServlet?accion=consulta">Otra consulta</a>
			<a class="btn btn-danger mt-3 ml-3" href="${pageContext.request.contextPath}/peliculaServlet?accion=finalizar">Finalizar</a>
	</div>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
</body>
</html>