package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	
  @BeforeSuite
  public void browsersetup() {
	  System.out.println("Browser setup is done");
  
  }
  
  @BeforeTest
  public void url() {
	  System.out.println("URL launched success");
  
  }
  
  @BeforeClass
  public void screenshot() {
	  System.out.println("screenshot before");

  }
  @BeforeMethod
  public void login() {
	  System.out.println("login");
  
  }
  @Test
  public void mensProduct() {
	  System.out.println("Mens Product");
	  
  } 
  @Test
  public void kidsProduct() {
	  System.out.println("Kids Product");
  }
  
  @Test
  public void womensProduct() {
		  System.out.println("Womens Product");
}
  @AfterMethod
  public void logout() {
	  System.out.println("logout");
  }  
  @AfterClass
   public void homepage() {
	  System.out.println("homepage");
  }
  @AfterTest
  public void screenshot2() {
	  System.out.println("screenshot After logout");
  }  
  @AfterSuite
  public void terminate() {
	  System.out.println("terminate");
}
}
