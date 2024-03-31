package com.placeAnOrderTest;

import org.testng.annotations.Test;
import com.base.BaseClass;


public class CyberTruck extends BaseClass{
	
	@Test
	private void cyberTruckTest() {
		landingPage.vehicleHoverOver(driver);
		orderPage.orderPage();
	}

}
