package com.crm.vtiger.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.comcast.objectrepositoryUtility.CreateOrgInformation;
import com.crm.comcast.objectrepositoryUtility.Homepage;
import com.crm.comcast.objectrepositoryUtility.Orgnization;
import com.crm.comcast.objectrepositoryUtility.SelectOrganPage;
import com.crm.comcast.objectrepositoryUtility.createOrgName;
import com.crm.vtiger.genericutility.BaseClasss;

@Listeners(com.crm.vtiger.genericutility.Listner_Im.class)
public class CreateOrganWitMembersof_6 extends BaseClasss {

	@Test(groups="smoke")
	public void executed() throws Throwable
	{
		
		String orgnam1 = excel.getExceldata("Sheet1", 0, 1);
	String orgnam = excel.getExceldata("Sheet1", 0, 0);
	int num = java.RandomNum();
	String orgnam2=orgnam+num;
		webutil.waitForPagetoLoad(driver);
		
		Homepage home=new Homepage(driver);
		home.getOrgLnk().click();
	
		Orgnization org=new Orgnization(driver);
		org.getCreateOrgImg().click();
		
		
		createOrgName oname=new createOrgName(driver);
		oname.getOrgtext().sendKeys(orgnam2);
		
		oname.getMemberoficon().click();
		
		webutil.switchToBrowser(driver,"Popup&popuptype");
		
		SelectOrganPage search=new SelectOrganPage(driver);

		search.getSearchtex().sendKeys("abc");
		
		search.getClickonsearch().click();
		driver.findElement(By.xpath("//a[.='abc']")).click();
	    webutil.accpetallert(driver);
	    
	
	    webutil.switchToBrowser(driver, "Organization");
	    oname.getSavebtn().click();
	    
	    CreateOrgInformation orginfo=new CreateOrgInformation(driver);
	    String text = orginfo.getSuccessfulMsg().getText();
	    Assert.assertEquals(orgnam2, text);
	
	
	}

}
