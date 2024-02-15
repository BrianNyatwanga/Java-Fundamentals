package com.Itbulls.nyatwanga.methods;

public class MathClassDemo {

	public static void main(String[] args) {
		System.out.println(Math.random());// between 0.0 and 1.0
	System.out.println(Math.random()* 100);//between 0 and 100
	System.out.println((int)(Math.random()* 100)); //int nos between 0 and 100
	System.out.println((int)(Math.random()*100)+ 100); //int between 100 and 200
	System.out.println((int)(Math.random()*10)+ 100);// int between 100 and 110 --start limit then starting point
	System.out.println(5/-0.0);// -Infinity
	System.out.println(5/ 0.0);//Infinity
	
	System.out.println(0 /0.0);//NaN -Not a Number
	System.out.println(Math.PI);//3.141592653589793
	
	System.out.println(Math.min(5.7, 6.6));
	System.out.println(Math.max(3.34343, 3.33233));//3.34343,
	System.out.println(Math.sqrt(-4.6));
	
	
	
	}

}
