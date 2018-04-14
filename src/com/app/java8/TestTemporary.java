package com.app.java8;

public class TestTemporary implements Functional_Interface
{

	@Override
	public void printMessage(String message) {
		System.out.println("This is method from implemented class which implements the Functional_Interface"+"="+message);
		
	}
	
}
