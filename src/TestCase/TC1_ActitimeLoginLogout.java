package TestCase;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POMpage.ActitimeLoginPage;
import POMpage.POM_actitimeHomePage;
import generic.BaseTest;
 
//@Listeners(generic.Screenshot.class)
public class TC1_ActitimeLoginLogout extends BaseTest
{
	@Test
	public void loginlogout() throws IOException, InterruptedException
	{

		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
		//loginPage.titlevalidate();


		POM_actitimeHomePage homepage=new POM_actitimeHomePage(driver);
		homepage.logoutMethod();

	}

}
