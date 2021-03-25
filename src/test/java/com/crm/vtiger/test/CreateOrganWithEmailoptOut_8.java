package com.crm.vtiger.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.comcast.objectrepositoryUtility.Homepage;
import com.crm.comcast.objectrepositoryUtility.Orgnization;
import com.crm.comcast.objectrepositoryUtility.createOrgName;
import com.crm.vtiger.genericutility.BaseClasss;

public class CreateOrganWithEmailoptOut_8  extends BaseClasss{
	
	@Test(groups="smoke")
	public void erase() throws Throwable
	{
		String orgnam1 = excel.getExceldata("Sheet1", 0, 1);
		String orgnam = excel.getExceldata("Sheet1", 0, 0);
		int num = java.RandomNum();
		String orgnam2=orgnam+num;

		Homepage home=new Homepage(driver);
		home.getOrgLnk().click();
	
		Orgnization org=new Orgnization(driver);
		org.getCreateOrgImg().click();
		
		createOrgName orgnm=new createOrgName(driver);
		orgnm.getOrgtext().sendKeys(orgnam2);
		
		orgnm.getSelectbox().click();
		
		boolean result = orgnm.getSelectbox().isEnabled();
		Assert.assertTrue(result);
		System.out.println("text box is enabled");
		
		//*validation*//
		
		
		
		
		
		
	
		
		
	
}
}
