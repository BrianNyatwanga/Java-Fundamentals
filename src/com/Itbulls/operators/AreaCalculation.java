package com.Itbulls.operators;

import java.util.Scanner;

public class AreaCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Input Stream
		System.out.println("This program will calculate area of a Triangle:");
		System.out.println("Please enter A side of the triangle:");
		double aSide = sc.nextDouble();
		
		System.out.println("Please enter B side of the triangle:");
		double bSide = sc.nextDouble();
		
		System.out.println("Please enter C side of the triangle:");
		double cSide = sc.nextDouble();
		
		double p = (aSide + bSide + cSide) / 2;
		double triangleArea = Math.sqrt(p * (p - aSide)*(p - bSide)*(p - cSide));
		
		System.out.println( "Triangle area is :" + triangleArea);
		
	}

}
      