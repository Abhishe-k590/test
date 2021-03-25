package com.crm.vtiger.script;

import org.testng.annotations.Test;

import com.crm.comcast.objectrepositoryUtility.Homepage;
import com.crm.vtiger.genericutility.BaseClasss;

public class CreateOrgnizationMem extends BaseClasss
{
	@Test
	public void createwithname()
	{

		webutil.waitForPagetoLoad(driver);
		Homepage ho=new Homepage(driver);
		
		ho.getOrgLnk().click();
	
	}

}
