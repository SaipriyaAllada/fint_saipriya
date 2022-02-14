package excuterScript;

import java.io.IOException;

import org.testng.annotations.Test;

import genericScript.BaseCls;
import pom_Salesforce.LoginPageObjects;
import pom_Salesforce.TasksObjects;
@Test
public class TaskExcution extends BaseCls{
	
public void task() throws InterruptedException, IOException {
		LoginPageObjects log =new LoginPageObjects(driver);
		TasksObjects tasks =new TasksObjects(driver);
		
		log.LoginAccount();
		tasks.Taskfun();

}
}
