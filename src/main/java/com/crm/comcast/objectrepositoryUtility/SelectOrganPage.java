package com.crm.comcast.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectOrganPage {
	
	 public SelectOrganPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="search_text")
	private WebElement searchtex;

	public WebElement getSearchtex() {
		return searchtex;
	}
	@FindBy(name="search")
	private WebElement clickonsearch;
	

	public WebElement getClickonsearch() {
		return clickonsearch;
	}
	

	}


