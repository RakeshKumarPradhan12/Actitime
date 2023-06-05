package TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import POMpage.ActitimeLoginPage;
import POMpage.POM_ActitimecreateNewCustomer;
import POMpage.POM_actitimeHomePage;
import POMpage.TaskPage;
import generic.BaseTest;

public class TC2_CreateCustomer extends BaseTest
{
	@Test
	public void createCustomer() throws IOException, InterruptedException
	{
		ActitimeLoginPage log = new ActitimeLoginPage(driver);
		log.loginMethod();
		
		
		POM_actitimeHomePage home= new POM_actitimeHomePage(driver);
		home.clickonTask();
		
		TaskPage task = new TaskPage(driver);
		task.addnew();
		task.createCustomerLink();
		
		POM_ActitimecreateNewCustomer customer = new POM_ActitimecreateNewCustomer(driver);
		customer.createNewCustomer();
		
		
	}
}
