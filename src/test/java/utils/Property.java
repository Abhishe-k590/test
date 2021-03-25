package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Property {
	@Test
	public void adddata() throws Throwable
	{
	FileInputStream fis= new FileInputStream("./File/userdata.properties.txt");
	Properties poj=new Properties();
	poj.load(fis);
	String br = poj.getProperty("url");
	String us = poj.getProperty("username");
	String ps = poj.getProperty("password");
	WebDriver d1=new FirefoxDriver();
	d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d1.get(br);
	d1.findElement(By.name("user_name")).sendKeys(us);
	d1.findElement(By.name("user_password")).sendKeys(ps);
	d1.findElement(By.id("submitButton")).click();
	
	
	}

}
