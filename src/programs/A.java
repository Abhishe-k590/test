package programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwaree/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(WebElement we:links)
		{
			String text = we.getText();
			System.out.println(text);
		}
	}

}
