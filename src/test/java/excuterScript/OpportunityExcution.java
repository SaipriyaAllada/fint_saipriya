package excuterScript;

import org.testng.annotations.Test;

import genericScript.BaseCls;
import pom_Salesforce.LoginPageObjects;
import pom_Salesforce.Opportunity;

public class OpportunityExcution extends BaseCls {
@Test
public void MainOpportunity() throws InterruptedException {
	LoginPageObjects log =new LoginPageObjects(driver);
	Opportunity Oppor = new Opportunity(driver);
	
	log.LoginAccount();
	Oppor.Opportunityfun();
}

}
