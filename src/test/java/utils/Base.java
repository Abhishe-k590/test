package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Base {
	@Test

		public void login()
		{
		WebDriver d1=new FirefoxDriver();
		d1.findElement(By.name("_name")).sendKeys("admin");
		d1.findElement(By.name("user_password")).sendKeys("admin");
		d1.findElement(By.id("submitButton")).click();
		d1.quit();
		}
	}

