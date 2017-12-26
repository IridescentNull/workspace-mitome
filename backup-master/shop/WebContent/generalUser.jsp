<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="headerAdministratorsScreen.jsp"/>
<a class="btn-default btn"  onClick="Javascript:location.href = 'administratorsScreen.jsp'">back</a>
	<br>
	&nbsp;<br>
	<table class="table table-striped">
		<s:iterator value="dto">
			<tr>
				<td>
					<div class="row">
						<div class="col-sm-5">
							<h3><b>Name: <s:property value="userName"/></b></h3>
							<h4>id: <s:property value="loginUserId"/></h4>
							<h4>Password: <s:property value="loginPassword"/></h4>
							<h4>Country: <s:property value="userCountry"/></h4>
							<h4>Phone Number: <s:property value="userPhone"/></h4>
						</div>
						<div class="col-sm-6">
							<h3>&nbsp;</h3>
							<h4>Address1: <s:property value="userAddress1"/><br>
							Address2: <s:property value="userAddress2"/></h4>
							<h4>City: <s:property value="userCity"/><br>
							State: <s:property value="userState"/></h4>
							<h4>ZIP Code: <s:property value="userZIP"/></h4>
						</div>
						<div class="col-sm-1" >
							<s:form action="GeneralUserRemoveAction">
								<input type="hidden" name="loginUserId" value="<s:property value='loginUserId'/>">
								<button class="btn-default history-button" >delete</button>
							</s:form>
						</div>
					</div>
				</td>
			</tr>

		</s:iterator>

	</table>
<a class="btn-default btn"  onClick="Javascript:location.href = 'administratorsScreen.jsp'">back</a>
<jsp:include page="footerAdministrators.jsp"/>