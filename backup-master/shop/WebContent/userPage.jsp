<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="header.jsp"/>

	<table class="table table-striped">
		<tr>
			<td>
				<div class="col-sm-3"><h4 class="text-center">Login&nbsp;Id</h4></div>
				<div class="col-sm-9"><h4 class="text-center"><s:property value="loginUserId" escape="false"/></h4></div>
			</td>
		</tr>
		<tr>
			<td>
			<div class="col-sm-3"><h4 class="text-center">Full&nbsp;Name</h4></div>
			<div class="col-sm-9"><h4 class="text-center"><s:property value="userName" escape="false"/></h4></div>
		</td>
		</tr>
		<tr>
			<td>
				<div class="col-sm-3"><h4 class="text-center">Address</h4></div>
				<div class="col-sm-9"><h4 class="text-center"><s:property value="userAddress1"/>&nbsp;<s:property value="userAddress2"/></h4></div>
			</td>
		</tr>
		<tr>
			<td>
				<div class="col-sm-3"><h4 class="text-center">City</h4></div>
				<div class="col-sm-9"><h4 class="text-center"><s:property value="userCity"/></h4></div>
			</td>
		</tr>
		<tr>
			<td>
				<div class="col-sm-3"><h4 class="text-center">State</h4></div>
				<div class="col-sm-9"><h4 class="text-center"><s:property value="userState"/></h4></div>
			</td>
		</tr>
		<tr>
			<td>
				<div class="col-sm-3"><h4 class="text-center">ZIP Code</h4></div>
				<div class="col-sm-9"><h4 class="text-center"><s:property value="userZIP"/></h4></div>
			</td>
		</tr>
		<tr>
			<td>
				<div class="col-sm-3"><h4 class="text-center">Country</h4></div>
				<div class="col-sm-9"><h4 class="text-center"><s:property value="userCountry"/></h4></div>
			</td>
		</tr>
		<tr>
			<td>
				<div class="col-sm-3"><h4 class="text-center">Phone Number</h4></div>
				<div class="col-sm-9"><h4 class="text-center"><s:property value="userPhone"/></h4></div>

	</table>

	<div class="row">
		<div class="col-sm-6">
			<s:form class="col-sm-6" cssClass="form-horizontal" action="LogOutAction">
				<div class="text-center"><button class="btn-lg btn-default">Log Out</button><br><br></div>
		</s:form></div>

		<s:form class="col-sm-6" cssClass="form-horizontal" action="WelcomeAction">
			<div class="text-center"><button class="btn-lg btn-primary">Purchase</button></div>
		</s:form>
		</div>
	<s:form action="UserInfoReviseAction">
		<h4 class="text-center"><br><br>You can modify your account information<button class="btn-link">here.</button></h4>
	</s:form>
	<s:form action="PasswordChangeAction">
		<h4 class="text-center"><br><br>You can also change <strong>your password</strong><button class="btn-link">here.</button></h4>
	</s:form>

	<s:form action="PurchaseHistoryAction">
		<h4 class="text-center"><br><br>You can confirm <strong>your purchase history</strong><button class="btn-link">here.</button></h4>
	</s:form>


<jsp:include page="footer.jsp"/>