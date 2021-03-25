package com.crm.comcast.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.genericutility.WebdriverUtilities;

public class ClickonOrganization extends WebdriverUtilities
{
	WebDriver driver;
	public ClickonOrganization(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	 public WebElement createorgimg;
	public WebElement getCreateorgimg() {
		return createorgimg;
	}


	
	
}