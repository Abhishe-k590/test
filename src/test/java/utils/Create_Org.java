package utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Create_Org {
	@Test
	public void checkdata() throws AWTException, Throwable 
	{
		WebDriver d1=new FirefoxDriver();
		d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d1.get("http://localhost:8888");
		d1.findElement(By.name("user_name")).sendKeys("admin");
		d1.findElement(By.name("user_password")).sendKeys("admin");
		d1.findElement(By.id("submitButton")).click();
		d1.findElement(By.xpath("//a[.='Organizations']")).click();
		d1.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		Random random=new Random();
		int randomInt = random.nextInt(1000);
	
		d1.findElement(By.xpath("//input [@name='accountname']")).sendKeys("qspi"+randomInt);
		d1.findElement(By.id("phone")).sendKeys("9110411849");
		
		d1.findElement(By.xpath("//img[@title='Select']")).click();
		String prtid = d1.getWindowHandle();
		Set<String> all = d1.getWindowHandles();
		all.remove(prtid);
		for(String s :all){
		d1.switchTo().window(s);
		}

		d1.findElement(By.xpath("//input[@class='txtBox']")).sendKeys("abc");
		d1.findElement(By.xpath("//input[@class='crmbutton small create']")).click();
		d1.findElement(By.xpath("//a[.='abc']")).click();
		Alert a=d1.switchTo().alert();
		a.accept();
		d1.switchTo().window(prtid);
		
		WebElement ele = d1.findElement(By.xpath("//select[@name='industry']"));
		ele.click();
		Select s=new Select(ele);
		s.selectByValue("Banking");
		
		WebElement ele2 = d1.findElement(By.name("accounttype"));
		ele2.click();
		Select s1=new Select(ele2);
		s1.selectByValue("Analyst");
		
		WebElement ele3 = d1.findElement(By.name("rating"));
		ele3.click();
		Select s2=new Select(ele3);
		s2.selectByValue("Acquired");
		 d1.findElement(By.name("button")).click();
		 Thread.sleep(5000);
		 d1.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		
		 d1.findElement(By.name("search_text")).sendKeys("abc");
		WebElement ele4 = d1.findElement(By.id("bas_searchfield"));
		 Select s4=new Select(ele4);
		 s4.selectByValue("accountname");
		 d1.findElement(By.name("submit")).click();
	
		
		
	}

}
