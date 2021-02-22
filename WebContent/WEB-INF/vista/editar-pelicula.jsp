<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
h1 {
	justify-content: flex end;
	font-size: 52px;
	color: #6061b1;
	text-decoration: underline;
}
</style>
<meta charset="ISO-8859-1">
<title>Ejercicio Cine Evaluacion V2e</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
	<h1 class="text-center">Ejercicio Cine Evaluacion V2</h1>

	<div class="container mt-5">
		<form
			action="${pageContext.request.contextPath}/peliculaServlet?accion=editar">
			<input hidden="true" name="id" value="${pelicula.id}">
			<div class="form-group">
				<label for="director" class="text-dark lead font-weight-bold">Director:</label>
				<div class="block">
					<input type="text" name="director" maxlength="128"
						value="${pelicula.director}" class="form-control col-4" required>

				</div>
			</div>
			<div class="form-group">
				<label for="titulo" class="text-dark lead font-weight-bold">Titulo:</label>
				<div class="block">
					<input type="text" name="titulo" maxlength="128"
						value="${pelicula.titulo}" class="form-control col-4" required>

				</div>
			</div>

			<div class="form-group">
				<label for="fecha" class="text-dark lead font-weight-bold">Fecha:</label>
				<div class="block">
					<input type="text" name="fecha" value="${pelicula.fecha}"
						class="form-control col-4" required>
				</div>
			</div>
			<button type="submit" class="btn btn-success">Actualizar</button>
		</form>
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