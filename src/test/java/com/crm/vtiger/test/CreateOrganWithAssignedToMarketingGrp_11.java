package com.crm.vtiger.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.vtiger.genericutility.Fileutilities;
import com.crm.vtiger.genericutility.Java_utility;
import com.crm.comcast.objectrepositoryUtility.Createorgnambyassgined;
import com.crm.comcast.objectrepositoryUtility.Homepage;
import com.crm.comcast.objectrepositoryUtility.Orgnization;
import com.crm.comcast.objectrepositoryUtility.createOrgName;
import com.crm.vtiger.genericutility.BaseClasss;
import com.crm.vtiger.genericutility.ExcelUtilities;
import com.crm.vtiger.genericutility.WebdriverUtilities;

public class CreateOrganWithAssignedToMarketingGrp_11 extends BaseClasss {

	@Test(groups="regression")
	public void cases() throws Throwable {
		int num = java.RandomNum();
		String orgnam1 = excel.getExceldata("Sheet1", 0, 1);
		String orgnam2 = num + orgnam1;
		webutil.waitForPagetoLoad(driver);

		Homepage ho = new Homepage(driver);
		ho.getOrgLnk().click();

		Orgnization or = new Orgnization(driver);
		or.getCreateOrgImg().click();

		createOrgName ornam = new createOrgName(driver);
		ornam.getOrgtext().sendKeys(orgnam2);

		ornam.getRaidobtn().click();
		Createorgnambyassgined dp = new Createorgnambyassgined(driver);
		dp.getDropdowgrop().click();
		webutil.dropdownselectbyvisibletext(dp.getDropdowgrop(), "Marketing Group");

		ornam.getSavebtn().click();
	}
}
