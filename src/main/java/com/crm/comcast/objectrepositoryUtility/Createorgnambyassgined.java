package com.crm.comcast.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.genericutility.WebdriverUtilities;

public class Createorgnambyassgined {
	WebDriver driver;

	public Createorgnambyassgined(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@name='assigned_user_id']")
	private WebElement dropdowadmin;
	
	@FindBy(xpath="//select[@name='rating']")
	private WebElement dropdowrating;
	

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDropdowrating() {
		return dropdowrating;
	}

	public WebElement getDropdowadmin() {
		return dropdowadmin;
	}
	@FindBy(xpath = "//select[@name='assigned_group_id']")
	private WebElement dropdowgrop;

	public WebElement getDropdowgrop() {
		return dropdowgrop;
	}

}
