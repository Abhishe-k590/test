package com.crm.vtiger.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.comcast.objectrepositoryUtility.Homepage;
import com.crm.comcast.objectrepositoryUtility.Orgnization;
import com.crm.comcast.objectrepositoryUtility.createOrgName;
import com.crm.vtiger.genericutility.BaseClasss;
@Listeners(com.crm.vtiger.genericutility.Listner_Im.class)
public class CreateOrganWithMemAndClear_7 extends BaseClasss {
	
	@Test(groups="smoke")
	public void erase() throws Throwable
	{
		
		Homepage ho=new Homepage(driver);
		ho.getOrgLnk().click();
		
	Orgnization or=new Orgnization(driver);
	or.getCreateOrgImg().click();
	
	createOrgName orgna=new createOrgName(driver);
	orgna.getMemberoficon().click();
	
	webutil.switchToBrowser(driver, "module=Accounts");
	

		driver.findElement(By.xpath("//a[.='abc']")).click();
		webutil.accpetallert(driver);
		
		
		webutil.switchToBrowser(driver, "parenttab=Marketing");
		orgna.getEarsebtn().click();
		
		Assert.assertTrue(false);
		
		

	}

}
