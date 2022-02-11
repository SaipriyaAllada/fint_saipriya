package excuterScript;

import org.testng.annotations.Test;

import genericScript.BaseCls;
import pom_Salesforce.LoginPageObjects;
import pom_Salesforce.NotesObjects;

public class NotesExcution extends BaseCls{
@Test
public void  note() throws InterruptedException {
	LoginPageObjects log =new LoginPageObjects(driver);
	NotesObjects Notes =new NotesObjects(driver);
	
	log.LoginAccount();
	Notes.note();
	
	
}
}
