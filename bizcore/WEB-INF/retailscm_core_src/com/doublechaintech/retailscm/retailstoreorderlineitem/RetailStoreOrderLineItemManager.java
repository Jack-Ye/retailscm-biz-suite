
package com.doublechaintech.retailscm.retailstoreorderlineitem;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.doublechaintech.retailscm.RetailscmUserContext;
import com.doublechaintech.retailscm.BaseEntity;
import com.doublechaintech.retailscm.SmartList;

public interface RetailStoreOrderLineItemManager{

		

	public RetailStoreOrderLineItem createRetailStoreOrderLineItem(RetailscmUserContext userContext, String bizOrderId, String skuId, String skuName, BigDecimal amount, int quantity, String unitOfMeasurement) throws Exception;	
	public RetailStoreOrderLineItem updateRetailStoreOrderLineItem(RetailscmUserContext userContext,String retailStoreOrderLineItemId, int retailStoreOrderLineItemVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public RetailStoreOrderLineItem loadRetailStoreOrderLineItem(RetailscmUserContext userContext, String retailStoreOrderLineItemId, String [] tokensExpr) throws Exception;
	public RetailStoreOrderLineItem internalSaveRetailStoreOrderLineItem(RetailscmUserContext userContext, RetailStoreOrderLineItem retailStoreOrderLineItem) throws Exception;
	public RetailStoreOrderLineItem internalSaveRetailStoreOrderLineItem(RetailscmUserContext userContext, RetailStoreOrderLineItem retailStoreOrderLineItem,Map<String,Object>option) throws Exception;
	
	public RetailStoreOrderLineItem transferToAnotherBizOrder(RetailscmUserContext userContext, String retailStoreOrderLineItemId, String anotherBizOrderId)  throws Exception;
 

	public void delete(RetailscmUserContext userContext, String retailStoreOrderLineItemId, int version) throws Exception;
	public int deleteAll(RetailscmUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(RetailscmUserContext userContext, RetailStoreOrderLineItem newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	



}


