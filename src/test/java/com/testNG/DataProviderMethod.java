package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMethod {
  @Test (dataProvider = "Dataset")
  public void facebook(String emailData, String passwordData) {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://facebook.com/");
	  
	  WebElement email = driver.findElement(By.id("email"));
	  email.sendKeys(emailData);//A
	  
	  WebElement password = driver.findElement(By.id("pass"));
	  password.sendKeys(passwordData);//A
	  
	  WebElement loginBtn = driver.findElement(By.name("login"));
	  loginBtn.click();
	  driver.quit();
  }
  
  @DataProvider(name ="Dataset")
  public Object[] []testdata(){
       return new Object[][] {
    	   {"Praveen", "prav@123"},
    	   {"Dharani", "dharan@123"},
    	   {"Thivya","thiv@123"},
    	   {"",""},
    	   {"","sree@123"}
  
};
}
}