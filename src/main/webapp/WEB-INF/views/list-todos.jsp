<%@ include file= "common/header.jsp"%>
<%@ include file= "common/navigation.jsp"%>
<div class="container">
		<table class="table table-striped">
			<caption>Your Todos are</caption>

			<thead>
				<tr>
					<th>Description</th>
					<th>Date</th>
					<th>Completed</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.desc}</td>
						<td><fmt:formatDate pattern="dd/MM/yyyy" value="${todo.targetDate}"/></td>
						<td>${todo.done}</td>
						<td><a href="/update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
						<td><a href="/delete?id=${todo.id}" class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	<div>
	<a class="btn btn-success" href="/add-todo">Add</a>
	</div>
</div>
<%@ include file= "common/footer.jsp"%>
</body>
</html>