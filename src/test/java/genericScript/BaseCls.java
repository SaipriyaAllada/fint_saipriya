package genericScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseCls {
	public WebDriver driver;
	public Properties p1;
	public WebDriverWait wait;
	



		@BeforeTest
		@Parameters("browser")
		public void openBrowser(String browser) throws IOException  {
			
			System.out.println("before test");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
		
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe");
			 driver = new ChromeDriver(options);
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\geckodriver.exe");
			driver = new FirefoxDriver(options);
		}
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
	      p1 = new Properties();
	    
	      FileInputStream propfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\prop.properties");
		
			p1.load(propfile);
			driver.get(p1.getProperty("url"));

	}
		
	@AfterSuite
		public void test(){
			driver.close();
		}
		
		

		
		

}
