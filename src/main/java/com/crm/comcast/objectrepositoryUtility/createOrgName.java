package com.crm.comcast.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createOrgName {
	WebDriver driver;
	
	 public createOrgName( WebDriver driver)
	 { 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 @FindBy(xpath="//input[@name='accountname']")
	 private WebElement orgtext;
	 
	 @FindBy(xpath="(//input[@value='  Save  '])[1]")
	private WebElement savebtn;
	 
	 @FindBy(xpath="//img[@title='Select']")
	 private WebElement memberoficon;
	 
	 @FindBy(xpath="//input[@title='Clear']")
	 private WebElement earsebtn;
	 
	 @FindBy(xpath="//input[@name='emailoptout']")
	 private WebElement selectbox;
	 
	 @FindBy(xpath="//input [@value='T']")
	 private WebElement radiobtn;
	 
	 @FindBy(xpath="//input[@value='U']")
		private WebElement userradiobtn;
	 
	 
	 

		 

	 
	 public WebElement getUserradiobtn() {
		return userradiobtn;
	}


	public WebElement getRaidobtn() {
		return radiobtn;
	}


	public WebElement getSelectbox() {
		return selectbox;
	}


	public WebElement getEarsebtn() {
		return earsebtn;
	}


	public WebElement getMemberoficon() {
		return memberoficon;
	}


	public WebElement getOrgtext() {
		return orgtext;
	}


	public WebElement getSavebtn() {
		return savebtn;
	}


	public void createorg(String orgname)
	 {
		 orgtext.sendKeys(orgname);
		 savebtn.click();
	 }
}

