package com.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import com.reporting.JavaLog;

public class CommonActions {

	public static void click(WebElement element) {
		try {
			element.click();
			JavaLog.log(element+" --> element is clicked");
		} catch (Exception e) {
			JavaLog.log(element+" --> element not is clicked");
			Assert.fail();
		}
		
	}
	public static void hoverOver(WebDriver driver,WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	
}
