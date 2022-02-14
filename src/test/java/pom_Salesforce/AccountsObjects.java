package pom_Salesforce;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AccountsObjects {
	
	@FindBy(xpath = "//*[@data-id='Account']")
	WebElement Account;

	@FindBy(xpath = "//span[contains(@class,'toastMessage')]")
	WebElement SuccessMessage;
	
	@FindBy(xpath = "//div[@title='New']")
	WebElement New;
	
	
	@FindBy(xpath = "//span[text()='Account Name']/ancestor::label/..//input")
	WebElement AccountName;
	
	
	@FindBy(xpath = "(//li[@role='presentation'])[3]")
	WebElement Sam;
	
	
	@FindBy(xpath="(//span[text()='Save'])[2]")
	WebElement save;
	WebDriverWait wait; 
	WebDriver wdriver;
	
	public AccountsObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new 	WebDriverWait(driver,15);
		wdriver=driver;
		
	}
	
	public void Accountfun() {
		waitForElementToClickable(Account);
		Account.click();
		waitForElementToClickable(New);
		New.click();
		waitForElementToVisibleToVisit(AccountName);
		AccountName.sendKeys("Samsung Corp");
		waitForElementToVisibleToVisit(AccountName);
		AccountName.sendKeys(Keys.BACK_SPACE);
		waitForElementToClickable(Sam);
		((JavascriptExecutor)wdriver).executeScript("arguments[0].click();", Sam);
		//Sam.click();
		waitForElementToClickable(save);
		save.click();
	    
		
	}
	
     public void waitForElementToClickable(WebElement element) {
		 
		 wait.until(ExpectedConditions.elementToBeClickable(element));
		 
	 }
	 
	 public void waitForElementToVisibleToVisit(WebElement element) {
		 
		 wait.until(ExpectedConditions.visibilityOf(element));
	 }
	
}		 
		
	
	


