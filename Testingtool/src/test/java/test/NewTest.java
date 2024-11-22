package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


  public class NewTest {
	  @Test
	  public void test() {
		  System.out.println("Test Method");
	  }
	  @BeforeMethod
	  public void beforeMethod() // Base
	  { 
		  System.out.println("Before Method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("After Method");
	  }
	  @Test
	  public void testN() {
		  System.out.println("Testnew Method");
	  }
	}


