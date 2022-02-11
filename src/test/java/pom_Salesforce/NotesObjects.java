package pom_Salesforce;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotesObjects {

	@FindBy(xpath="//*[@data-id='ContentNote']")
	WebElement Note;
	
	@FindBy(xpath="//div[@title='New']")
	WebElement New;
	
	@FindBy(xpath="//input[@class='inputText notesTitle flexInput input']")
	WebElement title;
	
	@FindBy(xpath="//div[@data-placeholder='Enter a note...']")
	WebElement enternote;
	
	@FindBy(xpath="//span[contains(text(),'Add to Records')]")
	WebElement Add;
	
	@FindBy(xpath="(//span[text()='Done'])[2]")
	WebElement done;
	
	public WebDriver wdriver;
	WebDriverWait wait; 
	
	 public NotesObjects (WebDriver driver) {
			PageFactory.initElements(driver, this);
			wdriver = driver;
			wait = new 	WebDriverWait(driver,15);
			
		}
	 
	 public void note() throws InterruptedException {
		 waitForElementToClickable(Note);
		 Note.click();
		 
		 waitForElementToClickable(New);
		 New.click();
		 
		 title.sendKeys(Keys.ENTER);
		 waitForElementToVisibleToVisit(title);
		 title.sendKeys("Test note header ");
		 
		 waitForElementToVisibleToVisit(enternote);
		 enternote.sendKeys("This is test note title");
		 
		 waitForElementToClickable(Add);
		 JavascriptExecutor js = (JavascriptExecutor)wdriver;
		 js.executeScript("arguments[0].scrollIntoView(true);", Add);
		 Add.click();
		 
		 waitForElementToClickable(done);
		 done.click();
		 
		 
	 }
	 public void waitForElementToClickable(WebElement element) {
		 
		 wait.until(ExpectedConditions.elementToBeClickable(element));
		 
	 }
	 
	 public void waitForElementToVisibleToVisit(WebElement element) {
		 
		 wait.until(ExpectedConditions.visibilityOf(element));
	 }
	
	

}
