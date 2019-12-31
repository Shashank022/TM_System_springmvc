<%@ include file= "common/header.jsp"%>
<%@ include file= "common/navigation.jsp"%>
<div class="container">
<h1>Add a Event</h1>
	<form:form method="post" modelAttribute="event">
	
	

	<fieldset class="form-group">
		<form:label path="event_name">Event :</form:label>
		<form:input path="event_name" type="text" class="form-control" required="required"/>
		<form:errors path="event_name" cssClass="text-warning"/> 
	</fieldset>
	
	<fieldset class="form-group">
		<form:label path="created_by">Created By :</form:label>
		<form:input path="created_by" type="text" class="form-control" required="required"/>
		<form:errors path="created_by" cssClass="text-warning"/> 
	</fieldset>
	
	<fieldset class="form-group">
		<form:label path="created_date">Created Date:</form:label>
		<form:input path="created_date" type="text" class="form-control" required="required"/>
		<form:errors path="created_date" cssClass="text-warning"/> 
	</fieldset>
	
	<fieldset class="form-group">
		<form:label path="updated_by">Updated By :</form:label>
		<form:input path="updated_by" type="text" class="form-control" required="required"/>
		<form:errors path="updated_by" cssClass="text-warning"/> 
	</fieldset>
		<fieldset class="form-group">
		<form:label path="team_id">Team ID:</form:label>
		<form:input path="team_id" type="number" class="form-control" required="required"/>
		<form:errors path="team_id" cssClass="text-warning"/> 
	</fieldset>
		<input class="btn btn-success" type="submit" value="Submit"/>
	</form:form>
</div>

</body>
<%@ include file= "common/footer.jsp"%>
</html>