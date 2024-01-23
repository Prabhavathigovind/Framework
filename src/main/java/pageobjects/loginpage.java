package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver driver;
	
	public loginpage(WebDriver driver)
	
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement login;
	
	
	
	public WebElement email()
	{
		return email;
	}
	public WebElement password()
	{
		return password;
	}
	
	public WebElement login()
	{
		return login;
	}

	
	
}
