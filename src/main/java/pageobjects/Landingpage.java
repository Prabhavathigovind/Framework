package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
	
	WebDriver driver;
	
	public Landingpage (WebDriver driver )
	{
		this.driver = driver ;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@title='My Account']")
	WebElement myaccountdropdown;
	@FindBy(linkText = "Login")
	WebElement login;


	public WebElement myaccountdropdown() {
		// TODO Auto-generated method stub
		return myaccountdropdown;
	}
	
	public WebElement login()
	{
		return login;
	}
			

}
