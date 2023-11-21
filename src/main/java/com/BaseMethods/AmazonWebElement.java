package com.BaseMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonWebElement extends BaseClass{
	
	public AmazonWebElement() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "twotabsearchtextbox" )
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}
}
