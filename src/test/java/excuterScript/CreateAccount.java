package excuterScript;

import java.io.IOException;
import org.testng.annotations.Test;
import genericScript.BaseCls;
import pom_Salesforce.AccountsObjects;
import pom_Salesforce.LoginPageObjects;



public class CreateAccount extends BaseCls{
	
@Test
public void login() throws InterruptedException, IOException {
	LoginPageObjects log =new LoginPageObjects(driver);
	AccountsObjects acc = new AccountsObjects(driver);
	
	log.LoginAccount();
	acc.Accountfun();



	
	
	
}
}
