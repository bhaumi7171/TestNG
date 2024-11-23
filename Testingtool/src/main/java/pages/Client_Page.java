package pages;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Client_Page {
	public WebDriver driver;
	public Client_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="loginform-username") WebElement username;
	@FindBy(id="loginform-password") WebElement password;
	@FindBy(name="login-button") WebElement login;
	@FindBy(xpath="//a[text()='Clients']") WebElement client;
	@FindBy(id="clientsearch-client_name") WebElement clientname;
	@FindBy(id="clientsearch-id") WebElement clientid;
	@FindBy(xpath="//button[@class='btn btn-primary']") WebElement search;
	
	public void enterUsernameField(String usernamefield)
	{
		username.sendKeys(usernamefield);
	}
	public void enterPasswordField(String passwordfield)
	{
		password.sendKeys(passwordfield);
	}
	public void clickLoginButton() throws AWTException 
	{
		login.click();
		Robot robot=new Robot();
		robot.delay(1000);
				} 
	public void client()
	{
		client.click();
	}
	public void clientSearch(String clientnamefield)
	{
		
		clientname.sendKeys(clientnamefield);
	}
	public void clientId(String clientidfield)
	{
		
		clientid.sendKeys(clientidfield);
	}
	public void searchButton()
	{
		search.click();
	}
	public boolean isclientsearchisloaded()
	{
		return search.isDisplayed();
	}
}
