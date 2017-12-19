<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<jsp:include page="header.jsp"/>
	<div class="background-gray"></div>
	<div class="panel panel-default">
		<div class="panel-body" style="box-shadow: 1px 1px 5px #c0c0c0;">
			☆ Use ORange Pay between 12/1 - 12/7 and a donation will be made to (RED).
		</div>
	</div>
	<div class="panel panel-default">
		<div class="panel-body" style="box-shadow: 1px 1px 5px #c0c0c0;">
			<h3>Items in Your Bag</h3>

			<s:if test='pcType == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="desktop.gif" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>Desktop PC</strong></div><div class="inliner-right"><strong>$<%=session.getAttribute("totalPrice1") %></strong></div>
					<div style="line-height: 0.5;"><br></div>
					<p class="box"/>
					<div class="inliner"><small>Delivery: In Stock</small></div>
					<div class=inliner-right>
						<form action="DesktopRemoveAction">
							<input type="hidden" name="memoryForm" value="<%=session.getAttribute("memoryForm") %>">
							<input type="hidden" name="storageForm" value="<%=session.getAttribute("storageForm") %>">
							<input type="hidden" name="mouseForm" value="<%=session.getAttribute("mouseForm") %>">
							<input type="hidden" name="fruitForm" value="<%=session.getAttribute("fruitForm") %>">
							<input type="hidden" name="flowerForm" value="<%=session.getAttribute("flowerForm") %>">
							<input type="hidden" name="pcType" value="0">
							<input type="hidden" name="totalPrice1" value=0>
							<input type="hidden" name="careCheck" value="<%=session.getAttribute("careCheck") %>">
							<input type="hidden" name="connector1Check" value="<%=session.getAttribute("connector1Check") %>">
							<input type="hidden" name="connector2Check" value="<%=session.getAttribute("connector2Check") %>">
							<input type="hidden" name="driveCheck" value="<%=session.getAttribute("driveCheck") %>">
							<input type="hidden" name="storageCheck" value="<%=session.getAttribute("storageCheck") %>">
							<input type="hidden" name="airportCheck" value="<%=session.getAttribute("airportCheck") %>">
							<input type="hidden" name="timeCapsuleCheck" value="<%=session.getAttribute("timeCapsuleCheck") %>">
							<input type="hidden" name="officeCheck" value="<%=session.getAttribute("officeCheck") %>">
							<input type="hidden" name="tax" value="<%=session.getAttribute("tax")%>">
 							<button class="btn-link"><small>Remove</small></button>
						</form>
					</div>
					<div class=inliner-right><small style="color: lightgray;">Part number: XXXXXXXXX</small></div>
					<div class="row">
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
						<div class="col-xs-6">
						</div>
					</div>
				</div>
			</div>
			</s:if>

			<s:if test='careCheck == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="Cure.jpg" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>ORgangeCare+ for PC</strong></div><div class="inliner-right"><strong>$169.00</strong></div>
					<div style="line-height: 0.5;"><br></div>
					<p class="box"/>
					<div class="inliner"><small>Delivery: In Stock</small></div>
					<div class=inliner-right>
						<form action="DesktopRemoveAction">
							<input type="hidden" name="memoryForm" value="<%=session.getAttribute("memoryForm") %>">
							<input type="hidden" name="storageForm" value="<%=session.getAttribute("storageForm") %>">
							<input type="hidden" name="mouseForm" value="<%=session.getAttribute("mouseForm") %>">
							<input type="hidden" name="fruitForm" value="<%=session.getAttribute("fruitForm") %>">
							<input type="hidden" name="flowerForm" value="<%=session.getAttribute("flowerForm") %>">
							<input type="hidden" name="pcType" value="<%=session.getAttribute("pcType") %>">
							<input type="hidden" name="totalPrice1" value="<%=session.getAttribute("totalPrice1") %>">
							<input type="hidden" name="careCheck" value=0>
							<input type="hidden" name="connector1Check" value="<%=session.getAttribute("connector1Check") %>">
							<input type="hidden" name="connector2Check" value="<%=session.getAttribute("connector2Check") %>">
							<input type="hidden" name="driveCheck" value="<%=session.getAttribute("driveCheck") %>">
							<input type="hidden" name="storageCheck" value="<%=session.getAttribute("storageCheck") %>">
							<input type="hidden" name="airportCheck" value="<%=session.getAttribute("airportCheck") %>">
							<input type="hidden" name="timeCapsuleCheck" value="<%=session.getAttribute("timeCapsuleCheck") %>">
							<input type="hidden" name="officeCheck" value="<%=session.getAttribute("officeCheck") %>">
							<input type="hidden" name="tax" value="<%=session.getAttribute("tax")%>">
							<button class="btn-link"><small>Remove</small></button>
						</form>
					</div>
					<div class=inliner-right><small style="color: lightgray;">Part number: XXXXXXXXX</small></div>
					<br>
				</div>
			</div>
			</s:if>
			<s:if test='connector1Check == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="connector.jpg" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>Thunderbolt 3 (USB‑C) to Thunderbolt 2 Adapter</strong></div><div class="inliner-right"><strong>$49.00</strong></div>
					<div style="line-height: 0.5;"><br></div>
					<p class="box"/>
					<div class="inliner"><small>Delivery: In Stock</small></div>
					<div class=inliner-right>
						<form action="DesktopRemoveAction">
							<input type="hidden" name="memoryForm" value="<%=session.getAttribute("memoryForm") %>">
							<input type="hidden" name="storageForm" value="<%=session.getAttribute("storageForm") %>">
							<input type="hidden" name="mouseForm" value="<%=session.getAttribute("mouseForm") %>">
							<input type="hidden" name="fruitForm" value="<%=session.getAttribute("fruitForm") %>">
							<input type="hidden" name="flowerForm" value="<%=session.getAttribute("flowerForm") %>">
							<input type="hidden" name="pcType" value="<%=session.getAttribute("pcType") %>">
							<input type="hidden" name="totalPrice1" value="<%=session.getAttribute("totalPrice1") %>">
							<input type="hidden" name="careCheck" value="<%=session.getAttribute("careCheck") %>">
							<input type="hidden" name="connector1Check" value=0>
							<input type="hidden" name="connector2Check" value="<%=session.getAttribute("connector2Check") %>">
							<input type="hidden" name="driveCheck" value="<%=session.getAttribute("driveCheck") %>">
							<input type="hidden" name="storageCheck" value="<%=session.getAttribute("storageCheck") %>">
							<input type="hidden" name="airportCheck" value="<%=session.getAttribute("airportCheck") %>">
							<input type="hidden" name="timeCapsuleCheck" value="<%=session.getAttribute("timeCapsuleCheck") %>">
							<input type="hidden" name="officeCheck" value="<%=session.getAttribute("officeCheck") %>">
							<input type="hidden" name="tax" value="<%=session.getAttribute("tax")%>">
							<button class="btn-link"><small>Remove</small></button>
						</form>
					</div>
					<div class=inliner-right><small style="color: lightgray;">Part number: XXXXXXXXX</small></div>
					<br>
				</div>
			</div>
			</s:if>
			<s:if test='connector2Check == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="connector2.jpg" width ="50px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>USB-C Digital AV Multiport Adapter</strong></div><div class="inliner-right"><strong>$69.00</strong></div>
					<div style="line-height: 0.5;"><br></div>
					<p class="box"/>
					<div class="inliner"><small>Delivery: In Stock</small></div>
					<div class=inliner-right>
						<form action="DesktopRemoveAction">
							<input type="hidden" name="memoryForm" value="<%=session.getAttribute("memoryForm") %>">
							<input type="hidden" name="storageForm" value="<%=session.getAttribute("storageForm") %>">
							<input type="hidden" name="mouseForm" value="<%=session.getAttribute("mouseForm") %>">
							<input type="hidden" name="fruitForm" value="<%=session.getAttribute("fruitForm") %>">
							<input type="hidden" name="flowerForm" value="<%=session.getAttribute("flowerForm") %>">
							<input type="hidden" name="pcType" value="<%=session.getAttribute("pcType") %>">
							<input type="hidden" name="totalPrice1" value="<%=session.getAttribute("totalPrice1") %>">
							<input type="hidden" name="careCheck" value="<%=session.getAttribute("careCheck") %>">
							<input type="hidden" name="connector1Check" value="<%=session.getAttribute("connector1Check") %>">
							<input type="hidden" name="connector2Check" value=0>
							<input type="hidden" name="driveCheck" value="<%=session.getAttribute("driveCheck") %>">
							<input type="hidden" name="storageCheck" value="<%=session.getAttribute("storageCheck") %>">
							<input type="hidden" name="airportCheck" value="<%=session.getAttribute("airportCheck") %>">
							<input type="hidden" name="timeCapsuleCheck" value="<%=session.getAttribute("timeCapsuleCheck") %>">
							<input type="hidden" name="officeCheck" value="<%=session.getAttribute("officeCheck") %>">
							<input type="hidden" name="tax" value="<%=session.getAttribute("tax")%>">
							<button class="btn-link"><small>Remove</small></button>
						</form>
					</div>
					<div class=inliner-right><small style="color: lightgray;">Part number: XXXXXXXXX</small></div>
					<br>
				</div>
			</div>
			</s:if>
			<s:if test='driveCheck == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="diskDrive.jpg" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>Apple USB SuperDrive</strong></div><div class="inliner-right"><strong>$79.00</strong></div>
					<div style="line-height: 0.5;"><br></div>
					<p class="box"/>
					<div class="inliner"><small>Delivery: In Stock</small></div>
					<div class=inliner-right>
						<form action="DesktopRemoveAction">
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
							<input type="hidden" name="driveCheck" value=0>
							<input type="hidden" name="storageCheck" value="<%=session.getAttribute("storageCheck") %>">
							<input type="hidden" name="airportCheck" value="<%=session.getAttribute("airportCheck") %>">
							<input type="hidden" name="timeCapsuleCheck" value="<%=session.getAttribute("timeCapsuleCheck") %>">
							<input type="hidden" name="officeCheck" value="<%=session.getAttribute("officeCheck") %>">
							<input type="hidden" name="tax" value="<%=session.getAttribute("tax")%>">
							<button class="btn-link"><small>Remove</small></button>
						</form>
					</div>
					<div class=inliner-right><small style="color: lightgray;">Part number: XXXXXXXXX</small></div>
					<br>
				</div>
			</div>
			</s:if>
			<s:if test='storageCheck == 1'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center"">
					<img src="mikan10.png" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>PROMISE Pegasus3 R4 12TB (4 by 3TB) RAID Storage</strong></div><div class="inliner-right"><strong>$1,499.00</strong></div>
					<div style="line-height: 0.5;"><br></div>
					<p class="box"/>
					<div class="inliner"><small>Delivery: In Stock</small></div>
					<div class=inliner-right>
						<form action="DesktopRemoveAction">
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
							<input type="hidden" name="storageCheck" value=0>
							<input type="hidden" name="airportCheck" value="<%=session.getAttribute("airportCheck") %>">
							<input type="hidden" name="timeCapsuleCheck" value="<%=session.getAttribute("timeCapsuleCheck") %>">
							<input type="hidden" name="officeCheck" value="<%=session.getAttribute("officeCheck") %>">
							<input type="hidden" name="tax" value="<%=session.getAttribute("tax")%>">
							<button class="btn-link"><small>Remove</small></button>
						</form>
					</div>
					<div class=inliner-right><small style="color: lightgray;">Part number: XXXXXXXXX</small></div>
					<br>
				</div>
			</div>
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
					<p class="box"/>
					<div class="inliner"><small>Delivery: In Stock</small></div>
					<div class=inliner-right>
						<form action="DesktopRemoveAction">
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
							<input type="hidden" name="airportCheck" value=0>
							<input type="hidden" name="timeCapsuleCheck" value="<%=session.getAttribute("timeCapsuleCheck") %>">
							<input type="hidden" name="officeCheck" value="<%=session.getAttribute("officeCheck") %>"><button class="btn-link">
							<input type="hidden" name="tax" value="<%=session.getAttribute("tax")%>">
							<small>Remove</small></button>
						</form>
					</div>
					<div class=inliner-right><small style="color: lightgray;">Part number: XXXXXXXXX</small></div>
					<br>
				</div>
			</div>
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
					<p class="box"/>
					<div class="inliner"><small>Delivery: In Stock</small></div>
					<div class=inliner-right>
						<form action="DesktopRemoveAction">
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
							<input type="hidden" name="airportCheck" value=<%=session.getAttribute("airportCheck") %>>
							<input type="hidden" name="timeCapsuleCheck" value=0>
							<input type="hidden" name="officeCheck" value="<%=session.getAttribute("officeCheck") %>">
							<input type="hidden" name="tax" value="<%=session.getAttribute("tax")%>">
							<s:if test="tax == 1"><input type="hidden" name="tax" value=1></s:if>
							<button class="btn-link"><small>Remove</small></button>
						</form>
					</div>
					<div class=inliner-right><small style="color: lightgray;">Part number: XXXXXXXXX</small></div>
					<br>
				</div>
			</div>
			</s:if>
			<s:if test='officeCheck == 1 || officeCheck == 2 || officeCheck == 3 || officeCheck == 4'>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-3 text-center">
					<img src="office.jpg" width ="100px">
				</div>
				<div class="col-xs-9">
					<div class="inliner"><strong>Microsoft Office <s:if test='officeCheck == 1'>365 Home (1-year Subscription; 5 Licenses)</s:if><s:if test='officeCheck== 2'>365 Personal (1-year Subscription; 1 License)</s:if><s:if test='officeCheck== 3'>Home & Student 2016 for Mac</s:if><s:if test='officeCheck== 4'>Home & Business 2016 for Mac</s:if></strong></div><div class="inliner-right"><strong><s:if test='officeCheck == 1'>$99.95</s:if><s:if test='officeCheck == 2'>$69.95</s:if><s:if test='officeCheck == 3'>$149.95</s:if><s:if test='officeCheck == 4'>$229.95</s:if></strong></div>
					<div style="line-height: 0.5;"><br></div>
					<p class="box"/>
					<div class="inliner"><small>Delivery: In Stock</small></div>
						<div class=inliner-right><form action="DesktopRemoveAction">
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
							<input type="hidden" name="airportCheck" value=<%=session.getAttribute("airportCheck") %>>
							<input type="hidden" name="timeCapsuleCheck" value="<%=session.getAttribute("timeCapsuleCheck") %>">
							<input type="hidden" name="officeCheck" value=0>
							<input type="hidden" name="tax" value="<%=session.getAttribute("tax")%>">
							<button class="btn-link"><small>Remove</small></button>
						</form>
					</div>
					<div class=inliner-right><small style="color: lightgray;">Part number: XXXXXXXXX</small></div>
					<br>
				</div>
			</div>
			</s:if>
			<p class="box"/>
			<div class="row">
				<div class="col-xs-4 col-xs-offset-8">
					<div class="inliner"><small style="color: gray;">Bag Subtotal</small></div><div class=inliner-right><small style="color: gray;">$<%=session.getAttribute("totalPrice2") %></small></div>
					<div class="inliner"><small style="color: green;"><b>Free Shiping</b></small></div><div class=inliner-right><small style="color: gray;">$0.00</small></div>
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
						<s:if test='tax == 1 || tax == 0'>
							<s:form action="TaxCalculate">
								<small>
									<button class="btn-link">Calculate</button>
								</small>
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
								<input type="hidden" name="airportCheck" value=<%=session.getAttribute("airportCheck") %>>
								<input type="hidden" name="timeCapsuleCheck" value="<%=session.getAttribute("timeCapsuleCheck") %>">
								<input type="hidden" name="officeCheck" value="<%=session.getAttribute("officeCheck") %>">
								<input type="hidden" name="tax" value="<%=session.getAttribute("tax")%>">
							</s:form>
						</s:if>
						<s:if test='tax != 0 && tax != 1'>
							<small style="color: gray;">$
								<script>var i= <%=(float)session.getAttribute("totalPrice2")*((float)session.getAttribute("tax")-1) %>; document.write(i.toFixed(2) );</script>
							</small>
						</s:if>
					</div>
					<p class="box"/>
				</div>
				<div class=inliner-right><h4>Total&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<script>var i= <%=(float)session.getAttribute("totalPrice2")*(float)session.getAttribute("tax") %>; document.write(i.toFixed(2) );</script>&nbsp;&nbsp;&nbsp;</h4></div>
			</div>
			<p class="box"/>
			<div class=inliner-right>
				<s:form action="BagAction">
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
					<s:if test="tax == null || tax == 0 || tax == 1"><button class="btn btn-lg btn-primary" disabled="disabled">Check Out</button></s:if>
					<s:if test='tax != 0 && tax != 1'><button class="btn-lg btn-primary">Check Out</button></s:if>
				</s:form>
		</div>
	</div>

<jsp:include page="footer.jsp"/>