package com.crm.comcast.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.genericutility.WebdriverUtilities;

public class Homepage extends WebdriverUtilities
{
WebDriver driver;

public WebElement getAdminImg() {
	return adminImg;
}

public WebElement getSignOutLnk() {
	return signOutLnk;
}

public WebElement getHorglnk() {
	return horglnk;
}

public Homepage(WebDriver driver){
	this.driver =  driver;
	PageFactory.initElements(driver, this);
}
@FindBy(linkText = "Organizations")
private WebElement orgLnk;

@FindBy(linkText = "Contacts")
private WebElement contactLnk;


@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
private WebElement adminImg;

@FindBy(linkText = "Sign Out")
private WebElement signOutLnk;

@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']")
 private WebElement horglnk;

public WebElement getOrgLnk() {
	return orgLnk;
}

public WebElement getContactLnk() {
	return contactLnk;
}

/**
 * used to logout from the application
 * @throws Throwable 
 */
public void logout() throws Throwable {
	WebdriverUtilities webutil=new WebdriverUtilities();
	webutil.waitAndClick(adminImg);
	webutil.movetoexoectedElement(driver, adminImg);
	signOutLnk.click();
}
}
