<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>Administorators Screen</title>
<sj:head jquerytheme="redmond"/> <!-- jquerytheme="redmond" をいれると、一発でデザインいじれるが、 -->
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
	p.box{
	border-bottom: 1px solid lightgray;
	}
	p.err{
		color:red;
	}
	div.result dd{
		margin-bottom:32px;
	}
	footer.perchase-progress-bar{
		margin: 0 auto;
		position: absolute;
		overflow: hidden;
		height: 110px;
		background-color: #f5f5f5;
		width:100%;
		overflow: hidden;
		top: 120px;

	}
	footer.perchase-progress-bar.affix{
		top: 0px;
		position: fixed;
	}
	footer{
		height: 60px;
		}
	footer.perchase{
		height: 120px;
		background-color: #f5f5f5;
		position: fixed;
		bottom: 0;
		width: 100%;
		border-top:1px solid #cccccc;
		}
	#wrap{
		mini-height:100%;
		height: auto;
		margin: auto -0px;
		padding: 0 0 0px;
		text-shadow:
		0 0 2px #FFFFFF, 0 0 2px #FFFFFF, 0 0 2px #FFFFFF, 0 0 2px #FFFFFF, 0 0 2px #FFFFFF, 0 0 2px #FFFFFF;/* 影を無理やり濃くしている */

	}
	@media(min-width:768px){
	td.td_vertical_align_middle{
    display:flex;
    align-items:center;
    }
	}/* bootstrap3のvertical-align:topをどうにかして打ち消すためのもの
		flexをつけない行をつくらないと、長さを維持できないかも*/

	@media(min-width:768px){
	.history-button{
    position: absolute;
	bottom: -180px  !important;
	right: 20px  !important;
    }
	}

		@media(min-width:768px){
	.buy-history-button{
    position: absolute;
	bottom: -80px  !important;
	right: 20px  !important;
    }
	}


	.overlay-btn{
		display: block;
		cursor: pointer;
		color: #0000FF;

	}

	.overlay-btn2{
		display: block;
		cursor: pointer;
		color: #0000FF;

	}

	.overlay-btn3{
		display: block;
		cursor: pointer;
		color: #0000FF;

	}

	.overlay-btn4{
		display: block;
		cursor: pointer;
		color: #0000FF;

	}

	.overlay-btn5{
		display: block;
		cursor: pointer;
		color: #0000FF;

	}

	.overlay-btn:hover{
	text-decoration: underline;

	}

	.overlay-btn2:hover{
	text-decoration: underline;

	}

	.overlay-btn3:hover{
	text-decoration: underline;

	}

	.overlay-btn4:hover{
	text-decoration: underline;

	}

	.overlay-btn5:hover{
	text-decoration: underline;

	}


	.overlay{
		display: none;
		width:800px;
		height: 65%;
		position: fixed;
		left: 2%;
		right: 2%;
		top: 20%;
		margin: auto;
		z-index: 100;
		background: #FFFFFF;

	}

	.overlay-storage{
		display: none;
		width:800px;
		height: 1000px;
		position: absolute;
		left: 2%;
		right: 2%;
		top: 30%;
		margin: 0%;
		z-index: 100;
		background: #FFFFFF;
	}

	.overlay-mouse{
		display: none;
		width:800px;
		height: 720px;
		position: absolute;
		left: 2%;
		right: 2%;
		top: 60%;
		margin: 0%;
		z-index: 100;
		background: #FFFFFF;
	}

	.overlay-fruit{
		display: none;
		width:800px;
		height: 360px;
		position: absolute;
		left: 2%;
		right: 2%;
		top: 79%;
		margin: 0%;
		z-index: 100;
		background: #FFFFFF;
	}

	.overlay-flower{
		display: none;
		width:800px;
		height: 400px;
		position: absolute;
		left: 2%;
		right: 2%;
		top: 83%;
		margin: 0%;
		z-index: 100;
		background: #FFFFFF;
	}

	.overlay-shadow{
		display: none;
		width:100%;
		height: 100%;
		position: fixed;
		left: 0%;
		top: 0%;
		z-index: 10;
		background: rgba(0,0,0,0.7);
		overflow:scroll
	}

	.background-top-white{
		width: 100%;
		height: 120px;
		position: absolute;
		left: 0%;
		overflow: hidden;
		top: 0%;
		z-index: -5;
		background: white;
	}

	.background-gray{
		width: 100%;
		height: 100%;
		position: fixed;
		left: 0%;
		top: 0;
		z-index: -10;
		background: #f5f5f5;
	}

	.overlay-close{
		width: 70px;
		text-align: left;
		cursor: pointer;
		font-size: 18ex;
		line-height: 0.5;
	}
	.overlay-close2{
		width: 70px;
		text-align: left;
		cursor: pointer;
		font-size: 18ex;
		line-height: 0.5;
	}
	.overlay-close3{
		width: 70px;
		text-align: left;
		cursor: pointer;
		font-size: 18ex;
		line-height: 0.5;
	}
	.overlay-close4{
		width: 70px;
		text-align: left;
		cursor: pointer;
		font-size: 18ex;
		line-height: 0.5;
	}

	.overlay-close5{
		width: 70px;
		text-align: left;
		cursor: pointer;
		font-size: 18ex;
		line-height: 0.5;
	}

	.overlay-text{
		padding: 5% 10%;
		margin: auto;
		line-height: 1.5;

	}
	div.inliner{
		text-align: left;
		float: left;
	}

	div.inliner-right{
		text-align: right;
	}
	div.transparent{
		opacity: 0;
	}
	div.transparent-sought{
		opacity: 1;
		transition: 0.8s;
	}
	div.hidden{
		style="display: none;"
	}
	button.hidden{
		style="display: none;"
	}

	ul.perchase-bottom.perchase-bottom.perchase-bottom > li{
		text-align: left;
	}

	#taxQuestion:hover >.mini-overlay{
		display: block;
	}
	#taxQuestion:hover img{
		position: relative;
		z-index: 150;
	}

	#taxQuestion >.mini-overlay{
		display: none;
		position: absolute;
		top: -100px;
		left: -250px;
		width: 285px;
		height: 165px;
		z-index: 100;
		padding: 5px 20px;
		box-shadow: 1px 1px 5px #c0c0c0;
	}

	#securityCodeQuestion:hover >.mini-overlay{
		display: block;
	}
	#securityCodeQuestion:hover img{
		position: relative;
		z-index: 150;
	}


	#securityCodeQuestion >.mini-overlay{
		display: none;
		position: absolute;
		top:200px;
		left: 180px;
		width: 200px;
		height: 165px;
		z-index: 100;
		padding: 5px 20px;
		box-shadow: 1px 1px 5px #c0c0c0;
	}


	th.recyle{
		background-color: #f5f5f5;
		border: 1px solid gray;
		padding: 2px 2px 2px 2px;
	}
	table.recyle{
		border: 1px solid gray;
		font-size: 12px;
		line-height: 2.0;
		padding: 2px 2px 2px 2px;
	}
	tr.recyle{
		border: 1px solid gray;
		padding: 2px 2px 2px 2px;
	}
	td.recyle{
		border: 1px solid gray;
		padding: 2px 2px 2px 2px;
	}






</style>
<script  type="text/javascript"  charset="utf-8">
		function Orange(){
			window.close();}
	</script>
</head>
<body>
	<div id="wrap">
	<div class="container">
		<div class="page-header">
			<a onClick="Orange()" ><h1>ORange <small> ver 3.12.07</small></h1></a>
			<%out.println("You are logged in as: <strong>"+(String)session.getAttribute("administratorIdShadow")+" </strong>."); %>










		</div>


