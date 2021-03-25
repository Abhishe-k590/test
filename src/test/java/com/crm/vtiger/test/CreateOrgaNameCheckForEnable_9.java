package com.crm.vtiger.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import com.crm.vtiger.genericutility.Fileutilities;
import com.crm.vtiger.genericutility.Java_utility;
import com.crm.comcast.objectrepositoryUtility.Homepage;
import com.crm.comcast.objectrepositoryUtility.Orgnization;
import com.crm.comcast.objectrepositoryUtility.createOrgName;
import com.crm.vtiger.genericutility.BaseClasss;
import com.crm.vtiger.genericutility.ExcelUtilities;
import com.crm.vtiger.genericutility.WebdriverUtilities;

public class CreateOrgaNameCheckForEnable_9 extends BaseClasss {

	@Test(groups="smoke")
	public void erase() throws Throwable {
		int num = java.RandomNum();
		String orgnam1 = excel.getExceldata("Sheet1", 0, 1);
		String orgnam2 = orgnam1 + num;
		webutil.waitForPagetoLoad(driver);

		Homepage ho = new Homepage(driver);
		ho.getOrgLnk().click();

		Orgnization or = new Orgnization(driver);
		or.getCreateOrgImg().click();

		createOrgName ornam = new createOrgName(driver);
		ornam.getOrgtext().sendKeys(orgnam2);

		ornam.getSelectbox().click();
		ornam.getSelectbox().click();
		
		ornam.getSavebtn().click();
		
		
  //vaildation//
		boolean result = ornam.getSelectbox().isEnabled();
		Assert.assertTrue(result);
		{

			System.out.println("select box is enabled");
		}
		
		}

	}

