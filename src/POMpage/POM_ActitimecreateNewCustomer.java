package POMpage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.BasePage;

public class POM_ActitimecreateNewCustomer extends BasePage
{
	public WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement name;

	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement buttonlabel;

	public POM_ActitimecreateNewCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createNewCustomer() throws InterruptedException
	{
		visibilityofElement(driver, name);
		javascriptEnter(driver, "arguments[0].value='TIPU'", name);
		
		visibilityofElement(driver, buttonlabel);
		javascriptClick(driver, buttonlabel);
		
		
		Thread.sleep(3000);
	}


}
