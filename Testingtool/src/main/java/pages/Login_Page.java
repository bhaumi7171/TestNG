package pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page {
	public WebDriver driver;
public Login_Page(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);//initializeelements
	
}
@FindBy(id="loginform-username") WebElement username;
@FindBy(id="loginform-password") WebElement password;
@FindBy(name="login-button") WebElement login;
@FindBy(xpath="//a[text()='Dashboard']") WebElement dashboard;
@FindBy(xpath="//p[text()='Welcome to Payroll Application']") WebElement text;


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
	WebDriverWait loginwait=new WebDriverWait(driver,Duration.ofSeconds(10));
	loginwait.until(ExpectedConditions.elementToBeClickable(login));
	login.click();
	

	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	} 
public boolean isDashboardIsLoaded()
{
	return dashboard.isEnabled();
	
	}


public boolean isTextLoaded()
{
	return text.isDisplayed();
}

}

