package com.avactis.package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Purchase {
	WebDriver driver;
	WebDriverWait wait;
  @Test
  public void purchaseMethodasRegUser() throws InterruptedException {
	  LogIn LoginObject = new LogIn();
	  this.driver=driver;
	  
	  LoginObject.signInMethod();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\eCommerceSite\\src\\test\\resources\\geckodriver-64bit.exe");
		driver = new FirefoxDriver();
		wait = new WebDriverWait (driver, 30);

  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
