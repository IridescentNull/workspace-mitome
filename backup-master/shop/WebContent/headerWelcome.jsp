<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>Hello Hello!</title>
<sj:head />
<link rel="stylesheet" type="text/css" href="http://netdna.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
  <%-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> なんかこれ入っていると js: で書くjQueryが死ぬ--%>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
	div.container{
		max-width:800px;
		position: relative;
		height: auto;
		height:100%;
	}
	p.err{
		color:red;
	}
	div.result dd{
		margin-bottom:32px;
	}
	footer{
		height: 60px;
		}
	#wrap{
		mini-height:100%;
		height: auto;
		margin: auto -60px;
		padding: 0 0 60px;
		text-shadow:
		0 0 2px #FFFFFF, 0 0 2px #FFFFFF, 0 0 2px #FFFFFF, 0 0 2px #FFFFFF, 0 0 2px #FFFFFF, 0 0 2px #FFFFFF;/* 影を無理やり濃くしている */

	}


</style>
<script  type="text/javascript"  charset="utf-8">
	function Orange(){
		var nowValue = document.getElementById('test').innerHTML;
		var addValue = "<img src='orange.png' alt=''>";
		document.getElementById('test').innerHTML = nowValue + addValue;}
</script>
</head>
<body>
	<div id="wrap">
	<div class="container">
		<div class="page-header">
			<a onClick="Orange()" ><h1>ORange <small> ver 3.12.07</small></h1></a>

					You are logged in as: <strong> <s:property  value="loginUserIdShadow" /></strong>


		</div>


