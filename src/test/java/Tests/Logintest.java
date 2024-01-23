package Tests;

import java.io.IOException;

import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageobjects.Accountpage;
import pageobjects.Landingpage;
import pageobjects.loginpage;

public class Logintest extends Base{
	
	WebDriver driver;
	@Test(dataProvider = "getlogindata")
	public void login(String email, String password , String expected) throws IOException, InterruptedException {
		
		 driver =  initializeDriver();
		driver.get(prop.getProperty("url"));
		
		Landingpage landingpage = new Landingpage(driver);
		
landingpage.myaccountdropdown().click();	
landingpage.login().click();

Thread.sleep(1000);

loginpage lp=new loginpage(driver);
lp.email().sendKeys(email);
lp.password().sendKeys(password);
lp.login().click();

Accountpage ap = new Accountpage(driver);
Assert.assertTrue(ap.accountinformation().isDisplayed());
	
	}

	public void closure()
	{
		driver.quit();
	}
	@DataProvider
	public Object[][] getlogindata()
	{
		Object[][] data = {{"arun.selenium@gmail.com","Second@123","success"},{"dummy@gmail.com","dummmy@123","failure"}};
		return data ;
	}
	}

