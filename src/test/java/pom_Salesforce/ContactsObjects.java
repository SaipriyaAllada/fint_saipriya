package pom_Salesforce;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactsObjects {
	
	
    @FindBy(xpath = "//*[@data-id='Contact']")
    WebElement Contact;
    
    @FindBy(xpath = "//div[@title='New']")
    WebElement New;
    
    @FindBy(xpath = "//button[@name='salutation']")
    WebElement None; 
    
    @FindBy(xpath = "//*[@data-value='Ms.']")
    WebElement selectdropdown; 
    
    
    @FindBy(xpath = "//input[@name='firstName']")
    WebElement Firstname;
    
    @FindBy(xpath = "//input[@name='lastName']")
    WebElement Lastname;
    
    @FindBy(xpath = "//label[text()='Account Name']/..//input")
    WebElement SearchAccounts; 
    
    @FindBy(xpath = "//*[@title='Samsung Corp']")
    WebElement dropdownSamsung;
    
    @FindBy(xpath = "//button[@name='SaveEdit']")
    WebElement Save;

	WebDriverWait wait;
    public  ContactsObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15);
		
	}
   
	
	public void contactfun() throws InterruptedException {
		waitForElementtoClickable(Contact);
    	Contact.click();
    	waitForElementtoClickable(New);
    	 New.click();
    	 waitForElementtoClickable(None);
    	 None.click();
    	 waitForElementtoClickable(selectdropdown);
    	 selectdropdown.click();
    	 waitForelemtnToVisitToVisible(Firstname);
    	 Firstname.sendKeys("priya");
    	 waitForelemtnToVisitToVisible(Lastname);
    	 Lastname.sendKeys("Allada");
    	 waitForelemtnToVisitToVisible(SearchAccounts);
    	 SearchAccounts.sendKeys("Samsung Cor");
    	 waitForElementtoClickable(dropdownSamsung); 
    	 dropdownSamsung.click();
    	 waitForElementtoClickable(Save);
    	 Save.click();
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
