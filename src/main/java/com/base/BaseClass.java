package com.base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.object.LandingPage;
import com.object.OrderPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected WebDriver driver;
	protected LandingPage landingPage;
	protected OrderPage orderPage;

	@BeforeMethod
	public void OpenBrowser() {
//		System.setProperty("webdriver.chrome.driver",
//				"/Users/sarker/eclipse-workspace/TeslaFrameWork/Driver/chromedriver");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.tesla.com");
		init();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

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
