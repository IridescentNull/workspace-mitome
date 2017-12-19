<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<jsp:include page="header.jsp"/>
	<div class="container">
		<table class="table table-striped">
			<tr>
				<td class="text-center"><p>入り口はこちら</p></td>
			</tr>
			<tr>
				<td class="text-center">
					<s:form action="IndexAction">
					<!--<s:submit value="どうぞ"/>-->
					<button class="btn-default btn-lg btn-block">Push!</button>
				</s:form></td>
			</tr>
		</table>
	</div>
	<p><sj:datepicker name="date" id="date" displayFormat="yy/mm/dd"/></p>

<jsp:include page="footer.jsp"/>
<!--
　　　＿＿＿
　　／∴☆＜フ
　 /∴∵ (ﾟДﾟ)
　｜∴∵(ﾉ∴∵L).｡oO（「ORange」をクリックすると俺が増えるぞ）
　 ﾍ∴∵∴∵∴/
　　＼∴∵∴／
　　　∪￣∪
-->