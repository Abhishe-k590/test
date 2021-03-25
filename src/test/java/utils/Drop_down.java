package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drop_down {
	@Test
	public void CalenderwinDowTest()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver d1=new FirefoxDriver();
	d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d1.get("https://www.makemytrip.com/");
	Actions act=new Actions(d1);
	act.moveByOffset(10,15);
	
	
	
	}
}
