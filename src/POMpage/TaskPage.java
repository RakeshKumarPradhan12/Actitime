package POMpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage 
{
	public WebDriver driver;
	@FindBy(xpath = "//div[contains(text() , 'Add New')]")
	private WebElement clickonAddNewButton;

	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement clickonCreateCustomerLink;

	public TaskPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void addnew()
	{
		clickonAddNewButton.click();
	}

	public void createCustomerLink()
	{
		clickonCreateCustomerLink.click();
	}






}
