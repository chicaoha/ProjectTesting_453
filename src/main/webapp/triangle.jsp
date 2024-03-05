<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<title>Triangle Input Page</title>
<style>
h1 {
	text-align: center;
	color: green;
}
</style>
</head>
<body>
	<h1>Input Value For Triangle Problem</h1>
	<br>
	<div class="container px-lg-5">
		<div class="row mx-lg-n5">
			<div class="col py-3 px-lg-5 border bg-light">
				<form action="triangleServlet" method="get">
					<%
					String type = (String) session.getAttribute("type");
					%>
					<div class="form-group">
                        <input type="number" class="form-control"
                            id="exampleFormControlInput1" name="type" value="<%=type%>"
                            hidden="">
                    </div>
                    <!-- Set min and max values -->
                    <input type="hidden" name="min" value="10">
                    <input type="hidden" name="max" value="220">
					<div class="container px-lg-5">
						<div class="row mx-lg-n5">
							<div class="col py-3 px-lg-5">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>
							<div class="col py-3 px-lg-5">
								<a href="index.jsp" class="btn btn-primary" role="button">Back</a>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>