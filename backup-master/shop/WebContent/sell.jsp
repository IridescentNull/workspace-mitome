<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="headerAdministratorsScreen.jsp"/>
	<table class="table table-striped">
		<s:iterator value="buyHistoryDTOList">
			<tr>
				<td>
					<div class="row">
						<div class="col-sm-2 text-center">
							<s:if test="itemTransactionId == 1">
								<img src="desktop.gif" width ="100px">
							</s:if>
							<s:if test="itemTransactionId == 2">
								<img src="laptop.png" width ="100px">
							</s:if>
							<s:if test="itemTransactionId == 3">
								<img src="Cure.jpg" width ="100px">
							</s:if>
							<s:if test="itemTransactionId == 4">
								<img src="connector.jpg"  width ="100px">
							</s:if>
							<s:if test="itemTransactionId == 5">
								<img src="connector2.jpg"  width ="50px">
							</s:if>
							<s:if test="itemTransactionId == 6">
								<img src="diskDrive.jpg"  width ="100px">
							</s:if>
							<s:if test="itemTransactionId == 7">
								<img src="mikan10.png"  width ="100px">
							</s:if>
							<s:if test="itemTransactionId == 8">
								<img src="kuukou.png"  width ="100px">
							</s:if>
							<s:if test="itemTransactionId == 9">
								<img src="timeCapsule.jpg"  width ="100px">
							</s:if>
							<s:if test="itemTransactionId == 10">
								<img src="office.jpg"width ="100px">
							</s:if>
						</div>
						<div class="col-sm-4">
							<s:if test="itemTransactionId == 1">
								<h5><strong>Desktop PC / <s:property value="id"/></strong></h5>
							</s:if>
							<s:if test="itemTransactionId == 2">
								<h5><strong>Laptop / <s:property value="id"/></strong></h5>
							</s:if>
							<s:if test="itemTransactionId == 3">
								<h6><strong>ORgangeCare+ for above PC / <s:property value="id"/></strong></h6>
							</s:if>
							<s:if test="itemTransactionId == 4">
								<h6><strong>Thunderbolt 3 (USB‑C) to Thunderbolt 2 Adapter / <s:property value="id"/></strong></h6>
							</s:if>
							<s:if test="itemTransactionId == 5">
								<h6><strong>USB-C Digital AV Multiport Adapter / <s:property value="id"/></strong></h6>
							</s:if>
							<s:if test="itemTransactionId == 6">
								<h6><strong>Apple USB SuperDrive / <s:property value="id"/></strong></h6>
							</s:if>
							<s:if test="itemTransactionId == 7">
								<h6><strong>PROMISE Pegasus3 R4 12TB (4 by 3TB) RAID Storage / <s:property value="id"/></strong></h6>
							</s:if>
							<s:if test="itemTransactionId == 8">
								<h6><strong>AirPort <s:if test='accessoriesType == 1'>Express</s:if><s:if test='accessoriesType == 2'>Extreme</s:if> / <s:property value="id"/></strong></h6>
							</s:if>
							<s:if test="itemTransactionId == 9">
								<h6><strong>AirPort Time Capsule <s:if test='accessoriesType == 1'>- 2TB</s:if><s:if test='accessoriesType == 2'>- 3TB</s:if> / <s:property value="id"/></strong></h6>
							</s:if>
							<s:if test="itemTransactionId == 10">
								<h6><strong>Microsoft Office <s:if test='accessoriesType == 1'>365 Home (1-year Subscription; 5 Licenses)</s:if><s:if test='accessoriesType== 2'>365 Personal (1-year Subscription; 1 License)</s:if><s:if test='accessoriesType== 3'>Home & Student 2016 for Mac</s:if><s:if test='accessoriesType== 4'>Home & Business 2016 for Mac</s:if> / <s:property value="id"/></strong></h6>
							</s:if>

								<h5><strong><s:property value="loginUserIdShadow"/></strong></h5>
								<h6>
									$<s:property value="totalPrice3"/>/
									<s:if test="deliver == 0 && itemTransactionId != 3">
										Normal Shipping /<br>
									</s:if>
									<s:if test="deliver == 1 && itemTransactionId != 3">
										Same Day Shipping /<br>
									</s:if>
									<s:if test="deliver == 2 && itemTransactionId != 3">
										Pick Up /<br>
									</s:if>
									<s:property value="insertDate"/>
								</h6>

						</div>
						<div class="col-sm-5" style="color: gray;">
						<s:if test="itemTransactionId == 1 || itemTransactionId == 2">
							<h6>
								<s:if test='memoryForm == 0'>8GB 2133MHz DDR4 <br></s:if>
								<s:if test='memoryForm == 1'>16GB 2133MHz DDR4 <br></s:if>
								<s:if test='memoryForm == 2'>32GB 2133MHz DDR4 <br></s:if>
								<s:if test='storageForm == 0'>1TB Cereal Food ATA Drive <br></s:if>
								<s:if test='storageForm == 1'>2TB Cereal Food ATA Drive <br></s:if>
								<s:if test='storageForm == 2'>256GB SSD <br></s:if>
								<s:if test='storageForm == 3'>512GB SSD <br></s:if>
								<s:if test='storageForm == 4'>1TB SSD <br></s:if>
								<s:if test="itemTransactionId == 1">
										<s:if test='mouseForm == 0'>Magic Mouse 2 <br></s:if>
										<s:if test='mouseForm == 1'>Magic Trackpad 2 <br></s:if>
										<s:if test='mouseForm == 2'>Magic Mouse 2 + Trackpad 2 <br></s:if>
								</s:if>
								<s:if test="fruitForm == 1">Fruits Cut Pro X<br></s:if>
								<s:if test="flowerForm == 1">Flower Petal X<br></s:if>
							</h6>
						</s:if>

						</div>
						<div class="col-sm-1">
						<s:form action="BuyHistoryRemoveAction">
							<input type="hidden" name="id" value="<s:property value='id'/>">
							<button class="btn-default buy-history-button" >delete</button>
						</s:form>
						</div>
					</div>
				</td>
			</tr>
		</s:iterator>

	</table>

<jsp:include page="footerAdministrators.jsp"/>