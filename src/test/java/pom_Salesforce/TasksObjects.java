package pom_Salesforce;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TasksObjects {
	@FindBy(xpath="//*[@data-id='Task']//a[@role='button']")
	WebElement taskdropDown;
	
	@FindBy(xpath="(//span[text()='New Task']/../..)[1]")
	WebElement newTask;
	
	@FindBy(xpath="//label[text()='Subject']/..//input")
	WebElement subject;
	
	@FindBy(xpath="//label[text()='Due Date']/..//input")
	WebElement duedate;
	
	@FindBy(xpath="//a[text()='Normal']")
	WebElement normal;
	
	@FindBy(xpath="//a[text()='Open']")
	WebElement open;
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement save;
	
public WebDriver wdriver;
	WebDriverWait wait;
	
	 public TasksObjects (WebDriver driver) {
			PageFactory.initElements(driver, this);
			wdriver=driver;

			wait = new WebDriverWait(driver, 15);
	 }
	 
	 public void Taskfun() throws InterruptedException {
		 waitForElementtoClickable(taskdropDown);

		 taskdropDown.click();
		 waitForElementtoClickable(newTask);

		 ((JavascriptExecutor) wdriver).executeScript("arguments[0].click();", newTask);
		 
		 
		 //newTask.click();
		 waitForelemtnToVisitToVisible(subject);
		 subject.sendKeys("Send Letter");
		 duedate.sendKeys("2/15/2022");
		 waitForElementtoClickable(save);
		 
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
