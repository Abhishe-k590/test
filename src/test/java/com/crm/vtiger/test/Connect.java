package com.crm.vtiger.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Connect {
	
	@Test
	public void contactcreate() throws MalformedURLException{
		
		URL url=new URL("http://192.168.236.1:4441/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities().chrome();
	RemoteWebDriver driver=new RemoteWebDriver(url, cap);
	
	driver.get("https://www."
			+ ""
			+ "fb.com");
		
		
	}

}
