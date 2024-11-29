package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.Client_Page;
import pages.Login_Page;

public class Client_Pagetest extends Base {
  @Test
  public void userAbleToSearchWithClientDetails() throws AWTException {
	  Login_Page login=new Login_Page(driver);
	  login.enterUsernameField("carol");
	  login.enterPasswordField("1q2w3e4r");
	  login.clickLoginButton();
	  Client_Page client=new Client_Page(driver);
	  client.client();
	  client.clientName("Astar Logisticss123");
	  client.clientId("1");
	  client.searchButton();
	  boolean isclientsearchdone=client.isclientsearchisloaded();
	  assertTrue(isclientsearchdone, "search is not done");
	 // System.out.println("Search is done ||  "+isclientsearchdone);
	  
  }/*
  @Test
  public void userAbleToSearchSecondly() throws AWTException
  {
	  Client_Page client1=new Client_Page(driver); 
	  client1.resetButton();
	  client1.searchButton();
	  client1.clientName("Bimal mathew");
	  client1.clientId("8"); 
	  client1.searchButton();
	  boolean issecondsearchdone=client1.isclientsearchisloaded();
	  assertTrue(issecondsearchdone, " search is not done");
	 // System.out.println(" Second Search Is Done || "+issecondsearchdone);
  }*/
}
