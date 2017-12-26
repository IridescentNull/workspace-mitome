<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="headerAdministratorsScreen.jsp"/>
<a class="btn-default btn"  onClick="Javascript:location.href = 'administratorsScreen.jsp'">back</a>
	<br>
	&nbsp;<br>
	<table class="table table-striped">
		<s:iterator value="payInfoDTOList">
			<tr>
				<td>
					<div class="row">
						<div class="col-sm-2 text-center">
							<h1><s:property value="id"/></h1>
						</div>
						<div class="col-sm-6">
							<h4>
								Name: <s:property value="shippingUserName"/><br>
								Price: $<s:property value="price"/>
							</h4>
							<h5>
							<s:if test="!shippingCompanyName.isEmpty()">
								Company:  <s:property value="shippingCompanyName"/><br>
							</s:if>
								Address: <s:property value="shippingAddress1"/> <s:property value="shippingAddress2"/><br>
								Date: <s:property value="insertTime"/><br>
							</h5>
						</div>
						<div class="col-sm-4">
							<h5>
								<s:if test=" cardType == 0">VISA<br></s:if>
								<s:if test=" cardType == 1">MasterCard<br></s:if>
								<s:if test=" cardType == 2">Discover<br></s:if>
								<s:if test=" cardType == 3">American Express<br></s:if>
							</h5>
							<h6>
								Number: <s:property value="cardNumber"/><br>
								Name: <s:property value="nameOnCard"/><br>
								Expiry Date: <s:property value="cardExpiryDate"/><br>
								Code: <s:property value="cardCode"/><br>
							</h6>
						</div>
					</div>
				</td>
			</tr>
		</s:iterator>
	</table>
<a class="btn-default btn"  onClick="Javascript:location.href = 'administratorsScreen.jsp'">back</a>
<jsp:include page="footerAdministrators.jsp"/>