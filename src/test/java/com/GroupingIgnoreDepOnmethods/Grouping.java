package com.GroupingIgnoreDepOnmethods;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.BaseMethods.BaseClass;

public class Grouping extends BaseClass{

	@BeforeTest(groups = "Chrome")						//(groups = {"Include Browser"})
	private void BrowserLaunch() {
		browserLaunch("chrome");
	}
	@Test
	private void Caunch_Url() {
		launchUrl("https://www.amazon.in/");
	}
	
	@Test
	private void InputValues() {
		inputValues(driver.findElement(By.id("twotabsearchtextbox")), "Mobiles");
	}
	
	@AfterTest()
	private void Exit() {
		staticWait(2000);
		Quit();
	}
}
