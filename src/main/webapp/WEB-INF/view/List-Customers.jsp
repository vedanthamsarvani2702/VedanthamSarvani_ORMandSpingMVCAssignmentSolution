<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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

<title>Customer Relationship Management</title>
</head>

<body>

	<div class="container">

		<h3><center>Customer Relationship Management</center></h3>
		<hr>

		<!-- Add a search form -->

		

			<!-- Add a button -->
			<a href="/SpringMVCAssignmentSolution/customer/showFormForAdd"
				class="btn btn-primary btn-sm mb-3"> Add Customer </a> 
		

		<table class="table table-bordered table-striped">
			<thead class="thead-dark">
				<tr>
					<th>Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email Id</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${Customers}" var="tempCustomer">
					<tr>
						<td><c:out value="${tempCustomer.customerId}" /></td>
						<td><c:out value="${tempCustomer.customerFName}" /></td>
						<td><c:out value="${tempCustomer.customerLName}" /></td>
						<td><c:out value="${tempCustomer.customerEmail}" /></td>
						<td>
							<!-- Add "update" button/link --> <a
							href="/SpringMVCAssignmentSolution/customer/showFormForUpdate?customerId=${tempCustomer.customerId}"
							class="btn btn-info btn-sm"> Update </a> <!-- Add "delete" button/link -->
							<a href="/SpringMVCAssignmentSolution/customer/delete?customerId=${tempCustomer.customerId}"
							class="btn btn-danger btn-sm"
							onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">
								Delete </a>

						</td>

					</tr>
				</c:forEach>

			</tbody>
		</table>

	</div>

</body>
</html>



