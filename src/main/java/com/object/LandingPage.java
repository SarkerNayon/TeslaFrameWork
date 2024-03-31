package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "dx-nav-item--vehicles")
	WebElement vehicle;
	@FindBy(xpath = "(//a[@href='/cybertruck/design'])[1]")
	WebElement cyberTruckOrder;

	public void vehicleHoverOver(WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(vehicle).build().perform();
		cyberTruckOrder.click();
//		CommonActions.hoverOver(driver,vehicle);
//		CommonActions.click(cyberTruckOrder);
	}


}
