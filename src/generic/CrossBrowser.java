package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class CrossBrowser
{
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String Broser)
	{
		
		if(browser.equalsIgonreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout( Duration.ofSeconds(40));
			driver.get( "https://demo.actitime.com");
		}
		else if(browser.equalsIgonreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout( Duration.ofSeconds(40));
			driver.get( "https://demo.actitime.com");
		}
	}

}
