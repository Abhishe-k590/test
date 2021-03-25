package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Rapid {
	@Test
	public void Adddata() throws Throwable
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
		 String name = gestdata();
		d1.findElement(By.xpath("//input [@name='accountname']")).sendKeys(name+randomInt);
	}


public String gestdata() throws Throwable
{
	String f = System.getProperty("user.dir");
	FileInputStream fis=new FileInputStream(f+"/File/testdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet("sheet2");
	Row R = sh.getRow(0);
	Cell c = R.getCell(0);
	String value = c.getStringCellValue();
	return value;
	
}
}
