package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class InvocationCountTesting {
	@Test(invocationCount = 10)
	

	public void facebook() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:facebook.com/");
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("thivyar90"); //A
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("sreeja113"); 
		
		WebElement loginBtn=driver.findElement(By.name("login"));
		loginBtn.click();  
		driver.quit();
	}
		}


