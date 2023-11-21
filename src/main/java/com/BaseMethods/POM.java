package com.BaseMethods;

import org.openqa.selenium.support.PageFactory;

public class POM extends BaseClass{
	public POM() {
		PageFactory.initElements(driver, this);
	}
	
	private AmazonWebElement amazonHome;
	
	public AmazonWebElement getAmazonHome() {
		amazonHome = new AmazonWebElement();
		return amazonHome;
	}


}
