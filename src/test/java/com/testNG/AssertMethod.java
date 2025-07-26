package com.testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertMethod {
	@Test
	public void facebook() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		
	    WebElement email = driver.findElement(By.id("email"));
	    
	    email.sendKeys("thivyar90");
	    
	    WebElement password = driver.findElement(By.id("pass"));
	    password.sendKeys("thiv123");
	    
	    WebElement loginBtn = driver.findElement(By.name("login"));
	    
	    String actual = loginBtn.getText();
	    //hardassert
	    //Assert.assertEquals(actual, "Log in");
	    
	    SoftAssert softassert = new SoftAssert();
	    softassert.assertEquals(actual, "Log in");
	    loginBtn.click();
	}

}
