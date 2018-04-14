package com.app.java8;

public class FunctionalInterfaceTest {
	
	public static void main(String[] args) {
		
	/*	Runnable r = ()-> System.out.println("This is run method"); 
		r.run();*/
	
		//This way is used only when we require to use this instance very rare almost one in enough..
		Functional_Interface f = (s)-> System.out.println("This is functional interface print message"+"="+s);
		f.printMessage("Hi lambda..");
		
		
		TestTemporary t = new TestTemporary();
		t.printMessage("Vijay123");
	}

}
