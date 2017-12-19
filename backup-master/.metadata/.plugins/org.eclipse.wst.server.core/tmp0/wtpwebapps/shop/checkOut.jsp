<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<jsp:include page="header.jsp"/>
<script type="text/javascript">
	function PcOneShow(){
		document.getElementById("pcOne").className="row";
		document.getElementById("pcOneButtonReverse").className="btn-link"
		document.getElementById("pcOneButton").className="btn-link hidden"
	}
	function PcOneHide(){
		document.getElementById("pcOne").className="row hidden";
		document.getElementById("pcOneButtonReverse").className="btn-link hidden"
		document.getElementById("pcOneButton").className="btn-link"
	}

	var date=new Date();
	var week=date.getDay();
	var yobi= new Array("Sun","Mon","Tus","Wen","Thr","Fri","Sat");
	var month=date.getMonth();
	var months= new Array("Jan","Feb","Mar","Apr","May","Jun","Jly", "Aug", "Sep", "Oct", "Nov", "Dec");
	var day=date.getDate();
	var twoAfterDate = new Date(date.getTime() + 2*24*60*60*1000);//ミリ秒をがんばって二日に
	var twoAfterMonth = twoAfterDate.getMonth();
	var twoAfterWeek = twoAfterDate.getDay();
	var twoAfterDay = twoAfterDate.getDate();

	function pcOneDeliverZero(){
		document.getElementById("pcOneDeliver").value = 0;
	}
	function pcOneDeliverOne(){
		document.getElementById("pcOneDeliver").value = 1;
	}
	function pcOneDeliverTwo(){
		document.getElementById("pcOneDeliver").value = 2;
	}
	function connectorOneDeliverZero(){
		document.getElementById("connectorOneDeliver").value = 0;
	}
	function connectorOneDeliverOne(){
		document.getElementById("connectorOneDeliver").value = 1;
	}
	function connectorOneDeliverTwo(){
		document.getElementById("connectorOneDeliver").value = 2;
	}
	function connectorTwoDeliverZero(){
		document.getElementById("connectorTwoDeliver").value = 0;
	}
	function connectorTwoDeliverOne(){
		document.getElementById("connectorTwoDeliver").value = 1;
	}
	function connectorTwoDeliverTwo(){
		document.getElementById("connectorTwoDeliver").value = 2;
	}
	function driveDeliverZero(){
		document.getElementById("driveDeliver").value = 0;
	}
	function driveDeliverOne(){
		document.getElementById("driveDeliver").value = 1;
	}
	function driveDeliverTwo(){
		document.getElementById("driveDeliver").value = 2;
	}
	function storageDeliverZero(){
		document.getElementById("storageDeliver").value = 0;
	}
	function storageDeliverOne(){
		document.getElementById("storageDeliver").value = 1;
	}
	function storageDeliverTwo(){
		document.getElementById("storageDeliver").value = 2;
	}
	function airportDeliverZero(){
		document.getElementById("airportDeliver").value = 0;
	}
	function airportDeliverOne(){
		document.getElementById("airportDeliver").value = 1;
	}
	function airportDeliverTwo(){
		document.getElementById("timeCapsuleDeliver").value = 2;
	}
	function timeCapsuleDeliverZero(){
		document.getElementById("timeCapsuleDeliver").value = 0;
	}
	function timeCapsuleDeliverOne(){
		document.getElementById("timeCapsuleDeliver").value = 1;
	}
	function timeCapsuleDeliverTwo(){
		document.getElementById("timeCapsuleDeliver").value = 2;
	}
	function officeDeliverZero(){
		document.getElementById("officeDeliver").value = 0;
	}
	function officeDeliverOne(){
		document.getElementById("officeDeliver").value = 1;
	}
	function officeDeliverTwo(){
		document.getElementById("officeDeliver").value = 2;
	}
	function credit(){
		document.getElementById("creditForm").className ="";
	}

</script>
	<div class="background-gray"></div>
	<br>
	<div class="panel panel-default">
		<div class="panel-body" style="box-shadow: 1px 1px 5px #c0c0c0;">
			<s:if test="continueFlug == null || continueFlug == 0">
				<h3>&#9312; Delivery &#x26; Pickup Options</h3>
			</s:if>
			<s:if test="continueFlug != null && continueFlug != 0">
				<div class="inliner"><h3>&#9312; Delivery &#x26; Pickup Options</h3></div>
				<div class="inliner-right">
					<s:form action="DeliveryEditAction">
						<input type="hidden" name="memoryForm" value="<%=session.getAttribute("memoryForm") %>">
						<input type="hidden" name="storageForm" value="<%=session.getAttribute("storageForm") %>">
						<input type="hidden" name="mouseForm" value="<%=session.getAttribute("mouseForm") %>">
						<input type="hidden" name="fruitForm" value="<%=session.getAttribute("fruitForm") %>">
						<input type="hidden" name="flowerForm" value="<%=session.getAttribute("flowerForm") %>">
						<input type="hidden" name="pcType" value="<%=session.getAttribute("pcType") %>">
						<input type="hidden" name="totalPrice1" value="<%=session.getAttribute("totalPrice1") %>">
						<input type="hidden" name="careCheck" value="<%=session.getAttribute("careCheck") %>">
						<input type="hidden" name="connector1Check" value="<%=session.getAttribute("connector1Check") %>">
						<input type="hidden" name="connector2Check" value="<%=session.getAttribute("connector2Check") %>">
						<input type="hidden" name="driveCheck" value="<%=session.getAttribute("driveCheck") %>">
						<input type="hidden" name="storageCheck" value="<%=session.getAttribute("storageCheck") %>">
						<input type="hidden" name="airportCheck" value="<%=session.getAttribute("airportCheck") %>">
						<input type="hidden" name="timeCapsuleCheck" value="<%=session.getAttribute("timeCapsuleCheck") %>">
						<input type="hidden" name="officeCheck" value="<%=session.getAttribute("officeCheck") %>">
						<input type="hidden" name="tax" value="<%=session.getAttribute("tax")%>">
						<input type="hidden" name="continueFlug" value= 0>
						<button class="btn-default btn-lg">Edit</button>
					</s:form>
				</div>
			</s:if>
			<br>
			<s:if test="continueFlug != 3">
			<s:if test='pcType == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="desktop.gif" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>Desktop PC</strong>&nbsp;<span style="color: gray;">|</span>&nbsp;<button id="pcOneButton" class="btn-link" onClick="PcOneShow()"><small>Show Product Details</small></button><button id="pcOneButtonReverse" class="btn-link hidden" onClick="PcOneHide()"><small>Hide Product Details</small></button></div><div class="inliner-right"><strong>$<%=session.getAttribute("totalPrice1") %></strong></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="pcOneDeliver" checked="checked" onClick="pcOneDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="pcOneDeliver" onClick="pcOneDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>
							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="pcOneDeliver" onClick="pcOneDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1'>
								<s:if test='pcOneDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='pcOneDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='pcOneDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
					<div id="pcOne" class="row hidden">
						<div class="col-xs-6">
							<strong>Hardware</strong><br>
								<ul style="color: gray;">
									<li>2.3GHz dual-leaf 7th-generation Garnish Core i5 fruit-processor, Turbo Boost up to 3.6GHz</li>
									<div style="line-height: 0.5;"><br></div>
									<li>
										<s:if test='memoryForm == 0'>8GB 2133MHz DDR4</s:if>
										<s:if test='memoryForm == 1'>16GB 2133MHz DDR4</s:if>
										<s:if test='memoryForm == 2'>32GB 2133MHz DDR4</s:if>
									</li>
									<div style="line-height: 0.5;"><br></div>
									<li>
										<s:if test='storageForm == 0'>1TB Cereal Food ATA Drive</s:if>
										<s:if test='storageForm == 1'>2TB Cereal Food ATA Drive</s:if>
										<s:if test='storageForm == 2'>256GB SSD</s:if>
										<s:if test='storageForm == 3'>512GB SSD</s:if>
										<s:if test='storageForm == 4'>1TB SSD</s:if>
									</li>
									<div style="line-height: 0.5;"><br></div>
									<li>
										<s:if test='mouseForm == 0'>Magic Mouse 2</s:if>
										<s:if test='mouseForm == 1'>Magic Trackpad 2</s:if>
										<s:if test='mouseForm == 2'>Magic Mouse 2 + Trackpad 2</s:if>
									</li>
									<div style="line-height: 0.5;"><br></div>
									<li>Magic Keyboard - US English</li>
									<div style="line-height: 0.5;"><br></div>
									<li>Accessory Kit</li>
								</ul>
						</div>
						<div class="col-xs-6">
						<strong>Software</strong><br>
								<ul style="color: gray;">
									<li>Pages, Numbers, Keynote</li>
									<div style="line-height: 0.5;"><br></div>
									<li>Photos, iMovie, GarageBand</li>
									<div style="line-height: 0.5;"><br></div>
									<li>macOS</li>
									<div style="line-height: 0.5;"><br></div>
										<s:if test='fruitForm == 1'><li>Fruit Cut X</li><div style="line-height: 0.5;"><br></div></s:if>
										<s:if test='flowerForm == 1'><li>Flower Petal X</li><div style="line-height: 0.5;"><br></div></s:if>
								</ul>
						</div>
					</div>
					<s:if test='careCheck == 1'>
						<small><b>Services and Support</b></small><br>
						<div class="row">
							<div class="col-xs-3 text-right">
								<img src="Cure.jpg"  width ="50px">
							</div>
							<div class="col-xs-9">
								<div class="inliner"><small>ORgangeCare+ for PC</small></div><div class="inliner-right"><small><b>$169.00</b></small></div>
								<div style="line-height: 0.5;"><br></div>
							</div>
						</div>
					</s:if>
					<a href="recycleFee.jsp" target="_blank"><button class="btn-link btn-sm">Recycle fee</button></a>
				</div>
			</div>
			<br>
			</s:if>
			<s:if test='connector1Check == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="connector.jpg"  width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>Thunderbolt 3 (USB‑C) to Thunderbolt 2 Adapter</strong></div><div class="inliner-right"><b>$49.00</b></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="connectorOneDeliver" checked="checked" onClick="connectorOneDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="connectorOneDeliver" onClick="connectorOneDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>

							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="connectorOneDeliver" onClick="connectorOneDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1'>
								<s:if test='connectorOneDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='connectorOneDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='connectorOneDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
				</div>
			</div>
			<br>
			</s:if>
			<s:if test='connector2Check == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="connector2.jpg"  width ="50px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>USB-C Digital AV Multiport Adapter</strong></div><div class="inliner-right"><b>$69.00</b></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="connectorTwoDeliver" checked="checked" onClick="connectorTwoDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="connectorTwoDeliver" onClick="connectorTwoDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>
							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="connectorTwoDeliver" onClick="connectorTwoDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1'>
								<s:if test='connectorTwoDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='connectorTwoDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='connectorTwoDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
				</div>
			</div>
			<br>
			</s:if>
			<s:if test='driveCheck == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="diskDrive.jpg" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>Apple USB SuperDrive</strong></div><div class="inliner-right"><b>$79.00</b></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="driveDeliver" checked="checked" onClick="driveDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="driveDeliver" onClick="driveDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>
							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="driveDeliver" onClick="driveDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1'>
								<s:if test='driveDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='driveDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='driveDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
				</div>
			</div>
			<br>
			</s:if>
			<s:if test='storageCheck == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="mikan10.png" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>PROMISE Pegasus3 R4 12TB (4 by 3TB) RAID Storage</strong></div><div class="inliner-right"><b>$1,499.00</b></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="storageDeliver" checked="checked" onClick="storageDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="storageDeliver" onClick="storageDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>
							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="storageDeliver" onClick="storageDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1'>
								<s:if test='storageDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='storageDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='storageDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
				</div>
			</div>
			<br>
			</s:if>
			<s:if test='airportCheck == 1 || airportCheck == 2'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="kuukou.png" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>AirPort <s:if test='airportCheck == 1'>Express</s:if><s:if test='airportCheck == 2'>Extreme</s:if></strong></div><div class="inliner-right"><strong><s:if test='airportCheck == 1'>$99.00</s:if><s:if test='airportCheck == 2'>$199.00</s:if></strong></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="airportDeliver" checked="checked" onClick="airportDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="airportDeliver" onClick="airportDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>
							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="airportDeliver" onClick="airportDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1'>
								<s:if test='airportDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='airportDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='airportDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
				</div>
			</div>
			<br>
			</s:if>
			<s:if test='timeCapsuleCheck == 1 || timeCapsuleCheck == 2'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="timeCapsule.jpg" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>AirPort Time Capsule <s:if test='timeCapsuleCheck == 1'>- 2TB</s:if><s:if test='timeCapsuleCheck == 2'>- 3TB</s:if></strong></div><div class="inliner-right"><strong><s:if test='timeCapsuleCheck == 1'>$299.00</s:if><s:if test='timeCapsuleCheck == 2'>$399.00</s:if></strong></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="timeCapsuleDeliver" checked="checked" onClick="timeCapsuleDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="timeCapsuleDeliver" onClick="timeCapsuleDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>
							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="timeCapsuleDeliver" onClick="timeCapsuleDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1'>
								<s:if test='timeCapsuleDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='timeCapsuleDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='timeCapsuleDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
				</div>
			</div>
			<br>
			</s:if>
			<s:if test='officeCheck == 1 || officeCheck == 2 || officeCheck == 3 || officeCheck == 4'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="office.jpg"width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>Microsoft Office <s:if test='officeCheck == 1'>365 Home (1-year Subscription; 5 Licenses)</s:if><s:if test='officeCheck== 2'>365 Personal (1-year Subscription; 1 License)</s:if><s:if test='officeCheck== 3'>Home & Student 2016 for Mac</s:if><s:if test='officeCheck== 4'>Home & Business 2016 for Mac</s:if></strong></div><div class="inliner-right"><strong><s:if test='officeCheck == 1'>$99.95</s:if><s:if test='officeCheck == 2'>$69.95</s:if><s:if test='officeCheck == 3'>$149.95</s:if><s:if test='officeCheck == 4'>$229.95</s:if></strong></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="officeDeliver" checked="checked" onClick="officeDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="officeDeliver" onClick="officeDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>
							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="officeDeliver" onClick="officeDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1'>
								<s:if test='officeDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='officeDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='officeDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
				</div>
			</div>
			<br>
			</s:if>
			</s:if>
			<p class="box"/>
			<s:if test="continueFlug == null || continueFlug == 0">
				<div class=inliner-right>
					<s:form action="CheckOutContinueAction">
						<input type="hidden" name="memoryForm" value="<%=session.getAttribute("memoryForm") %>">
						<input type="hidden" name="storageForm" value="<%=session.getAttribute("storageForm") %>">
						<input type="hidden" name="mouseForm" value="<%=session.getAttribute("mouseForm") %>">
						<input type="hidden" name="fruitForm" value="<%=session.getAttribute("fruitForm") %>">
						<input type="hidden" name="flowerForm" value="<%=session.getAttribute("flowerForm") %>">
						<input type="hidden" name="pcType" value="<%=session.getAttribute("pcType") %>">
						<input type="hidden" name="totalPrice1" value="<%=session.getAttribute("totalPrice1") %>">
						<input type="hidden" name="careCheck" value="<%=session.getAttribute("careCheck") %>">
						<input type="hidden" name="connector1Check" value="<%=session.getAttribute("connector1Check") %>">
						<input type="hidden" name="connector2Check" value="<%=session.getAttribute("connector2Check") %>">
						<input type="hidden" name="driveCheck" value="<%=session.getAttribute("driveCheck") %>">
						<input type="hidden" name="storageCheck" value="<%=session.getAttribute("storageCheck") %>">
						<input type="hidden" name="airportCheck" value="<%=session.getAttribute("airportCheck") %>">
						<input type="hidden" name="timeCapsuleCheck" value="<%=session.getAttribute("timeCapsuleCheck") %>">
						<input type="hidden" name="officeCheck" value="<%=session.getAttribute("officeCheck") %>">
						<input type="hidden" name="tax" value="<%=session.getAttribute("tax")%>">
						<input type="hidden" name="continueFlug" value="1">
						<input type="hidden" id="pcOneDeliver" name="pcOneDeliver" value=0>
						<input type="hidden" id="connectorOneDeliver" name="connectorOneDeliver" value=0>
						<input type="hidden" id="connectorTwoDeliver" name="connectorTwoDeliver" value=0>
						<input type="hidden" id="driveDeliver" name="driveDeliver" value=0>
						<input type="hidden" id="storageDeliver" name="storageDeliver" value=0>
						<input type="hidden" id="airportDeliver" name="airportDeliver" value=0>
						<input type="hidden" id="timeCapsuleDeliver" name="timeCapsuleDeliver" value=0>
						<input type="hidden" id="officeDeliver" name="officeDeliver" value=0>
						<button class="btn-lg btn-primary">Continue</button>
					</s:form>
				</div>
				<div style="line-height: 0.5;"><br></div>
				<p class="box"/>
			</s:if>
			<s:if test="continueFlug == null || continueFlug == 0">
				<h3 style="color: gray;">&#9313; Shipping Address</h3>
			</s:if>
			<s:if test="continueFlug == 2 || continueFlug == 3">
				<div class="inliner"><h3>&#9313; Shipping Address</h3></div>
				<div class="inliner-right">
					<s:form action="ShippingEditAction">
 						<input type="hidden" name="userName" value="<s:property value='shippingUserName'/>">
						<input type="hidden" name="shippingCompanyName"  class="shippingCompanyName">
						<input type="hidden" name="userAddress1"  value="<s:property value='shippingAddress1'/>" >
						<input type="hidden" name="userAddress2"  value="<s:property value='shippingAddress2'/>" >
						<input type="hidden" name="userCity"  value="<s:property value='shippingUserCity'/>" >
						<input type="hidden" name="userState"  value="<s:property value='shippingUserState'/>">
						<input type="hidden" name="userZIP"  value="<s:property value='shippingUserZIP'/>">
						<input type="hidden" name="userCountry"  value="<s:property value='shippingUserCountry'/>" >
						<input type="hidden" name="userPhone"  value="<s:property value='shippingUserPhone'/>">
						<input type="hidden" name="tax" value="<%=session.getAttribute("tax")%>">
						<input type="hidden" name="continueFlug" value= 1>
						<input type="hidden" name="freeShipFlug" value="<s:property value='freeShipFlug'/>">
						<button class="btn-default btn-lg">Edit</button>
					</s:form>
					<br>
				</div>
			</s:if>
			<s:if test="continueFlug == 1">
				<h3>&#9313; Shipping Address</h3>
				<p class="box"/>
				<s:form action="ShippingAddressAction">
				<div class="row">
					<div class="col-xs-6">
						<small><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Shipping Address</b></small>
						<div style="line-height: 0.5;"><br></div>
							<div class="row">
								<div class="col-xs-10 col-xs-offset-2">
									<input name="shippingUserName" value="<s:property value='userName'/>" class="form-control" placeholder="Full Name">
								</div>
							</div>
							<div style="line-height: 0.5;"><br></div>
							<div class="row">
								<div class="col-xs-10 col-xs-offset-2">
									<input name="shippingCompanyName"  class="form-control" placeholder="Company Name(optional)">
								</div>
							</div>
							<div style="line-height: 0.5;"><br></div>
							<div class="row">
								<div class="col-xs-10 col-xs-offset-2">
									<input name="shippingAddress1"  value="<s:property value='userAddress1'/>" class="form-control" placeholder="Address1">
								</div>
							</div>
							<div style="line-height: 0.5;"><br></div>
							<div class="row">
								<div class="col-xs-10 col-xs-offset-2">
									<input name="shippingAddress2"  value="<s:property value='userAddress2'/>" class="form-control" placeholder="Address2(optional)">
								</div>
							</div>
							<div style="line-height: 0.5;"><br></div>
							<div class="row">
								<div class="col-xs-5 col-xs-offset-2">
									<input name="shippingUserCity"  value="<s:property value='userCity'/>" class="form-control" placeholder="City">
								</div>
								<div class="col-xs-5">
									<input name="shippingUserState"  value="<s:property value='userState'/>" class="form-control" placeholder="State">
								</div>
							</div>
							<div style="line-height: 0.5;"><br></div>
							<div class="row">
								<div class="col-xs-5 col-xs-offset-2">
									<input name="shippingUserZIP"  value="<s:property value='userZIP'/>" class="form-control" placeholder="ZIP Code">
								</div>
								<div class="col-xs-5">
									<input name="shippingUserCountry"  value="<s:property value='userCountry'/>" class="form-control" placeholder="Country">
								</div>
							</div>
							<div style="line-height: 0.5;"><br></div>
							<div class="row">
								<div class="col-xs-10 col-xs-offset-2">
									<input name="shippingUserPhone"  value="<s:property value='userPhone'/>" class="form-control" placeholder="Phone Number">
								</div>
								<input type="hidden" name="tax" value="<s:property value='tax'/>">
								<input type="hidden" name="freeShipFlug" value="<s:property value='freeShipFlug'/>">
								<input type="hidden" name="continueFlug" value=2>
							</div>
						<br>
						<br>
					</div>
					<div class="col-xs-6">
						<small><b>ORange Shipping Policy</b></small>
						<ul style="color: gray;">
							<div style="line-height: 0.5;"><br></div>
							<li>Signature may be required for delivery</li>
							<div style="line-height: 0.5;"><br></div>
							<li>We do not ship to P.O. boxes</li>							<div style="line-height: 0.5;"><br></div>
							<li>Delivery estimates below include item preparation and shipping time</li>
							<div style="line-height: 0.5;"><br></div>
							<li>Military &#x26; Foreign Service shipping to APO/FPO/DPO</li>
						</ul>
					</div>
				</div>
				<p class="box"/>
				<div class=inliner-right>
					<button class="btn-lg btn-primary">Continue</button>
					<div style="line-height: 0.5;"><br></div>
				</div>
				</s:form>
			</s:if>
			<s:if test="continueFlug == null || continueFlug == 0 || continueFlug ==1">
				<p class="box"/>
				<h3 style="color: gray;">&#9314; Payment</h3>
			</s:if>
			<s:if test="continueFlug == 2">
				<p class="box"/>
				<h3>&#9314; Payment</h3>
				<p class="box"/>
				<div class="row">
					<div class="col-xs-8 col-xs-offset-4">
						<strike><input type="radio" name="paymentType" disabled="disabled">&nbsp;&nbsp;Paypal&nbsp;&nbsp;</strike>
						<br>
						<br>
						<input type="radio" name = "paymentType" onClick="credit()">&nbsp;&nbsp;Credit card
							<s:form id="creditForm" class="hidden" action="PaymentAction">
							<br>
							<img src="CreditLogos.jpg" width="300px"><br>
							<div style="width: 300px;">
								<div class="row" >
									<div class="col-xs-1 col-xs-offset-1">
										<input type="radio" name="cardType" value=0>
									</div>
									<div class="col-xs-1 col-xs-offset-2">
										<input type="radio" name="cardType" value=1>
									</div>
									<div class="col-xs-1 col-xs-offset-1">
										<input type="radio" name="cardType" value=2>
									</div>
									<div class="col-xs-1 col-xs-offset-2">
										<input type="radio" name="cardType" value=3>
									</div>
									<div class="col-xs-2">
									</div>
								</div>

							</div>
							<br>
							<table>
								<tr>
									<td>&nbsp;&nbsp;&nbsp;&nbsp;</td><td>Number &nbsp;&nbsp;&nbsp;&nbsp;</td><td> <input class="form-control" name="cardNumber"placeholder="1234 5678 9012 3456"></td>
								</tr>
								<tr>
									<td>&nbsp;</td><td>&nbsp;</td>
								</tr>
								<tr>
									<td>&nbsp;&nbsp;&nbsp;&nbsp;</td><td>Name on the Card &nbsp;&nbsp;&nbsp;&nbsp;</td><td> <input class="form-control" name="nameOnCard" placeholder="KINOKUNIYA BUNZAEMON"></td>
								</tr>
								<tr>
									<td>&nbsp;</td><td>&nbsp;</td>
								</tr>
								<tr>
									<td>&nbsp;&nbsp;&nbsp;&nbsp;</td><td>Expiry Date &nbsp;&nbsp;&nbsp;&nbsp;</td><td> <input class="form-control" name="cardExpiryDate" placeholder="MM/YY"></td>
								</tr>
								<tr>
									<td>&nbsp;</td><td>&nbsp;</td>
								</tr>
								<tr>
									<td>&nbsp;&nbsp;&nbsp;&nbsp;</td><td>Security Code &nbsp;&nbsp;&nbsp;&nbsp;</td><td> <input class="form-control" name="cardCode" ></td><td><small style="color: gray;">
						<span id="securityCodeQuestion">
							<img src="hatena.png">
							<span class="panel panel-default mini-overlay">
								<b>Security Code</b><br><br>The card security code is a unique three or four digit number printed on the front (American Express) or back (Discover / MasterCard / Visa) of your card, in addition to the account number.
							</span>
							</span>
						</small></td>
								</tr>
							</table>
							<br>
							<div class=inliner-right>
							<input type="hidden" name="shippingUserName" value="<s:property value='shippingUserName'/>">
							<input type="hidden" name="shippingCompanyName"  class="shippingCompanyName">
							<input type="hidden" name="shippingAddress1"  value="<s:property value='shippingAddress1'/>" >
							<input type="hidden" name="shippingAddress2  value="<s:property value='shippingAddress2'/>" >
							<input type="hidden" name="shippingUserCity"  value="<s:property value='shippingUserCity'/>" >
							<input type="hidden" name="shippingUserState"  value="<s:property value='shippingUserState'/>">
							<input type="hidden" name="shippingUserZIP"  value="<s:property value='shippingUserZIP'/>">
							<input type="hidden" name="shippingUserCountry"  value="<s:property value='shippingUserCountry'/>" >
							<input type="hidden" name="shippingUserPhone"  value="<s:property value='shippingUserPhone'/>">
							<input type="hidden" name="tax" value="<%=session.getAttribute("tax")%>">
							<input type="hidden" value=3 name="continueFlug">
							<input type="hidden" name="freeShipFlug" value="<s:property value='freeShipFlug'/>">
					<button class="btn-lg btn-primary">Continue</button>
					<div style="line-height: 0.5;"><br></div>
				</div>
							</s:form>

					</div>
				</div>
			</s:if>
			<s:if test="continueFlug == 3">
			<p class="box"/>
				<div class="inliner"><h3>&#9314; Payment</h3></div>
				<div class="inliner-right">
					<s:form action="PaymentEditAction">
						<input type="hidden" name="continueFlug" value= 2>
						<input type="hidden" name="freeShipFlug" value="<s:property value='freeShipFlug'/>">
						<button class="btn-default btn-lg">Edit</button>
					</s:form>
					<br>
				</div>
			</s:if>
			<s:if test="continueFlug == null || continueFlug == 0 || continueFlug ==1 || continueFlug == 2">
				<p class="box"/>
				<h3 style="color: gray;">&#9315; Purchase Confirmation</h3>
			</s:if>
			<s:if test="continueFlug == 3">
				<p class="box"/>
				<h3>&#9315; Purchase Confirmation</h3>
				<s:if test='pcType == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="desktop.gif" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>Desktop PC</strong>&nbsp;<span style="color: gray;">|</span>&nbsp;<button id="pcOneButton" class="btn-link" onClick="PcOneShow()"><small>Show Product Details</small></button><button id="pcOneButtonReverse" class="btn-link hidden" onClick="PcOneHide()"><small>Hide Product Details</small></button></div><div class="inliner-right"><strong>$<%=session.getAttribute("totalPrice1") %></strong></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1 && continueFlug != 3'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="pcOneDeliver" checked="checked" onClick="pcOneDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="pcOneDeliver" onClick="pcOneDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>
							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="pcOneDeliver" onClick="pcOneDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1 || continueFlug == 3'>
								<s:if test='pcOneDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='pcOneDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='pcOneDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
					<div id="pcOne" class="row hidden">
						<div class="col-xs-6">
							<strong>Hardware</strong><br>
								<ul style="color: gray;">
									<li>2.3GHz dual-leaf 7th-generation Garnish Core i5 fruit-processor, Turbo Boost up to 3.6GHz</li>
									<div style="line-height: 0.5;"><br></div>
									<li>
										<s:if test='memoryForm == 0'>8GB 2133MHz DDR4</s:if>
										<s:if test='memoryForm == 1'>16GB 2133MHz DDR4</s:if>
										<s:if test='memoryForm == 2'>32GB 2133MHz DDR4</s:if>
									</li>
									<div style="line-height: 0.5;"><br></div>
									<li>
										<s:if test='storageForm == 0'>1TB Cereal Food ATA Drive</s:if>
										<s:if test='storageForm == 1'>2TB Cereal Food ATA Drive</s:if>
										<s:if test='storageForm == 2'>256GB SSD</s:if>
										<s:if test='storageForm == 3'>512GB SSD</s:if>
										<s:if test='storageForm == 4'>1TB SSD</s:if>
									</li>
									<div style="line-height: 0.5;"><br></div>
									<li>
										<s:if test='mouseForm == 0'>Magic Mouse 2</s:if>
										<s:if test='mouseForm == 1'>Magic Trackpad 2</s:if>
										<s:if test='mouseForm == 2'>Magic Mouse 2 + Trackpad 2</s:if>
									</li>
									<div style="line-height: 0.5;"><br></div>
									<li>Magic Keyboard - US English</li>
									<div style="line-height: 0.5;"><br></div>
									<li>Accessory Kit</li>
								</ul>
						</div>
						<div class="col-xs-6">
						<strong>Software</strong><br>
								<ul style="color: gray;">
									<li>Pages, Numbers, Keynote</li>
									<div style="line-height: 0.5;"><br></div>
									<li>Photos, iMovie, GarageBand</li>
									<div style="line-height: 0.5;"><br></div>
									<li>macOS</li>
									<div style="line-height: 0.5;"><br></div>
										<s:if test='fruitForm == 1'><li>Fruit Cut X</li><div style="line-height: 0.5;"><br></div></s:if>
										<s:if test='flowerForm == 1'><li>Flower Petal X</li><div style="line-height: 0.5;"><br></div></s:if>
								</ul>
						</div>
					</div>
					<s:if test='careCheck == 1'>
						<small><b>Services and Support</b></small><br>
						<div class="row">
							<div class="col-xs-3 text-right">
								<img src="Cure.jpg"  width ="50px">
							</div>
							<div class="col-xs-9">
								<div class="inliner"><small>ORgangeCare+ for PC</small></div><div class="inliner-right"><small><b>$169.00</b></small></div>
								<div style="line-height: 0.5;"><br></div>
							</div>
						</div>
					</s:if>
					<a href="recycleFee.jsp" target="_blank"><button class="btn-link btn-sm">Recycle fee</button></a>
				</div>
			</div>
			<br>
			</s:if>
			<s:if test='connector1Check == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="connector.jpg"  width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>Thunderbolt 3 (USB‑C) to Thunderbolt 2 Adapter</strong></div><div class="inliner-right"><b>$49.00</b></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1 && continueFlug != 3'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="connectorOneDeliver" checked="checked" onClick="connectorOneDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="connectorOneDeliver" onClick="connectorOneDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>

							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="connectorOneDeliver" onClick="connectorOneDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1 || continueFlug ==3'>
								<s:if test='connectorOneDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='connectorOneDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='connectorOneDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
				</div>
			</div>
			<br>
			</s:if>
			<s:if test='connector2Check == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="connector2.jpg"  width ="50px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>USB-C Digital AV Multiport Adapter</strong></div><div class="inliner-right"><b>$69.00</b></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1 && continueFlug != 3'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="connectorTwoDeliver" checked="checked" onClick="connectorTwoDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="connectorTwoDeliver" onClick="connectorTwoDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>
							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="connectorTwoDeliver" onClick="connectorTwoDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1 || continueFlug == 3'>
								<s:if test='connectorTwoDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='connectorTwoDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='connectorTwoDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
				</div>
			</div>
			<br>
			</s:if>
			<s:if test='driveCheck == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="diskDrive.jpg" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>Apple USB SuperDrive</strong></div><div class="inliner-right"><b>$79.00</b></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1 && continueFlug != 3'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="driveDeliver" checked="checked" onClick="driveDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="driveDeliver" onClick="driveDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>
							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="driveDeliver" onClick="driveDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1 || continueFlug == 3'>
								<s:if test='driveDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='driveDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='driveDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
				</div>
			</div>
			<br>
			</s:if>
			<s:if test='storageCheck == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="mikan10.png" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>PROMISE Pegasus3 R4 12TB (4 by 3TB) RAID Storage</strong></div><div class="inliner-right"><b>$1,499.00</b></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1 && continueFlug != 3'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="storageDeliver" checked="checked" onClick="storageDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="storageDeliver" onClick="storageDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>
							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="storageDeliver" onClick="storageDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1 || continueFlug == 3'>
								<s:if test='storageDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='storageDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='storageDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
				</div>
			</div>
			<br>
			</s:if>
			<s:if test='airportCheck == 1 || airportCheck == 2'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="kuukou.png" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>AirPort <s:if test='airportCheck == 1'>Express</s:if><s:if test='airportCheck == 2'>Extreme</s:if></strong></div><div class="inliner-right"><strong><s:if test='airportCheck == 1'>$99.00</s:if><s:if test='airportCheck == 2'>$199.00</s:if></strong></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1 && continueFlug != 3'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="airportDeliver" checked="checked" onClick="airportDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="airportDeliver" onClick="airportDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>
							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="airportDeliver" onClick="airportDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1 || continueFlug == 3'>
								<s:if test='airportDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='airportDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='airportDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
				</div>
			</div>
			<br>
			</s:if>
			<s:if test='timeCapsuleCheck == 1 || timeCapsuleCheck == 2'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="timeCapsule.jpg" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>AirPort Time Capsule <s:if test='timeCapsuleCheck == 1'>- 2TB</s:if><s:if test='timeCapsuleCheck == 2'>- 3TB</s:if></strong></div><div class="inliner-right"><strong><s:if test='timeCapsuleCheck == 1'>$299.00</s:if><s:if test='timeCapsuleCheck == 2'>$399.00</s:if></strong></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1 && continueFlug != 3'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="timeCapsuleDeliver" checked="checked" onClick="timeCapsuleDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="timeCapsuleDeliver" onClick="timeCapsuleDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>
							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="timeCapsuleDeliver" onClick="timeCapsuleDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1 || continueFlug == 3'>
								<s:if test='timeCapsuleDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='timeCapsuleDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='timeCapsuleDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
				</div>
			</div>
			<br>
			</s:if>
			<s:if test='officeCheck == 1 || officeCheck == 2 || officeCheck == 3 || officeCheck == 4'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="office.jpg"width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>Microsoft Office <s:if test='officeCheck == 1'>365 Home (1-year Subscription; 5 Licenses)</s:if><s:if test='officeCheck== 2'>365 Personal (1-year Subscription; 1 License)</s:if><s:if test='officeCheck== 3'>Home & Student 2016 for Mac</s:if><s:if test='officeCheck== 4'>Home & Business 2016 for Mac</s:if></strong></div><div class="inliner-right"><strong><s:if test='officeCheck == 1'>$99.95</s:if><s:if test='officeCheck == 2'>$69.95</s:if><s:if test='officeCheck == 3'>$149.95</s:if><s:if test='officeCheck == 4'>$229.95</s:if></strong></div>
					<div style="line-height: 0.5;"><br></div>
					<div class="panel panel-default">
						<div class="panel-footer">
							<s:if test='continueFlug != 1 && continueFlug != 3'>
							<div class="row">
								<div class="col-xs-2">
									<small>Ship:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="officeDeliver" checked="checked" onClick="officeDeliverZero()">&nbsp;Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Get it Tomorrow when you select Next Day Shipping
								</small><br>
								<small>
									<input type="radio" name="officeDeliver" onClick="officeDeliverOne()">&nbsp;Delivers Tomorrow - $9.00 for all eligible items
								</small></div>
							</div>
							<div class="row">
								<div class="col-xs-2">
									<small>Pick up:</small>
								</div>
								<div class="col-xs-10">
								<small>
									<input type="radio" name="officeDeliver" onClick="officeDeliverTwo()">&nbsp;Available Today at ORange eternal Loop
								</small></div>
							</div>
							</s:if>
							<s:if test='continueFlug == 1 || continueFlug == 3'>
								<s:if test='officeDeliver == 0'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers <script>document.write(yobi[twoAfterWeek]+"&nbsp"+ months[twoAfterMonth] + "&nbsp;" + twoAfterDay);</script> - Free<br>
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='officeDeliver == 1'>
									<div class="row">
										<div class="col-xs-2">
											<small>Ship:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Delivers Tomorrow - $9.00 for all eligible items
											</small>
										</div>
									</div>
								</s:if>
								<s:if test='officeDeliver == 2'>
									<div class="row">
										<div class="col-xs-2">
											<small>Pick up:</small>
										</div>
										<div class="col-xs-10">
											<small>
												Available Today <span style="color: gray">at ORange eternal Loop</span>
											</small>
										</div>
									</div>
								</s:if>
							</s:if>
						</div>
					</div>
				</div>
			</div>
			<br>
			</s:if>
			</s:if>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-4 col-xs-offset-8">
				<div class="inliner"><small style="color: gray;">Bag Subtotal</small></div><div class=inliner-right><small style="color: gray;">$<%=session.getAttribute("totalPrice2") %></small></div>
				<s:if test="freeShipFlug != 1"><div class="inliner"><small style="color: green;"><b>Free Shipping</b></small></div><div class=inliner-right><small style="color: gray;">$0.00</small></div></s:if>
				<s:if test="freeShipFlug == 1"><div class="inliner"><small><b>Shipping</b></small></div><div class=inliner-right><small style="color: gray;">$9.00</small></div></s:if>
				<div class="inliner">
					<small style="color: gray;">
						<span id="taxQuestion">
							<img src="hatena.png">
							<span class="panel panel-default mini-overlay">
								<b>Estimated Tax</b><br><br>The sales tax listed on the checkout page is only an estimate. The final total sales tax will be reflected on your invoice and will include state and local sales taxes, as well as any applicable rebates or fees. In CA and RI sales tax is collected on the unbundled price of the iPhone.
							</span>
						</span><b>Estimated Tax</b>
					</small>
				</div>
					<div class=inliner-right>

						<small style="color: gray;">$
							<s:if test="freeShipFlug != 1"><script>var i= <%=(float)session.getAttribute("totalPrice2")*((float)session.getAttribute("tax")-1) %>; document.write(i.toFixed(2) );</script></s:if>
							<s:if test="freeShipFlug == 1"><script>var i= <%=((float)session.getAttribute("totalPrice2") + 9f)*((float)session.getAttribute("tax")-1) %>; document.write(i.toFixed(2) );</script></s:if>
						</small>
					</div>
					<p class="box"/></div>
				<div class=inliner-right>
					<h4>Order Total&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$
						<s:if test="freeShipFlug != 1">
							<script>var i= <%=(float)session.getAttribute("totalPrice2")*(float)session.getAttribute("tax") %>; document.write(i.toFixed(2) );</script>
						</s:if>
						<s:if test="freeShipFlug == 1">
							<script>var i= <%=((float)session.getAttribute("totalPrice2") + 9f)*(float)session.getAttribute("tax") %>; document.write(i.toFixed(2) );</script>
						</s:if>
						&nbsp;&nbsp;&nbsp;
					</h4>
				</div>
			</div>
			<s:if test="continueFlug == 3">
				<div class="inliner-right">
					<s:form action="PurchaseCompleteAction">
							<input type="hidden" name="shippingUserName" value="<s:property value='shippingUserName'/>">
							<input type="hidden" name="shippingCompanyName"  class="shippingCompanyName">
							<input type="hidden" name="shippingAddress1"  value="<s:property value='shippingAddress1'/>" >
							<input type="hidden" name="shippingAddress2  value="<s:property value='shippingAddress2'/>" >
							<input type="hidden" name="shippingUserCity"  value="<s:property value='shippingUserCity'/>" >
							<input type="hidden" name="shippingUserState"  value="<s:property value='shippingUserState'/>">
							<input type="hidden" name="shippingUserZIP"  value="<s:property value='shippingUserZIP'/>">
							<input type="hidden" name="shippingUserCountry"  value="<s:property value='shippingUserCountry'/>" >
							<input type="hidden" name="shippingUserPhone"  value="<s:property value='shippingUserPhone'/>">
							<input type="hidden" name="tax" value="<%=session.getAttribute("tax")%>">
							<input type="hidden" name="freeShipFlug" value="<s:property value='freeShipFlug'/>">
							<input type="hidden" name="cardType" value="<s:property value='cardType'/>">
							<input type="hidden" name="cardNumber" value="<s:property value='cardNumber'/>">
							<input type="hidden" name="nameOnCard" value="<s:property value='nameOnCard'/>">
							<input type="hidden" name="cardExpiryDate" value="<s:property value='cardExpiryDate'/>">
							<input type="hidden" name="cardCode" value="<s:property value='cardCode'/>">
						<button class="btn-primary btn-lg">PURCHASE!</button>
					</s:form>
					<br>
				</div>
			</s:if>

			<p class="box"/>
		</div>
	</div>
	<s:property value='freeShipFlug'/>










<jsp:include page="footer.jsp"/>