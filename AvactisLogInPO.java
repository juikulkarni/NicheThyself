	package com.avactis.package1;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.LoadableComponent;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class AvactisLogInPO extends LoadableComponent<AvactisLogInPO> {
	
		//--------------------------------
	
	
		@FindBy (partialLinkText = "Sign In")
		@CacheLookup
		private WebElement signinlinkonmainpage;
		//signin=driver.findElement(By.partialLinkText(("Sign In")));
		//-------------------
	
	
	
		//---------------------------	
		// Enter the emailid on Sign In page			
	
		@FindBy (id = "account_sign_in_form_email_id")
		@CacheLookup
		private WebElement emailid;
		//driver.findElement(By.id("account_sign_in_form_email_id"))
		//-------------------
	
	
		// Enter the password for Sign In	
		@FindBy (id = "account_sign_in_form_passwd_id")
		@CacheLookup
		private WebElement password;
		//driver.findElement(By.id("account_sign_in_form_passwd_id"))
		//-----------------------------------
	
		// Click on the sign in button	
		@FindBy (xpath = "//input[@value='Sign In']")
		@CacheLookup
		private WebElement signinsubmit;
		//driver.findElement(By.id("account_sign_in_form_passwd_id"))
		//-----------------------------------
	
	
		private WebDriver driver;
		private WebDriverWait wait;
	
		public AvactisLogInPO() {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\eCommerceSite\\src\\test\\resources\\geckodriver-64bit.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			PageFactory.initElements(driver, this);		
		}
	
		public AvactisLogInPO(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);		
		}
	
	
		public  void doLogin(String id, String pass) {
			//wait.until(ExpectedConditions.visibilityOf(signinlinkonmainpage));
			signinlinkonmainpage.click();
			//driver.findElement(By.partialLinkText(("Sign In"))).click();
			emailid.clear();
			emailid.sendKeys(id);
			password.sendKeys(pass);
			signinsubmit.click();
	
		}
		@Override
		protected void load() {
			driver.get("http://localhost/Avactis/");
	
		}
	
		@Override
		protected void isLoaded() throws Error {
	
			System.out.println(driver.getTitle());
			//assertTrue(driver.getTitle().equals(pageTitle));
	
	
	
		}
	
		public void closeBrowser() {
			driver.close();
		}
	
	
	
	}
