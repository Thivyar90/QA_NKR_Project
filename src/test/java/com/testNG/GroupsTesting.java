package com.testNG;

import org.testng.annotations.Test;

public class GroupsTesting {
	
    @Test (groups = "NonVeg")
	
	public void muttonBriyani() {
		System.out.println("Mutton Briyani");
 		}
     
    @Test (groups = "NonVeg")

    public void chickenBriyani() {
	System.out.println("Chicken Briyani");
	}
    @Test (groups = "Veg")
	
	public void vegBriyani() {
		System.out.println("Veg Briyani");
 		}
     
    @Test (groups = "Veg")

    public void gopiBriyani() {
	System.out.println("Gopi Briyani");
	}

    @Test (groups = "Mobiles")

    public void samsungMobiles() {
	System.out.println("Samsung Mobiles");
	}
    
    @Test (groups = "Mobiles")

    public void iphoneMobiles() {
	System.out.println("Iphone Mobiles");
	}
    @Test (groups = "Laptops")

    public void lenovaLap() {
	System.out.println("Lenova Laptop");
	}
    
    @Test (groups = "Laptops")

    public void hpLap() {
	System.out.println("HP Laptop");
	}
}
