<%@ include file= "common/header.jsp"%>
<%@ include file= "common/navigation.jsp"%>

<div class="container" >

<div class="row">
	<c:forEach items="${events}" var="event">
		    <div class="col-xs-6 col-md-4" >
		      <div class="card-body">
		        <h5 class="card-title"><strong>Event Name:</strong> ${event.event_name}</h5>
		        <p class="card-text"><strong>Created By :</strong> ${event.created_by}</p>
		        <a href="/update-event?id=${event.id}" class="btn btn-success">Update</a>
		        <a href="/delete-event?id=${event.id}" class="btn btn-danger">Delete</a>
		        <a href="#" class="btn btn-primary">Go to Details</a>
		      </div>
		    </div>
	</c:forEach>
</div>
</div>
<div>
	<a class="btn btn-success" href="/addevent">Add</a>
</div>
</body>
<%@ include file= "common/footer.jsp"%>
<<style>
<!--
.div1 {
  width: 300px;
  height: 100px;
  border: 1px solid blue;
}
-->
</style>
</html>