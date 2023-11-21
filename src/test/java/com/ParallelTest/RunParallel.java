package com.ParallelTest;

import org.testng.annotations.Test;

import com.BaseMethods.BaseClass;

public class RunParallel extends BaseClass{
	@Test
	private void BrowserLaunch() {
		browserLaunch("chrome");
	}
	@Test(dependsOnMethods =  "BrowserLaunch")
	private void Launch_Url() {
		launchUrl("https://www.amazon.in/");
	}
	@Test(dependsOnMethods =  "Launch_Url")
	private void QuitBrowser() {
		staticWait(2000);
		Quit();
	}
}
