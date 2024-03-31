package com.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.object.LandingPage;
import com.object.OrderPage;

public class BaseClass {
	protected WebDriver driver;
	protected LandingPage landingPage;
	protected OrderPage orderPage;

	@BeforeMethod
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/TeslaFrameWork/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.tesla.com");
		init();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	public void init() {
		landingPage = new LandingPage(driver);
		orderPage = new OrderPage(driver);

	}

	@AfterMethod
	public void closingBrowser() {
		driver.quit();
	}

}
