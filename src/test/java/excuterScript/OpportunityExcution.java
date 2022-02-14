package excuterScript;

import java.io.IOException;

import org.testng.annotations.Test;

import genericScript.BaseCls;
import pom_Salesforce.LoginPageObjects;
import pom_Salesforce.Opportunity;

public class OpportunityExcution extends BaseCls {
@Test
public void MainOpportunity() throws InterruptedException, IOException {
	LoginPageObjects log =new LoginPageObjects(driver);
	Opportunity Oppor = new Opportunity(driver);
	
	log.LoginAccount();
	Oppor.Opportunityfun();
}

}
