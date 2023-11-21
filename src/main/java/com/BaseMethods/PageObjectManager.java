package com.BaseMethods;

import org.openqa.selenium.support.PageFactory;

public class PageObjectManager extends BaseClass{
	
	public PageObjectManager() {
		PageFactory.initElements(driver, this);
	}
	
	public QAFoxNinja getNinja() {
		QAFoxNinja WebElemnts = new QAFoxNinja();
		return WebElemnts;
	}
}
