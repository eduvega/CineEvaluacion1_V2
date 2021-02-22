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
<title>Ejercicio Cine Evaluacion V2</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">

		<h1 class="text-center">Ejercicio Cine Evaluacion V2</h1>


		<div class="container">
			<div class="container col-12 mt-5">
				<form
					action="${pageContext.request.contextPath}/peliculaServlet?accion=consulta"
					method="POST">

					<label for="director">Director: </label> <input type="text"
						name="director" /> <input class="btn btn-primary ml-4"
						type="submit" value="Buscar">
					<p style="color: red;">${error}</p>
				</form>
			</div>

			<a class="btn btn-secondary mt-3 ml-3" href="index.jsp">Volver</a>
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