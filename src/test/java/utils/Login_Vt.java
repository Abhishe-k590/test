package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.genericutility.Fileutilities;
import com.crm.vtiger.genericutility.Java_utility;
import com.crm.vtiger.genericutility.ExcelUtilities;
import com.crm.vtiger.genericutility.WebdriverUtilities;

public class Login_Vt {
	WebDriver driver=new FirefoxDriver();
	Java_utility java=new Java_utility();
	ExcelUtilities excel=new ExcelUtilities();
	Fileutilities file=new Fileutilities();
	WebdriverUtilities d=new WebdriverUtilities();
	@Test
	public void Vtcrm() throws Throwable
	{
		d.waitForPagetoLoad(driver);
		driver.get(file.readdatafromprofile("url"));
		
		
	}

}
