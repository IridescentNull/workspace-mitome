<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<meta charset="utf-8">
	<title>Insert title here</title>
	<style type="text/css">

		body{
		margin:0;
		line-height:1.6;
		letter-spacing:1px;
		font-family:Verdana, Helvatica. sans-serif;
		font-size: 12px;
		color:#333;
		background: #fff;
		}
		table{
			text-align:center;
			margin: 0 auto;
		}
		#top{
			width:780px;
			margin: 30px auto;
			barder: 1px solid #333;
		}
		#header{
			width: 100px;
			height: 80px;
			bachground-color: black;
		}
		#main{
			width: 100%;
			height: 500px;
			text-align: center;
		}
		#footer{
			width: 100px;
			height: 80px;
			background-color:black;
			celar:both;
		}
	</style>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>UserCreateConfirm</p>
		</div>
		<div><br>
			<h3>ユーザの登録が完了いたしました。</h3>

			<div>
				<a href='<s:url action="HomeAction" />'>ログインへ</a>
			</div>
		</div>
		<div id="footer">
			<div id="pr">
			</div>
		</div>
	</div>

</body>
</html>