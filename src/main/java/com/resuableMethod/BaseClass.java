package com.resuableMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class BaseClass {
	
	public static WebDriver driver;
	
	public static void LaunchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
		
		    driver = new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("edge")) {
		
			driver = new EdgeDriver();
			
		} else if(browserName.equalsIgnoreCase("firefox")) {
		
			driver = new FirefoxDriver(); 
		}
	}
		protected static void maximize() {
			
		driver.manage().window().maximize();
        
	    }
	    
	    protected static void launchurl(String url) {
	    	driver.get(url);
	    }
	    
	    protected static void gettingtitle() {
	    	
	    	String title = driver.getTitle();
	    	System.out.println(title);
	    	
	    }
	    
	    protected static void getCurrentUrl() {
	    	String CurrentUrl = driver.getCurrentUrl();
	    	System.out.println(CurrentUrl);
	    }
	    
	    protected  static void navigateTo(String url1) {
	    	driver.navigate().to(url1);
	    }
	    protected static void navigateMethod(String type)
	    {
	    	if (type.equalsIgnoreCase("back"))  {
	    		driver.navigate().back();	
	    	} else if (type.equalsIgnoreCase("Forward")) {
	    		driver.navigate().forward();
	    	} else if (type.equalsIgnoreCase("Refresh")) {
	    		driver.navigate().refresh();
	    }
	    }
	    	
	    protected static void inputPassing(WebElement element,String values) {
	    
		
	    	element.sendKeys(values);
		}
	
		protected static void elementclicking(WebElement element) {
			
			element.click();
		}
		
		protected static void terminateBrowser() {
			
			driver.quit();
				
		}
		protected static void Browserclose() {
				
				driver.close();
			
		}
		protected static void navigateMethods (String type) {
		
			if (type.equalsIgnoreCase("forward")) {
			   driver.navigate ().forward();
			
			} else if (type.equalsIgnoreCase ("back")) {
			
			    driver.navigate().back();
			    
			} else if (type.equalsIgnoreCase ("refresh")) {
				
				driver.navigate().refresh();
			}
		}
        
		protected static void navigateToURL (String navigateURL) {
				driver.navigate().to (navigateURL);

			}
		protected static void implicitwait(long i) {
			
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
					
		}
}