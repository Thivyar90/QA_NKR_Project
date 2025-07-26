package com.testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PriorityTesting {
	
	@BeforeSuite
	public void BrowserLaunch() {
	System.out.println("BrowserLaunch");
	}
	
	@BeforeClass
	public void urlLaunch() {
	System.out.println("url Launched");
	}
	
	@Test
	
	public void mensProduct() {
	System.out.println("Mens Product ");
	}
	
	@Test (priority=-3)
	
	public void WomensProduct() {
	System.out.println("Women Product");
    }
	
	@Test // 0 ascii

	public void kidsProduct () {
	System.out.println("Kids Product");
	}
	
	@Test (priority = -5) //-- ascii
	
	public void watchProduct () {
	System.out.println("watch product ");
}
}
