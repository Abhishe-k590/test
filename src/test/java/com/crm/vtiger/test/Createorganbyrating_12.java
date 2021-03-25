package com.crm.vtiger.test;

import org.testng.annotations.Test;

import com.crm.comcast.objectrepositoryUtility.Createorgnambyassgined;
import com.crm.comcast.objectrepositoryUtility.Homepage;
import com.crm.comcast.objectrepositoryUtility.Orgnization;
import com.crm.comcast.objectrepositoryUtility.createOrgName;
import com.crm.vtiger.genericutility.BaseClasss;

public class Createorganbyrating_12 extends BaseClasss {
	
		
		@Test(groups="smoke")
		public void rating() throws Throwable
		{
			int num = java.RandomNum();
			String orgnam1 = excel.getExceldata("Sheet1", 0, 0);
			String orgnam = num+orgnam1;
			
			webutil.waitForPagetoLoad(driver);

			Homepage ho = new Homepage(driver);
			ho.getOrgLnk().click();

			Orgnization or = new Orgnization(driver);
			or.getCreateOrgImg().click();

			createOrgName ornam = new createOrgName(driver);
			ornam.getOrgtext().sendKeys(orgnam);
			

			Createorgnambyassgined ra=new Createorgnambyassgined(driver);
			ra.getDropdowrating().click();
			webutil.dropdownselectbyvisibletext(ra.getDropdowrating(), "Market Failed");
		
			
			ornam.getSavebtn().click();
			
		}

}
