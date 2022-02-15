package pom_Salesforce;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPageObjects  {
	

	
	@FindBy(id="username")
    WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;

	@FindBy(id="Login")
	WebElement Login;
	Properties p2;
	
	public LoginPageObjects (WebDriver driver) throws IOException
	{
		PageFactory.initElements(driver, this);
		 p2 = new Properties();
		 FileInputStream File = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\prop.properties");
		 p2.load(File);
	}


	 
	public void LoginAccount() {
		Username.sendKeys(p2.getProperty("username"));
		Password.sendKeys(p2.getProperty("password"));
		Login.click();
	}



}
