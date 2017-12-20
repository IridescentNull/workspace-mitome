</div>
</div>
<%@ taglib prefix="s" uri="/struts-tags" %>




<footer class="text-center" style="height: 180px;">



		<p>Copyright &#x00A9; 2017 Orange Inc. All rights reserved.</p>


</footer>
<footer class="text-center perchase">

		<ul class="list-inline perchase-bottom">
			<li>Get help buying:<br> Chat now<br>Call 7-8xx-MY-ORange<br>&nbsp;</li>
			<li></li>
			<li>Pickup:<br>Check availability<br>&nbsp;<br>&nbsp;</li>
			<li></li>
			<li>Delivery:<br>In Stock<br>Free Shipping<br>Get delivery dates</li>
			<li></li>
			<li>
				<h3 style="color: gray;">$ <span id="priceTelling"><script>var i= price; document.write(i.toFixed(2) );
				</script></span></h3><div style='line-height: 1;'><br></div>
				<s:form action="PerchaseAction" class="text-center">

					<input type="hidden" name="memoryForm" id="memoryForm" value="0">
					<input type="hidden" name="storageForm" id="storageForm" value="0">
					<input type="hidden" name="mouseForm" id="mouseForm" value="0">
					<input type="hidden" name="fruitForm" id="fruitForm" value="0">
					<input type="hidden" name="flowerForm" id="flowerForm" value="0">
					<input type="hidden" name="pcType" value=<s:property value="pcType"/>>
					<button  value="perchase" class="btn-sm btn-primary ">PURCHASE</button>
				</s:form>
			</li>
		</ul>


</footer>


	<div id="test"></div>
</body>
