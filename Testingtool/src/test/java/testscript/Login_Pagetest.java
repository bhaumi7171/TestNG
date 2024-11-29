package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pages.Login_Page;

public class Login_Pagetest extends Base {
  @Test
  @Parameters({"username","password"})
  public void verifyUserIsAbleToLoginValidCredenstials(String username, String password) throws AWTException  {
	  Login_Page login=new Login_Page(driver);
	  login.enterUsernameField(username);
	  login.enterPasswordField(password);
	  login.clickLoginButton();
	  boolean ishomepageisloaded=login.isDashboardIsLoaded();
	  assertTrue(ishomepageisloaded, "Home Page is not Loaded using invalid credentials");
	 // System.out.println("Dashboard is loaded "+ishomepageisloaded);
	/* Actions action=new Actions(driver);
	  action.scrollByAmount(1, 5);*/
	//  boolean istextloaded=login.isTextLoaded();
	//  assertTrue(istextloaded, "Text is not loaded");
	//  System.out.println("Test is shown"+istextloaded);
	  
  }
  @DataProvider(name="credentials")
  public Object[][] testData()
  {
	  Object data[][]= {{"carol","1q2w3e4r"},{"kala","1234"},{"bhaumi","2345"}};
  
  return data;
  }
  @Test(dataProvider = "credentials")
  public void UserAbleToLoginWithProvider(String username, String password) throws  Exception
  {
	  Login_Page login=new Login_Page(driver);
	  login.enterUsernameField(username);
	  login.enterPasswordField(password);
	  login.clickLoginButton();
	  boolean ishomepageisloaded=login.isDashboardIsLoaded();
	  assertTrue(ishomepageisloaded, "Home Page is not Loaded using invalid credentials"); 
  }
  /*//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	//.withTimeout(Duration.ofSeconds(30L))
	/*.pollingEvery(Duration.ofSeconds(5L))
	.ignoring(NoSuchElementException.class);

	WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	public WebElement apply(WebDriver driver) {
	return driver.findElement(By.id("foo"));*/
}
