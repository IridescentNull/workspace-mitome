<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginError</title>
</head>
<body>
<h1>えらー！</h1>
<br>
<h3>ログインできません。</h3>

<s:if test='(loginDTOList.get(0).username=="該当無し"'>
	該当者は居ませんでした。
</s:if>

<br>
	<table>
		<tbody>
			<tr>
				<th>USERNAME</th>
				<th>PASSWORD</th>
			</tr>
			<s:iterator value="loginDTOList">
				<td><s:property value="username"/></td>
				<td><s:property value="password"/></td>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>