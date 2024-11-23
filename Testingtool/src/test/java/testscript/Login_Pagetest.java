package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import pages.Login_Page;

public class Login_Pagetest extends Base {
  @Test
  public void verifyUserIsAbleToLoginValidCredenstials() throws AWTException  {
	  Login_Page login=new Login_Page(driver);
	  login.enterUsernameField("carol");
	  login.enterPasswordField("1q2w3e4r");
	  login.clickLoginButton();
	  boolean ishomepageisloaded=login.isDashboardIsLoaded();
	  assertTrue(ishomepageisloaded, "Home Page is not Loaded using invalid credentials");
	  System.out.println("Dashboard is loaded "+ishomepageisloaded);
	/* Actions action=new Actions(driver);
	  action.scrollByAmount(1, 5);*/
	  boolean istextloaded=login.isTextLoaded();
	  assertTrue(istextloaded, "Text is not loaded");
	  System.out.println("Test is shown"+istextloaded);
	  
  }
}
