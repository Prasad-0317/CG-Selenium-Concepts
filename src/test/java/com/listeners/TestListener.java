package com.listeners;

import org.testng.ITestListener;
// iTestResult capturing runtime result , it is interface in testng
import org.testng.ITestResult;

public class TestListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestStart(result);
		String testname = result.getName();
		System.out.println(testname + " test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSuccess(result);
		String testname = result.getName();
		System.out.println(testname + " test successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailure(result);
		String testname = result.getName();
		System.out.println(testname + " test failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestSkipped(result);
		String testname = result.getName();
		System.out.println(testname + " test skipped");
		
	}

}
