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
<title>Project Testcase</title>
<style>
h1 {
	text-align: center;
	color: green;
}
</style>

</head>
<body>
	<h1>TEST CASES</h1>
	<br>
	<div class="container px-lg-5">
		<div class="row mx-lg-n5">
			<div class="col py-3 px-lg-5 border bg-light">
				<form action="functionServlet" method="get">
					<div class="form-group">
						<label for="exampleFormControlSelect1">Select function</label> <select
							class="form-control" id="exampleFormControlSelect1"
							name="function">
							<option value="triangle">Triangle function</option>
							<option value="commission">Commission function</option>
						</select>
					</div>
					<div class="form-group">
						<label for="exampleFormControlSelect1">Select types</label> <select
							class="form-control" id="exampleFormControlSelect1" name="type">
							<option value="5">5 elements</option>
							<option value="7">7 elements</option>
						</select>
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>