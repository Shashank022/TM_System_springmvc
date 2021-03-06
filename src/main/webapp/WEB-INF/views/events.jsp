<%@ include file= "common/header.jsp"%>
<%@ include file= "common/navigation.jsp"%>

<div class="container">
Welcome ${name}

<div class="container">
		<table class="table table-striped">
			<caption>Your Events are</caption>

			<thead>
				<tr>
					<th>Created By</th>
					<th>Created Date</th>
					<th>Updated By</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${events}" var="event">
					<tr>
						<td>${event.created_by}</td>
						<td><fmt:formatDate pattern="dd/MM/yyyy" value="${event.created_date}"/></td>
						<td>${event.created_date}</td>
						<td><a href="/update-todo?id=${event.id}" class="btn btn-success">Update</a></td>
						<td><a href="/delete?id=${event.id}" class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	<div>
	<a class="btn btn-success" href="/addevent">Add</a>
	</div>
</div>

</div>
</body>
<%@ include file= "common/footer.jsp"%>
</html>