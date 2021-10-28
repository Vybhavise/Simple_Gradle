package com.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.DriverSetUp;

public class Yahoo_pages extends DriverSetUp
{

	
	public Yahoo_pages()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='ybar-sbq']")WebElement search;
	@FindBy(xpath="//input[@id='ybar-search']")WebElement clickSearch;
	@FindBy(xpath="//a[@class='_yb_1bmbz']")WebElement signIn;
	
	public void searchbox(String srch)
	{
		search.sendKeys(srch);
	}
	
	public void click_on_Search()
	{
		clickSearch.click();
	}
	
	public void signin_button()
	{
		signIn.click();
	}

}
