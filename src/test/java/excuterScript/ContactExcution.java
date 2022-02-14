package excuterScript;

import java.io.IOException;

import org.testng.annotations.Test;

import genericScript.BaseCls;
import pom_Salesforce.ContactsObjects;
import pom_Salesforce.LoginPageObjects;

public class ContactExcution extends BaseCls {
@Test
public void contact() throws InterruptedException, IOException {
	LoginPageObjects log =new LoginPageObjects(driver);
	ContactsObjects cont =new ContactsObjects(driver);
	
	log.LoginAccount();
	cont.contactfun();
}

}
