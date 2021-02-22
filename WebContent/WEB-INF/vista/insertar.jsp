<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
</head>
<body>
	<div class="container bg-primary text-light pt-4 pb-4 col-12">
		<h2>Gestion de Peliculas</h2>
	</div>
	<form
		action="${pageContext.request.contextPath}/peliculaServlet?accion=insertar"
		method="post">
		<div class="form-group ml-5">
			<label for="director" class="text-dark lead font-weight-bold">Director:</label>
			<div class="block">
				<input type="text" name="director" maxlength="128"
					class="form-control" required>

			</div>
		</div>
		<div class="form-group ml-5">
			<label for="titulo" class="text-dark lead font-weight-bold">Titulo:</label>
			<div class="block">
				<input type="text" name="titulo" maxlength="128"
					class="form-control" required>
			</div>
		</div>

		<div class="form-group ml-5">
			<label for="fecha" class="text-dark lead font-weight-bold">Fecha:</label>
			<div class="block">
				<input type="text" name="fecha" class="form-control" required>
			</div>
		</div>


		<div>
			<button type="submit" class="btn btn-success">Insertar</button>
		</div>
	</form>
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