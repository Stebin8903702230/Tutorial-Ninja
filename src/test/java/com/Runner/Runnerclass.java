package com.Runner;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.BaseMethods.BaseClass;
import com.BaseMethods.ExcelDataPre;
import com.BaseMethods.PageObjectManager;

public class Runnerclass extends BaseClass{
	PageObjectManager pom= new PageObjectManager();
	@Test(priority = 1)
	private void browserLaunch() {
		browserLaunch("chrome");
	}
	
	@Test(priority = 2)
	private void Url() {
		launchUrl("https://tutorialsninja.com/demo/index.php?route=account/register");
	}
	
	@Test(priority = 3, dataProvider = "data",dataProviderClass = ExcelDataPre.class)
	private void InputDataByDataDriven(String input[]) {
		clickOneWebelement(pom.getNinja().getFirstname());
		inputValuesSeq(pom.getNinja().getFirstname(), input[0]);
		inputValuesSeq(pom.getNinja().getLastname(), input[1]);
		inputValuesSeq(pom.getNinja().getEmail(), input[2]);
		inputValuesSeq(pom.getNinja().getTelephone(), input[3]);
		javaScript("down");
		staticWait(2000);
	}
	
	@Parameters("td001")
	@Test(priority = 4)
		private void InputDataByParameterThroughXML(String Password) {
		inputValues(pom.getNinja().getPassword(), Password);
		inputValues(pom.getNinja().getConfirm(), Password);

		clickOneWebelement(pom.getNinja().getAgree());
		clickOneWebelement(pom.getNinja().getContinue());
		staticWait(1000);
		Quit();
	}
}
