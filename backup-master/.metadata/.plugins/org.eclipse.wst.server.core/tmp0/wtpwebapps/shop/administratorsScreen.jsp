<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="headerAdministratorsScreen.jsp"/>
<div class="background-gray"></div>
<div class="panel panel-default">
	<div class="panel-body" style="box-shadow: 1px 1px 5px #c0c0c0;">
		<h3>Welcome&nbsp;<b><%=session.getAttribute("administratorUserName") %></b></h3>
		<br>
		<div class="row">
			<div class="col-xs-6 col-xs-offset-3">
				<div class="panel panel-default">
					<div class="panel-body" style="box-shadow: 1px 1px 5px #c0c0c0;">
						<h4>Please Note</h4>
						<h5 style="line-height: 1.5;">&nbsp;&nbsp;&nbsp;You have widely right and can excercise it in this page. It allow you to view and delete several data <b><u>without any alart messages.</u></b><br>&nbsp;&nbsp;&nbspBe careful with these buttons.</h5>
					</div>
				</div>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col-xs-4 text-center">
				<s:form action="GeneralUserAction">
					<button class="btn-primary btn-lg">Users</button>
				</s:form>
			</div>
			<div class="col-xs-4 text-center">
				<s:form action="BuyHistoryAction">
					<button class="btn-warning btn-lg">Sell</button>
				</s:form>
			</div>
			<div class="col-xs-4 text-center">
				<s:form action="BillAction">
					<button class="btn-danger btn-lg">Bill</button>
				</s:form>
			</div>
		</div>
		<br>
		<br>
	</div>
</div>
<br><br>

<jsp:include page="footerAdministrators.jsp"/>
