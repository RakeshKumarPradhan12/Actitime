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

public class POM_actitimeHomePage extends BasePage
{
	public WebDriver driver;
	public JavascriptExecutor js; 
	public WebDriverWait wait;
	
	
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logoutLink;
	
	@FindBy(xpath = "//div[@id='container_tasks']")
	private WebElement clickontasklink;

	public POM_actitimeHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickonTask()
	{
		visibilityofElement(driver, clickontasklink);
		javascriptClick(driver, clickontasklink);
	}
	
	
	public void logoutMethod() throws InterruptedException
	{
		Thread.sleep(3000); 
		logoutLink.click();
	}
}
