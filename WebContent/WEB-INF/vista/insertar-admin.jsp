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
<title>Ejercicio Cine Evaluacion V2</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
	<h1 class="text-center">Ejercicio Cine Evaluacion V2</h1>
	<div class="container mt-5">
		<form
			action="${pageContext.request.contextPath}/peliculaServlet?accion=insertarAdmin"
			method="post">
			<div class="form-group">
				<label for="admin" class="text-dark lead font-weight-bold">Administrador:</label>
				<div class="block">
					<input type="text" name="admin" maxlength="45"
						 class="form-control" required>
				</div>
			</div>
			<div class="form-group">
				<label for="pass" class="text-dark lead font-weight-bold">Pass:</label>
				<div class="block">
					<input type="text" name="pass" maxlength="45" 
						class="form-control" required>
				</div>
			</div>
			<input hidden="true" name="usuarioActual" value="${nombre}" />
			<div class="modal-footer bg-dark">
				<button type="submit" class="btn btn-success">Insertar</button>
			</div>
		</form>

	</div>
</body>
</html>
