package com.acitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModlue {
	@Test (priority=0,invocationCount=1)
	public void createdCustomer() {
		Assert.fail();
		Reporter.log("createCustomer",true);
	}
@Test(priority=0,dependsOnMethods="createCustomer")
 public void ModifyCustomer() {
	Reporter.log("modifyCustomer",true);
}
	@Test()
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}

