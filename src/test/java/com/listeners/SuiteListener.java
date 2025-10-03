package com.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListener implements ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		System.out.println("suite started");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("suite ended");
	}
	

}
