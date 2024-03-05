<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashSet"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="Model.CommissioningProblem"%>
<%@page import="Model.TriangleClassify"%>
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
<style>
h1 {
	text-align: center;
	color: green;
}
</style>
<title>Testcase Table Commission</title>
</head>
<body>
	<h1>Result Commission</h1>
	<div class="container px-lg-5">
		<div class="row mx-lg-n5">
			<div class="col py-3 px-lg-5 border bg-light">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Test case</th>
							<th scope="col">Lock</th>
							<th scope="col">Stock</th>
							<th scope="col">Barrel</th>
							<th scope="col">Expected output</th>
						</tr>
					</thead>
					<tbody>
						<%
						List<CommissioningProblem> list = (List<CommissioningProblem>) session.getAttribute("list");
						int index = 1;
						for (int i = 0; i < list.size(); i++) {
							CommissioningProblem c = list.get(i);
						%>
						<tr>
							<th scope="row"><%=index%></th>
							<td><%=c.getTotalLocks()%></td>
							<td><%=c.getTotalStocks()%></td>
							<td><%=c.getTotalBarrales()%></td>
							<td><%=c.getCommission()%></td>
						</tr>
						<%
						index++;
						}
						%>
					</tbody>
				</table>
				<a href="index.jsp" class="btn btn-primary" role="button">Back</a>
				</form>
			</div>
		</div>
	</div>
</body>
</html>