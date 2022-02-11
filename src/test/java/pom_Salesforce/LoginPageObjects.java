package pom_Salesforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	@FindBy(id="username")
    WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;

	@FindBy(id="Login")
	WebElement Login;

	public LoginPageObjects (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LoginAccount() {
		Username.sendKeys("alladasaipriya-yfwk@force.com");
		Password.sendKeys("s@7989971320");
		Login.click();
	}
}
