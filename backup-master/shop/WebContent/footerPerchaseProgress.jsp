</div>
</div>
<%@ taglib prefix="s" uri="/struts-tags" %>




<footer class="text-center" style="height: 180px;">



		<p>Copyright &#x00A9; 2017 Orange Inc. All rights reserved.</p>


</footer>


	<footer   data-spy="affix" data-offset-top="120" class="text-center perchase-progress-bar">
	<s:if test="pcType == 1 || pcType ==2">
		<ul class="list-inline">
	</s:if>
	<s:if test="pcType == 0">
		<ul style="list-style: none;">
	</s:if>
	<s:if test="pcType == 1">
		<li><img src="desktop.png"  height = "100"></li>
		<li><h4><strong><br>Desktop PC<br></strong>$<%=session.getAttribute("totalPrice1") %></h4></li>
	</s:if>
	<s:if test="pcType == 2">
		<li><img src="laptop.png"  height = "100"></li>
		<li><h4><strong><br>Desktop PC<br></strong>$<%=session.getAttribute("totalPrice1") %></h4></li>
	</s:if>
	<s:if test="pcType == 0">
		<li><h3 style="color: gray">You progress without purchase of our PC</h3></li>
		<li></li>
	</s:if>
		<li>

	<s:form action="PerchaseProgressAction" class="text-center">
		<input type="hidden" name="careCheck" id="careCheck" value="0">
		<input type="hidden" name="connector1Check" id="connector1Check" value="0">
		<input type="hidden" name="connector2Check" id="connector2Check" value="0">
		<input type="hidden" name="driveCheck" id="driveCheck" value="0">
		<input type="hidden" name="storageCheck" id="storageCheck" value="0">
		<input type="hidden" name="airportCheck" id="airportCheck" value="0">
		<input type="hidden" name="timeCapsuleCheck" id="timeCapsuleCheck" value="0">
		<input type="hidden" name="officeCheck" id="officeCheck" value="0">
		<input type="hidden" name="pcType" id="pcType" value="<%=session.getAttribute("pcType") %>">
		<input type="hidden" name="memoryForm" id="memoryForm" value="<%=session.getAttribute("memoryForm") %>">
		<input type="hidden" name="storageForm" id="storageForm" value="<%=session.getAttribute("storageForm") %>">
		<input type="hidden" name="mouseForm" id="mouseForm" value="<%=session.getAttribute("mouseForm") %>">
		<input type="hidden" name="fruitForm" id="fruitForm" value="<%=session.getAttribute("fruitForm") %>">
		<input type="hidden" name="flowerForm" id="flowerForm" value="<%=session.getAttribute("flowerForm") %>">
		<input type="hidden" name="totalPrice1" id="totalPrice1" value="<%=session.getAttribute("totalPrice1") %>">
		<input type="hidden" name="tax" id="tax" value=1>
		<button  value="perchase" class="btn-lg btn-primary ">Review Bag</button>
		</s:form>
	</li>
	</ul>
	</footer>


	<div id="test"></div>
</body>
