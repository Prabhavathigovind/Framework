package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	WebDriver driver =null;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		 prop = new Properties();
		
		FileInputStream fi = new FileInputStream("C:\\Users\\pc\\eclipse-workspace-new\\Framework\\src\\main\\java\\Resources\\data.properties");
		prop.load(fi);
		
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
				{
			driver=new FirefoxDriver();
				}
		else if(browser.equalsIgnoreCase("IE"))
				{
			driver=new InternetExplorerDriver();
				}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
	}

}
