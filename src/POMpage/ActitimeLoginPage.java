package POMpage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.AutoConstant;
import generic.BasePage;
import generic.ExcelLibrary;

public class ActitimeLoginPage extends BasePage implements AutoConstant
{
public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement usernameTextfield;

	@FindBy(name = "pwd")
	private WebElement passwordTextfield;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	@FindBy(xpath = "//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;

	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;


	public ActitimeLoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void loginMethod() throws IOException 
	{
		visibilityofElement(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_login, 1, 0));

		visibilityofElement(driver, passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_login, 1, 1));

		visibilityofElement(driver, keepmeloggedinCheckbox);
		javascriptClick(driver, keepmeloggedinCheckbox);

		visibilityofElement(driver, loginButton);
		javascriptClick(driver, loginButton);
	}

	public void titlevalidate()
	{
		titleis(driver, "actiTIME - Enter Time-Track");
		validateTitle(driver, "actiTIME - Enter Time-Track");
	}
		
}


