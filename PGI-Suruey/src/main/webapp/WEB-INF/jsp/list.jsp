<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Bootstrap 4 Striped Table</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style type="text/css">
.bs-example {
	margin: 20px;
}
</style>
</head>
<body>
	<div class="bs-example">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Email</th>
					<th>Designation</th>
				</tr>
				<c:forEach items="${userList}" var="user">
			</thead>

			<tbody>


				<tr>
					<td>${user.recordId}</td>
					<td>${user.userName}</td>
					<td>${user.email}</td>
					<td>${user.designation}</td>
					<td><a href="/np/edit?id=${user.recordId}" class="btn btn-success">Edit</a>
						&nbsp;&nbsp;&nbsp; <a href="/np/delete?id=${user.recordId}" class="btn btn-danger">Delete</a>
					</td>
				</tr>

			</tbody>
			</c:forEach>
		</table>
	</div>
</body>
</html>
