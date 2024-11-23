package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.Client_Page;
import pages.Login_Page;

public class Client_Pagetest extends Base {
  @Test
  public void userAbleToSearchWithClientDetails() throws AWTException {
	  Client_Page client=new Client_Page(driver);
	  client.enterUsernameField("carol");
	  client.enterPasswordField("1q2w3e4r");
	  client.clickLoginButton();
	  client.client();
	  client.clientSearch("Astar Logisticss123");
	    client.clientId("1");
	    client.searchButton();
	    boolean isclientsearchdone=client.isclientsearchisloaded();
	    assertTrue(isclientsearchdone, "search is not done");
	    System.out.println("Search is done "+isclientsearchdone);
  }
}
