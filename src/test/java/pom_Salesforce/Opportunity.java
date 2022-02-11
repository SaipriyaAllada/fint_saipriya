package pom_Salesforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Opportunity {
	 @FindBy(xpath = "//*[@data-id='Opportunity']")
	  WebElement opp;
	 
	 @FindBy(xpath = "//div[@title='New']")
	 WebElement New;
	 
	@FindBy(xpath = "//input[@name='Name']")
	  WebElement Name;
	 
	 @FindBy(xpath = "//label[text()='Account Name']/..//input")
	  WebElement SearchAccounts;
	 
	 @FindBy(xpath = "//strong[text()='Samsung']/..")
	    WebElement dropdownSamsung;
	 
	 @FindBy(xpath = "//input[@name='CloseDate']")
	  WebElement closedate;
	 
	 @FindBy(xpath = "//label[text()='Stage']/..//input")
	  WebElement stage;
	 
	 @FindBy(xpath = "//span[@title='Qualification']/../..")
	  WebElement dropdownstage;
	 
	 @FindBy(xpath = "//button[@name='SaveEdit']")
	  WebElement save;
	WebDriverWait wait;
	 public Opportunity (WebDriver driver) {
			PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,15);
		}
	   
		
	 
	 
	 public void  Opportunityfun() throws InterruptedException {
		 waitForElementtoClickable(opp);
		 opp.click();
		 waitForElementtoClickable(New);
		 New.click();
		 waitForelemtnToVisitToVisible(Name);
		 Name.sendKeys("sales");
		 waitForelemtnToVisitToVisible(SearchAccounts);
		 SearchAccounts.sendKeys("Samsung Corp");
		 waitForElementtoClickable(dropdownSamsung);
		 dropdownSamsung.click();
		 waitForelemtnToVisitToVisible(closedate);
		 closedate.sendKeys("2/5/2022");
		 stage.click();
		 dropdownstage.click();
		 save.click();
		 
		 
		 
		 
	 }
	 
	 public void waitForElementtoClickable(WebElement element)
		{

			wait.until(ExpectedConditions.elementToBeClickable(element));
			
		}
	 
	 public void waitForelemtnToVisitToVisible(WebElement element)
	 {
		 wait.until(ExpectedConditions.visibilityOf(element));
	 }
	
	 
	 
} 
	 

	 
	 

	 
	 
	 
	 
	 
	    
	 
	 
	 
			


