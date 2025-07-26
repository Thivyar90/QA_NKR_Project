package com.testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowser {
	

	@Test 
	public void chromeBrowser () throws Throwable {
		WebDriver driver = new ChromeDriver(); 
		driver.manage() .window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("Browser ID: "+ Thread.currentThread().getId());
		Thread.sleep(3000);
		driver.navigate ().to("https://www.google.com/");
		driver.quit();

}
	@Test (enabled = false)
	
	public void edgeBrowser() throws InterruptedException{
	WebDriver driver = new EdgeDriver();
	driver.manage() .window () .maximize();
	driver.get("https://www.amazon.in/");
	System.out.println("Browser ID: "+ Thread.currentThread().getId());
	Thread.sleep(3000);
	driver.quit();

}
	
	@Test
	
	public void firefoxBrowser () throws Throwable {
		WebDriver driver = new FirefoxDriver(); 
		driver.manage () .window () .maximize (); 
		driver.get("https://www.facebook.com/");
		System.out.println("Browser ID: "+ Thread.currentThread().getId());
		Thread.sleep (3000);
		driver.quit();
	}
}
