<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<title>Save Customer</title>
</head>

<body>

	<div class="container">

		<h3><center>Customer Relationship Management</center></h3>
		<hr>

		<p class="h4 mb-4">Save Customer</p>

		<form action="/SpringMVCAssignmentSolution/customer/save" method="POST">

			<!-- Add hidden form field to handle update -->
			
<input type="hidden" name="customerId" value="${Customer.customerId}" />
			<div class="form-inline">
				<input type="text" name="customerFName" value="${Customer.customerFName}"
					class="form-control mb-4 col-4" placeholder="First Name">



			</div>

			<div class="form-inline">

				<input type="text" name="customerLName" value="${Customer.customerLName}"
					class="form-control mb-4 col-4" placeholder="Last Name">



			</div>

			<div class="form-inline">

				<input type="text" name="customerEmail" value="${Customer.customerEmail}"
					class="form-control mb-4 col-4" placeholder="Email Id">



			</div>

			<button type="submit" class="btn btn-info col-2">Save</button>

		</form>

		<hr>
		<a href="/SpringMVCAssignmentSolution/customer/list">Back to List</a>

	</div>
</body>

</html>










