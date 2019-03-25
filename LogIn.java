package com.avactis.package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class LogIn {

	WebDriver driver;
	WebDriverWait wait;
	@Test
	public void signInMethod() throws InterruptedException {


		//Copy Paste from Register class
		//********** Its duplicate from Resgister
		//%%%%%%% Database can be used for multiple login
		driver.get("http://localhost/Avactis/");	

		// 
		WebElement signin;
		signin=driver.findElement(By.partialLinkText(("Sign In")));
		wait.until(ExpectedConditions.visibilityOf(signin));
		// click the sign in link once it is loaded
		driver.findElement(By.partialLinkText(("Sign In"))).click();
		// ********** Till here duplicate from Resgister

		//1. after going to sign in page, send email for sigining in
		driver.findElement(By.id("account_sign_in_form_email_id")).sendKeys("amale.jui@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("account_sign_in_form_passwd_id")).sendKeys("avactis1234");
		Thread.sleep(5000);

		//2. Clicking on the sign in button
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class='site-logo']")).click();



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
