package com.app.java8;


//Functional Interface is the one which contains the only one abstract method...

@FunctionalInterface
public interface Functional_Interface {
	
	public void printMessage(String message);
	
	default void printDefaultMessage(String defaultMessage)
	{
		System.out.println("This is default message"+" "+defaultMessage);
	}
	
	static void printStaticMessage(String staticMessage)
	{
		System.out.println("This is static message"+" "+staticMessage);
	}
	

}
