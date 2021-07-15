<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<nav role="navigation" class="navbar navbar-default">
	<div class="">
		<a href="/" class="navbar-brand">TM System </a>
	</div>
	<div class="navbar-collapse">
		<ul class="nav navbar-nav">
			<li><a href="/admin">Admin</a></li> <!-- <sec:authorize access="hasRole('ADMIN')"><a href="/admin">Admin</a></sec:authorize> -->
			<li><a href="/list-todos">Todos</a></li>
			<li><a href="/eventlist">Events</a></li>
			<li><a href="/userlist">Users</a></li>
			<li><a href="/tasklist">Tasks</a></li>

		</ul>
		<ul class="nav navbar-right">
		<label>Welcome..${name}..!!</label>
		<li><a href="/logout" class="nav navbar-brand"><span style="font-size: 15px">Logout</span></a></li>
		</ul>
		
	</div>
</nav>	
<script>
$('.anchor').click(function(){
    $('.active').removeClass('active');
    $(this).addClass('active');
});</script>