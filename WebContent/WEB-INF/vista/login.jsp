<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejercicio Cine Evaluacion V2</title>
<style>
h1 {
	justify-content: flex end;
	font-size: 52px;
	color: #6061b1;
	text-decoration: underline;
}
</style>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
	<h1 class="text-center">Ejercicio Cine Evaluacion V2</h1>

	<div class="card">
		<div class="card-body">
			<form
				action="${pageContext.request.contextPath}/peliculaServlet?accion=login"
				method="POST">
				<fieldset class="form-group">
					<label for="director">Usuario: </label> <input
						class="form-control col-5" type="text" name="usuario" /><br>
				</fieldset>

				<fieldset class="form-group">
					<label for="director">Pass: </label> <input
						class="form-control col-5" type="text" name="pass" /><br> <input
						class="btn btn-primary" type="submit" value="Ingresar">
				</fieldset>
				<a class="btn btn-secondary " href="index.jsp">Volver</a>
			</form>
		</div>
	</div>
	<p class="mt-3" style="color: red;">${error}</p>



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