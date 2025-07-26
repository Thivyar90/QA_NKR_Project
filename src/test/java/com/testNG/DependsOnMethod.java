package com.testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@BeforeSuite
	public void BrowserLaunch() {
	System.out.println("BrowserLaunch");
	}
	
	@BeforeClass
	public void urlLaunch() {
	System.out.println("url Launched");
	}
	
	@Test 
	
	public void login() {
		System.out.println("Login Successfully");
		}
	
	@Test (dependsOnMethods = "login")
	
	public void mensproduct() {
		System.out.println("Mens Product");
		}

	
    @Test (dependsOnMethods = "mensproduct")
	
	public void womensproduct() {
		System.out.println("Womens Product");
		}

    @Test (dependsOnMethods = "watchproduct")
	
	public void kidsproduct() {
		System.out.println("Kids Product");
		}

    @Test (dependsOnMethods = "womensproduct")
	
	public void watchproduct() {
		System.out.println("Watch Product");
		}

}
