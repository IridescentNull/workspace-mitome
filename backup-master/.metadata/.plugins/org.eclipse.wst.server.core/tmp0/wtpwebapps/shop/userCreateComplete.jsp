<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="header.jsp"/>
	<h2 class="text-center">Welcome to our ORange shop!</h2>
	<br>
	<br>
	<s:form action="UserPageAction">
		<h3 class="text-center">You can confirm your account</h3>
		<h3 class="text-center">information at <button>User Page</button></h3>
	</s:form>
	<br>
	<br>
	<br>
	<h3 class="text-center"><a href="welcome.jsp">Purchase Page is here</a></h3>
<jsp:include page="footer.jsp"/>
