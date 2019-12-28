<%@ include file= "common/header.jsp"%>
<%@ include file= "common/navigation.jsp"%>
<div class="container">
<h1>Add a Todo</h1>
	<form:form method="post" commandName="todo">
	
	
	<form:hidden path="id"/>
	<form:hidden path="user"/>
	
	<fieldset class="form-group">
		<form:label path="desc">Description:</form:label>
		<form:input path="desc" type="text" class="form-control" required="required"/>
		<form:errors path="desc" cssClass="text-warning"/> 
	</fieldset>
	<fieldset class="form-group">
		<form:label path="targetDate">Target Date:</form:label>
		<form:input path="targetDate" type="text" class="form-control" required="required"/>
		<form:errors path="targetDate" cssClass="text-warning"/> 
	</fieldset>
		<input class="btn btn-success" type="submit" value="Submit"/>
	</form:form>
</div>

</body>
<%@ include file= "common/footer.jsp"%>
</html>