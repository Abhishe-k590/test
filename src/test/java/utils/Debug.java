package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Debug {
	@Test
	public void vitiger()
	{
		WebDriver d1=new FirefoxDriver();
		System.out.println("reading");
		d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d1.get("http://localhost:8888");
		System.out.println("App lanching");
		d1.manage().window().maximize();
		System.out.println("window maximize");
		Base b=new Base();
		b.login();
		
	}
	
		
	}
