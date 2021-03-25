package com.crm.vtiger.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.comcast.objectrepositoryUtility.Createorgnambyassgined;
import com.crm.comcast.objectrepositoryUtility.Homepage;
import com.crm.comcast.objectrepositoryUtility.Orgnization;
import com.crm.comcast.objectrepositoryUtility.createOrgName;
import com.crm.vtiger.genericutility.BaseClasss;

public class CreateOrganByuserAdmin_10 extends BaseClasss {
	
	@Test(groups="regression")
	public void adminuserdropdon() throws Throwable{
		int num = java.RandomNum();
		String orgnam1 = excel.getExceldata("Sheet1", 0, 1);
		String orgnam3 = num + orgnam1;
		webutil.waitForPagetoLoad(driver);

		Homepage ho = new Homepage(driver);
		ho.getOrgLnk().click();

		Orgnization or = new Orgnization(driver);
		or.getCreateOrgImg().click();

		createOrgName ornam = new createOrgName(driver);
		ornam.getOrgtext().sendKeys(orgnam3);
		 
		ornam.getUserradiobtn().click();
		Createorgnambyassgined dp = new Createorgnambyassgined(driver);
		dp.getDropdowadmin().click();
		
		webutil.dropdownselectbyvisibletext(dp.getDropdowadmin(),"Administrator");
		
		webutil.waitAndClick(ornam.getSavebtn());
		
		ornam.getSavebtn().click();

	}
	

}
