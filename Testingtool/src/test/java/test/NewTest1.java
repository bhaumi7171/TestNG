package test;

import org.testng.annotations.Test;

public class NewTest1 {
	  @Test(priority=4)
	  public void display() {
		  System.out.println(" Display");
	  }
	  @Test(priority=1)
	  public void print()
	  {
		  System.out.println(" Print ");
	  }
	  @Test(priority=3)
	  public void printNew()
	  {
		  System.out.println(" Print New ");
	  }
	  @Test(priority=2)
	  public void printSecond()
	  {
		  System.out.println(" Print Second ");
	  }
	}

