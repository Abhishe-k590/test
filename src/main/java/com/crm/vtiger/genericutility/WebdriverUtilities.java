   package com.crm.vtiger.genericutility;
/**
 * 
 * contains Webdriver specific reusable utility
 * @ Abhishek
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtilities {

	/**
	 * 
	 * used to wait for expected element visibility in GUI
	 * 
	 * @param driver
	 * @param element
	 */

	public void Visibilityelement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, PathConstants.explicitelwait);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void elementtobeclickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, PathConstants.explicitelwait);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void dropdownselectbyvisibletext(WebElement element, String text) {
		/**
		 * 
		 * select the value from the dropDown based on Visible text
		 */

		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void dropdownselectbyvisibleIndex(WebElement element, int text) {
		/**
		 * 
		 * select the value from the dropDown based on index
		 */
		Select select = new Select(element);
		select.selectByIndex(text);
	}

	/**
	 * used to wait & click for expected element in GUI
	 * 
	 * @param element
	 * @throws Throwable
	 */
	public void waitAndClick(WebElement element) throws Throwable {
		int count = 0;
		while (count < 50) {
			try {
				element.click();
				break;
			} catch (Throwable e) {
				Thread.sleep(500);
				count++;
			}
		}
	}

	/**
	 * used to wait for expected element in GUI
	 * 
	 * @param element
	 * @throws Throwable
	 */
	public void waitforElement(WebElement element) throws Throwable {
		int count = 0;
		while (count < 40) {
			try {
				element.isDisplayed();
				break;
			} catch (Throwable e) {
				Thread.sleep(500);
				count++;
			}
		}
	}

	public void waitForPagetoLoad(WebDriver driver) {
		/**
		 * implicit wait
		 */
		driver.manage().timeouts().implicitlyWait(PathConstants.implicitelwait, TimeUnit.SECONDS);

	}

	public void switchToBrowser(WebDriver driver, String browserTitle) {
		/**
		 * used to switch to another browser window based on browser partial /
		 * complete title
		 */
		Set<String> set = driver.getWindowHandles();

		for (String act : set) {
			driver.switchTo().window(act);
			String actPageTile = driver.getTitle();
			if (actPageTile.contains(browserTitle)) {
				break;
			}
		}

	}

	public void accpetallert(WebDriver driver) {
		/**
		 * 
		 * used to Switch to Alert Popup & click on OK button
		 */
		driver.switchTo().alert().accept();
	}

	public void dismisallert(WebDriver driver) {
		/**
		 * used to Switch to Alert Popup & click on cancel button
		 */
		driver.switchTo().alert().dismiss();
	}

	public void movetoexoectedElement(WebDriver driver, WebElement element) {
		/**
		 * 
		 * used to take mouse cursor on expected element on the browser
		 */
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * to handel child popup
	 * @param driver
	 */
	
	public void switchtochildwindow1(WebDriver driver) {
		Set<String> winid = driver.getWindowHandles();
		Iterator<String> iterator = winid.iterator();
		String parentwin = iterator.next();
		String childwin = iterator.next();
		driver.switchTo().window(childwin);
	}

	public void switchtoparentwindow(WebDriver driver) {
		Set<String> winid = driver.getWindowHandles();
		Iterator<String> iterator = winid.iterator();
		String parentwin = iterator.next();
		driver.switchTo().window(parentwin);
	}
	
	public String takeScreenShot(WebDriver driver,String methodName) throws IOException {
	Java_utility java=new Java_utility();
	String date = java.getCurrentSystemDate();
	String date1 = date.replace(" ","_").replace(":", "_");
	EventFiringWebDriver scrnshot=new EventFiringWebDriver(BaseClasss.staticdriver);
	File src = scrnshot.getScreenshotAs(OutputType.FILE);
	String screenshotpath = System.getProperty("user.dir")+"./photos/"+methodName+".PNG";
	File dst = new File(screenshotpath);
	FileUtils.copyFile(src, dst);
	return screenshotpath;
	
	}
	
			
			
	}

