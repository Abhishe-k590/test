package com.crm.vtiger.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.crm.comcast.objectrepositoryUtility.Homepage;
import com.crm.comcast.objectrepositoryUtility.Loginpage;

public class BaseClasss {
	public DataBaseUtilites datba=new DataBaseUtilites();
	public ExcelUtilities excel=new ExcelUtilities();
	public Fileutilities filut=new Fileutilities();
	public Java_utility java=new Java_utility();
	public WebdriverUtilities webutil=new WebdriverUtilities();
	public WebDriver driver;
public  static WebDriver staticdriver;
	
	@BeforeSuite
	public void configBeforeSuite() throws Throwable {
		datba.ConnectTODb();
		System.out.println("***db connected******");
	}
	@Parameters("BROWSER")
	@BeforeClass(groups="smoke,regression")
	public void configurBeforeclass() throws Throwable
	{
		String url = filut.readdatafromprofile("url");
		   
		String BROWSER = filut.readdatafromprofile("browser");
		

		 if(BROWSER.equals("firefox")) {
		    driver = new FirefoxDriver();
		 }else if(BROWSER.equals("chrome")) {
			 driver = new ChromeDriver();
		 }else if(BROWSER.equals("ie")) {
			 driver = new InternetExplorerDriver();
		 }else {
			 driver = new FirefoxDriver();
		 }
		 staticdriver=driver;
		 webutil.waitForPagetoLoad(driver);
		 driver.get(url);
	}
	//@Parameters("browser")
	/*@BeforeClass
	public void configurBeforeclass(String Browser) throws Throwable
	{
		String url = filut.readdatafromprofile("url");
		

		 if(Browser.equals("firefox")) {
		    driver = new FirefoxDriver();
		 }else if(Browser.equals("chrome")) {
			 driver = new ChromeDriver();
		 }else if(Browser.equals("ie")) {
			 driver = new InternetExplorerDriver();
		 }else {
			 driver = new FirefoxDriver();
		 }
		
		 webutil.waitForPagetoLoad(driver);
		 driver.get(url);
	}*/
	
	
	@BeforeMethod
	public void configBeforeMtd() throws Throwable{
		/*step-1 : login to Application*/
		String USERNAME = filut.readdatafromprofile("username");
		String PASSWORD = filut.readdatafromprofile("password");
		Loginpage lp = new Loginpage(driver);
		lp.loginToAPP(USERNAME, PASSWORD);
	}

	@AfterMethod
	public void configAfterMethod() throws Throwable {
		Homepage hp = new Homepage(driver);
	      /*step-* : logout */
			  hp.logout();
    }
	
	
	@AfterClass
	public void configAfterClass() {
		driver.close();
	}
	
	@AfterSuite
	public void configAfterSuite() throws Throwable {
		datba.closeDB();
		
	}
	}

