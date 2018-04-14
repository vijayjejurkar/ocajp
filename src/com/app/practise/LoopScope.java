package com.app.practise;

import java.time.LocalTime;

public class LoopScope {

	public static void main(String[] args) {
/*	//1
		int sum = 0;
		for(int i=0; i<=100; i++)
			sum += i;
		System.out.println("Value of i is"+i);
		
		//compilation error @ line 9
		
		
		//2
		try {
		Double number = Double.valueOf("120D");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(number);*/
	
	//3
		int sum = 100;
		System.out.println(sum>10? ">" : sum<10 ? "<" : "=");
		
	//4
		StringBuilder sb = new StringBuilder("1Z0");
		sb.append("-808");
		System.out.println(sb);
		
		
	//5
		System.out.println(LocalTime.now());
	}
	

}
