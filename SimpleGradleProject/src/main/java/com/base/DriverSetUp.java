package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUp {

	 public static WebDriver driver;
	 public String baseURL="https://www.yahoo.com/";
	 public String username="vaibs567";
	 public String password="hello";
	 
	 
	 @BeforeClass 
	 public void setDriver()
 	 {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 
	 }
	
	 @AfterClass
	 public void tearDown()
	 {
		 driver.quit();
	 }
}