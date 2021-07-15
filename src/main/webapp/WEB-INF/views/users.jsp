<%@ include file= "common/header.jsp"%>
<%@ include file= "common/navigation.jsp"%>

<div class="container">
Welcome ${name} all Users are

<div class="container">
	
		<table class="table table-striped">
		

			<thead>
				<tr>
					<th>User Name</th>
					<th>User ID</th>
					<th>User Role</th>
				</tr>
			</thead>

			<tbody>
			<c:forEach items="${users}" var="user">
					<tr>
						<td>${user.user_name}</td>
						<td>${user.user_id}</td>
						<td>${user.user_role}</td>
						<td><a href="/update-user?id=${user.id}" class="btn btn-success">Update</a></td>
						<td><a href="/delete?id=${user.id}" class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	<div>
	<a class="btn btn-success" href="/adduser">Add</a>
	</div>
</div>

</div>
</body>
<%@ include file= "common/footer.jsp"%>
</html>