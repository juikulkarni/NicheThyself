package com.avactis.package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PurchaseTest {
	
	AvactisLogInPO myLoginPO;
  @Test
  public void f() {
	  
	  myLoginPO.doLogin("amale.jui@gmail.com", "avactis1234");
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  myLoginPO = new AvactisLogInPO();		 
		myLoginPO.load();
  }

  @AfterMethod
  public void afterMethod() {
  }

}




