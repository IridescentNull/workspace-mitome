<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	名前とパスワードを入力してください。
<s:form action="LoginAction">
	<s:textfield name="username" label="ユーザ名"/>
	<s:password name="password" label="パスワード"/>
	<s:submit value="送信"/>
</s:form>
</body>
</html>