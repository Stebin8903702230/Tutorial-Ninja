package com.BaseMethods;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersClass extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result);
			System.out.println("On Test Start"+result.getTestName().length());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result);

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result);

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result);

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println(result);

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context);
		System.out.println(context.getName().length());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context);

	}

}
