<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="headerAdministrators.jsp"/>
<body>
	<% session.removeAttribute("loginUserIdShadow");%>
	<script type='text/javascript' charset='utf-8'>
		setTimeout(function(){
			window.open('about:blank','_self').close();}, 10000);
		setTimeout(function(){
			window.close();}, 10000);
	</script>
	<div class="text-center">
		<div class="row"><div class="col-xs-6 col-xs-offset-3">
				<s:form action="AdministratorEnterAction">
					<h3>You have 10 seconds.</h3>
					<br>
					<h1>
						<script type="text/javascript">
							var sand =10;
							setInterval(function(){
								sand = sand -1;document.getElementById("sand").innerHTML = sand;}, 1000)
						</script>
						<div id="sand" style="color: gray; font-size: 4em;" class="text-center">
							10
						</div>
					</h1>
					<br>
					<br>
					<br>
					<h5>Your id</h5>
					<input type="password" name="administratorId" class="form-control" ><br>
					<h5>Your Password</h5>
					<input type="password" name="administratorPassword" class="form-control" ><br>
					<br>
					<button Class="btn-std btn-sm">Enter</button>
					<br>
					<br>
					<br>
				</s:form>
		</div><div class="col-xs-3"></div></div>
	</div>


<jsp:include page="footer.jsp"/>