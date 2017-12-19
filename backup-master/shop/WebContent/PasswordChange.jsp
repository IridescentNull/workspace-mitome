<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="header.jsp"/>
	<h3 class="text-center">Password Change Form</h3>

<s:form action="PasswordChangeCompleteAction">
			<table class="table table-striped text-center">
				<tr>
					<td class="td_vertical_align_middle">
					<input type="hidden" name="loginUserId" value="<%=(String)session.getAttribute("loginUserIdShadow") %>" >
						<h4 class="col-sm-3 ">Now Password</h4><h4 class="col-sm-9"><input type="password" name="loginPassword" class="form-control" ></h4>
					</td>
				</tr>
				<tr>
					<td class="td_vertical_align_middle">
						<h4 class="col-sm-3 ">NEW Password</h4><h4 class="col-sm-9"><input type="password" name="newLoginPassword" class="form-control" ></h4>
					</td>
				</tr>
				<tr>
					<td class="td_vertical_align_middle">
						<h4 class="col-sm-3 ">NEW Password<br><small>(reconfirm)</small></h4><h4 class="col-sm-9"><input type="password" name="newLoginPasswordShadow" class="form-control" ></h4>
					</td>
				</tr>
			</table>
			<div class="form-group">
				<div class="col-sm-offset-3 col-sm-9">
					<button  value="LOGIN" Class="btn-primary btn-lg btn-block">Change!</button>
				</div>
		</div>
		</s:form>
	<strong class="col-sm-offset-3 col-sm-9"><font color="red"><h3 class="text-center">${errorMessage}</h3></font></strong>
<jsp:include page="footer.jsp"/>