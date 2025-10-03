package com.listeners;

import org.testng.IExecutionListener;

public class ExecutionListener implements IExecutionListener{

	@Override
	public void onExecutionStart() {
		// TODO Auto-generated method stub
//		IExecutionListener.super.onExecutionStart();
		System.out.println("Exec started");
	}

	@Override
	public void onExecutionFinish() {
		// TODO Auto-generated method stub
//		IExecutionListener.super.onExecutionFinish();
		System.out.println("Exec finished");
	}

}
