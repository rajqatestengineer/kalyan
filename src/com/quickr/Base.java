package com.quickr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
       
	    static  WebDriver driver;
	    
		@BeforeSuite
	    public  void init() {
			
		System.out.println("Starting  Current Test");
		
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver");  
		driver = new ChromeDriver();
		
		driver.get("http://www.quikr.com/post-classifieds-ads/select-category/");
		driver.manage().window().maximize();
		
		
		}
		
		@AfterSuite
		public void exit(){
			
			driver.close();
			System.out.println("Exiting Current Test");
			
		}
	}


