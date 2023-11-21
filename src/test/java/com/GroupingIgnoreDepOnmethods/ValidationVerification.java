package com.GroupingIgnoreDepOnmethods;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BaseMethods.BaseClass;
import com.BaseMethods.RetryTrialTest;
@Listeners(com.BaseMethods.ListnersClass.class)
public class ValidationVerification extends BaseClass{
	@BeforeSuite
	private void BrowserLaunch() {
		browserLaunch("chrome");
		launchUrl("https://www.amazon.in/");
	}
	
	@Ignore		// @Test(enabled = false)---Used at any Annotation // While @Ignore only in @Test
	@Test(dependsOnMethods =  "Launch_Url")
	private void InputValues() {
		inputValues(driver.findElement(By.id("twotabsearchtextbox")), "Mobiles");
	}
	@Ignore
	@Test(dependsOnMethods =  "Launch_Url", retryAnalyzer = RetryTrialTest.class)
	private void InputValuesTrial() {
		inputValues(driver.findElement(By.id("twotabsearchtextbox")), "Mobiles");
	}
	
	@Test()
	private void InputValuesListen() {
		inputValues(driver.findElement(By.id("twotabsearchtextbox")), "Mobiles");
	}
	
	@AfterSuite
	private void validation() {
//		String actual = getCurrentTitle();
//		System.out.println(actual);
//		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
//		Assert.assertEquals(expected, actual);
//		SoftAssert soft =  new SoftAssert();
//		soft.assertEquals(expected, actual);
		staticWait(2000);
		Quit();
	}
}
