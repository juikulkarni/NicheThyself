package com.avactis.package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Register {

	WebDriver driver;
	WebDriverWait wait;
	@Test
	public void registorMethod() throws InterruptedException {

		//1. get URL

		driver.get("http://localhost/Avactis/");

		//2. explicit wait for sign in link on main page
		WebElement signin;
		signin=driver.findElement(By.partialLinkText(("Sign In")));
		wait.until(ExpectedConditions.visibilityOf(signin));



		//3. click the sign in link once it is loaded

		driver.findElement(By.partialLinkText(("Sign In"))).click();



		//4. explicit wait for register button n sign page

		WebElement registerbutton;
		registerbutton = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		wait.until(ExpectedConditions.visibilityOf(registerbutton));



		//5. click the register button for actual resgitration process to start
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(4000);



		// 6. actual filling up the resgitration form
		//6.a - Email
		driver.findElement(By.xpath("//input [@name='customer_info[Customer][Email]']")).sendKeys("amale.jui@gmail.com");;
		Thread.sleep(10000);

		//6.b Password
		driver.findElement(By.xpath("//input [@name='customer_info[Customer][Password]']")).sendKeys("avactis1234");;

		//6.c - ReType Password
		driver.findElement(By.xpath("//input [@name='customer_info[Customer][RePassword]']")).sendKeys("avactis1234");;


		//6.d - First Name
		driver.findElement(By.xpath("//input [@name='customer_info[Customer][FirstName]']")).sendKeys("Jui");;


		//6.e - First Name
		driver.findElement(By.xpath("//input [@name='customer_info[Customer][LastName]']")).sendKeys("Kulkarni");


		Thread.sleep(10000);

		//6.f - Dropdown for Country India ( Also few other options)

		Select selectCountry;
		selectCountry = new Select(driver.findElement(By.id("customer_info_Customer_Country")));
		
		selectCountry.selectByIndex(3);
		Thread.sleep(3000);
		selectCountry.selectByValue("39");
		Thread.sleep(3000);
		selectCountry.selectByVisibleText("India");
		Thread.sleep(3000);



		//6.g - Dropdwon for State Maharasthra ( Also trying some other options)

		Select selectState;
		selectState = new Select(driver.findElement(By.id("customer_info_Customer_State")));
		
		selectState.selectByIndex(3);
		Thread.sleep(3000);
		
		selectState.selectByValue("636");
		Thread.sleep(3000);
		selectState.selectByVisibleText("Maharashtra");
		Thread.sleep(3000);

		//6.h - First Name
		driver.findElement(By.xpath("//input [@name='customer_info[Customer][ZipCode]']")).sendKeys("411057");


		//6.h - Address Line 1
		driver.findElement(By.xpath("//input [@name='customer_info[Customer][Streetline1]']")).sendKeys("F 602");

		
		//6.h - Address Line 2
		driver.findElement(By.xpath("//input [@name='customer_info[Customer][Streetline2]']")).sendKeys("Wakad");
		

		//6.h - Address Line 2
		driver.findElement(By.xpath("//input [@name='customer_info[Customer][Phone]']")).sendKeys("8380087586");

		
		// Click on Resgister Button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(10000);
		

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
