<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Commission Input Page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<style>
h1 {
	text-align: center;
	color: green;
}
</style>
</head>
<body>
	<h1>Input Value For Commission Problem</h1>
	<br>
	<div class="container px-lg-5">
		<div class="row mx-lg-n5">
			<div class="col py-3 px-lg-5 border bg-light">
				<form action="commissionServlet" method="get">
					<%
					String type = (String) session.getAttribute("type");
					%>
					<div class="form-group">
						<input type="number" class="form-control"
							id="exampleFormControlInput1" name="type" value="<%=type%>"
							hidden="">
					</div>
					<div class="container px-lg-5">
						<div class="row mx-lg-n5">
							<div class="col py-3 px-lg-5">
								<div class="form-group">
									<label for="exampleFormControlInput1">Lock Min Value</label> <input
										type="number" class="form-control"
										id="exampleFormControlInput1" placeholder="input a number"
										name="minLock">
								</div>
							</div>
							<div class="col py-3 px-lg-5">
								<div class="form-group">
									<label for="exampleFormControlInput1">Lock Max value</label> <input
										type="number" class="form-control"
										id="exampleFormControlInput1" placeholder="input a number"
										name="maxLock">
								</div>
							</div>
						</div>
					</div>
					<div class="container px-lg-5">
						<div class="row mx-lg-n5">
							<div class="col py-3 px-lg-5">
								<div class="form-group">
									<label for="exampleFormControlInput1">Stock Min Value</label> <input
										type="number" class="form-control"
										id="exampleFormControlInput1" placeholder="input a number"
										name="minStock">
								</div>
							</div>
							<div class="col py-3 px-lg-5">
								<div class="form-group">
									<label for="exampleFormControlInput1">Stock Max value</label> <input
										type="number" class="form-control"
										id="exampleFormControlInput1" placeholder="input a number"
										name="maxStock">
								</div>
							</div>
						</div>
					</div>
					<div class="container px-lg-5">
						<div class="row mx-lg-n5">
							<div class="col py-3 px-lg-5">
								<div class="form-group">
									<label for="exampleFormControlInput1">Barrel Min Value</label>
									<input type="number" class="form-control"
										id="exampleFormControlInput1" placeholder="input a number"
										name="minBarrel">
								</div>
							</div>
							<div class="col py-3 px-lg-5">
								<div class="form-group">
									<label for="exampleFormControlInput1">Barrel Max value</label>
									<input type="number" class="form-control"
										id="exampleFormControlInput1" placeholder="input a number"
										name="maxBarrel">
								</div>
							</div>
						</div>
					</div>
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