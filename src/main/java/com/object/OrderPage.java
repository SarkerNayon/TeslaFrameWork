package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.common.CommonActions.*;

public class OrderPage {
	
	public OrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Order with Card']")
	WebElement payWithCard;
	
	public void orderPage() {
		click(payWithCard);
	}
}
