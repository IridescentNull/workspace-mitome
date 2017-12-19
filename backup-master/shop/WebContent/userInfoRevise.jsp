<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="header.jsp"/>
	<h2 class="text-center">User Information Modify Form</h2>
	<s:form action="UserInfoReviseConfirmAction">
		<table class="table table-striped text-center">
			<tr>
				<td>
					<h4 class="col-sm-3">Login Id</h4><h4 class="col-sm-9"><s:property value="loginUserId"/>&nbsp&nbsp&nbsp<small>(Can't be changed.)</small></h4>
				</td>
			</tr>
			<tr>
				<td class="td_vertical_align_middle">
					<h4 class="col-sm-3 ">Full Name</h4><h4 class="col-sm-9"><input name="newUserName" class="form-control" value="<s:property value='userName'/>"></h4>
				</td>
			</tr>
			<tr>
				<td class="td_vertical_align_middle">
					<h4 class="col-sm-3">Address (Line1)</h4><h4 class="col-sm-9"><input name="newUserAddress1" class="form-control" value="<s:property value='userAddress1'/>"></h4>
				</td>
			</tr>
			<tr>
				<td class="td_vertical_align_middle">
					<h4 class="col-sm-3">Address (Line2)</h4><h4 class="col-sm-9"><input name="newUserAddress2" class="form-control" value="<s:property value='userAddress2'/>"></h4>
				</td>
			</tr>
			<tr>
				<td class="td_vertical_align_middle">
					<h4 class="col-sm-3">City</h4><h4 class="col-sm-9"><input name="newUserCity" class="form-control" value="<s:property value='userCity'/>"></h4>
				</td>
			</tr>
			<tr>
				<td class="td_vertical_align_middle">
					<h4 class="col-sm-3">State</h4><h4 class="col-sm-9"><input name="newUserState" class="form-control" value="<s:property value='userState'/>"></h4>
				</td>
			</tr>
			<tr>
				<td class="td_vertical_align_middle">
					<h4 class="col-sm-3">ZIP Code</h4><h4 class="col-sm-9"><input name="newUserZIP" class="form-control" value="<s:property value='userZIP'/>"></h4>
				</td>
			</tr>
			<tr>
				<td class="td_vertical_align_middle">
					<h4 class="col-sm-3">Country</h4><h4 class="col-sm-9"><input name="newUserCountry" class="form-control" value="<s:property value='userCountry'/>"></h4>
				</td>
			</tr>
			<tr>
				<td class="td_vertical_align_middle">
					<h4 class="col-sm-3">Phone Number</h4><h4 class="col-sm-9"><input name="newUserPhone" class="form-control" value="<s:property value='userPhone'/>"></h4>
				</td>
			</tr>

		</table>
		<div class="form-group">
			<div class="col-sm-offset-3 col-sm-9">
				<div id="switch"><button value="SUBMIT" class="btn-primary btn-lg btn-block">Submit</button></div>
			</div>
		</div>
	</s:form>
	<strong class="col-sm-offset-3 col-sm-9"><font color="red"><h3 class="text-center"><s:property value="errorMessage"/></h3></font></strong>

<jsp:include page="footer.jsp"/>