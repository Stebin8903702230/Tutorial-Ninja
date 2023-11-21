package com.BaseMethods;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTrialTest implements IRetryAnalyzer{
		int Count = 1;
		int Max = 2;
	@Override
	public boolean retry(ITestResult result) {
		if (Count<=Max)	{
			System.out.println(result.getTestName());
			System.out.println(result.getMethod().getMethodName());
			System.out.println(result.getMethod().getDate());
			System.out.println(result.getStartMillis());
			return true;
		}
return false;
	}

}
