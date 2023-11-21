package com.ParallelTest;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BaseMethods.BaseClass;


@Listeners(com.BaseMethods.ListnersClass.class)
public class ListenerTests extends BaseClass{
	
		@BeforeSuite
		private void BrowserLaunch() {
			browserLaunch("chrome");
			launchUrl("https://www.google.com/");
		}
			
		@Test
		private void InputValuesListen() {
			inputValues(driver.findElement(By.id("APjFqb")), "Christmas");
		}
		
		@AfterSuite
		private void validation() {
			Quit();
		}
	

}
