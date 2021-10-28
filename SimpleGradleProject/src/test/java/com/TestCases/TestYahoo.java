package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageElements.Yahoo_pages;
import com.base.DriverSetUp;

public class TestYahoo extends DriverSetUp
{

	@Test
	public void yahoolaunch()
	{
		driver.get(baseURL);
		
		Yahoo_pages lp=new Yahoo_pages();
	
        
		if(driver.getTitle().contains("Yahoo"))
		{
			Assert.assertTrue(true);
			System.out.println("Yahoo is launched");
			
		}
		else
		{
			System.out.println("Wrong website");
		}
		
		lp.searchbox("fashion");
		lp.click_on_Search();
		lp.signin_button();
	}
	}
	
