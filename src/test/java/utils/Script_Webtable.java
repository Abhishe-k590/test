package utils;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Script_Webtable {
	@Test
	public void Organization()
	{
		WebDriver d1=new FirefoxDriver();
		d1.get("http://localhost:8888/");
		d1.findElement(By.name("user_name")).sendKeys("admin");
		d1.findElement(By.name("user_password")).sendKeys("admin");
		d1.findElement(By.id("submitButton")).click();
		d1.findElement(By.xpath("//a[.='Organizations']")).click();
	
		List<WebElement> lst = d1.findElements(By.xpath("//table[@width='100%']/tbody/tr[*]/td[3]/a[@title='Organizations']"));
	
		int count = lst.size();
		System.out.println(count);
		
				
				
			}
		}
		
	
	
	


