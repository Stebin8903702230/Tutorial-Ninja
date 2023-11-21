package com.BaseMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAFoxNinja extends BaseClass{
	
	public QAFoxNinja() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "input-firstname" )
	private WebElement firstname;
	
	@FindBy(id = "input-lastname" )
	private WebElement lastname;
	
	@FindBy(id = "input-email" )
	private WebElement email;
	
	@FindBy(id = "input-telephone" )
	private WebElement telephone;
	
	@FindBy(id = "input-password" )
	private WebElement password;
	
	@FindBy(id = "input-confirm" )
	private WebElement confirm;
	
	@FindBy(name = "agree" )
	private WebElement agree;
	
	@FindBy(xpath = "//input[@value='Continue']" )
	private WebElement Continue;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getTelephone() {
		return telephone;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getContinue() {
		return Continue;
	}
	
//	@FindBy(id = "input-firstname" )
//	private WebElement firstname;
}
