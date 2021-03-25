package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc_2 {
	@Test
	public void Organization() throws Throwable
	{
		WebDriver d1=new FirefoxDriver();
		d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d1.get("http://localhost:8888/");
		d1.findElement(By.name("user_name")).sendKeys("admin");
		d1.findElement(By.name("user_password")).sendKeys("admin");
		d1.findElement(By.id("submitButton")).click();
		d1.findElement(By.xpath("//a[.='Organizations']")).click();
		List<WebElement> lst = d1.findElements(By.xpath("//a[@title='Organizations']"));
int count = lst.size();
System.out.println(count);
ArrayList<String> l1=new ArrayList<String>();
ArrayList<String> l2=new ArrayList<String>();
for( WebElement org: lst)
{
	String Text = org.getText();
	l1.add(Text);
	}
Collections.sort(l1);
System.out.println(l1);
d1.findElement(By.xpath("//table[@width='100%']/tbody/tr[1]/td[3]/a[@class='listFormHeaderLinks']")).click();
Thread.sleep(1000);
List<WebElement> lst1 = d1.findElements(By.xpath("//a[@title='Organizations']"));
for( WebElement org2:lst1){
	String Test1 = org2.getText();
	l2.add(Test1);		
}
System.out.println(l2);
Assert.assertEquals(l1, l2);
System.out.println("working");

	}
}
