package com.Itbulls.nyatwanga.methods.javamemorymodel;

import java.util.Arrays;

public class Memory {
	public static void main(String[] args) {
	Integer i1 = 128;
	Integer i2 = 128;
	System.out.println("is i1 == i2:" + (i1 == i2));
	
	
	//WAY OF COMPARING IN STACK passing int value via object
	System.out.println("i1.equals(i2):" + i1.equals(i2));
	
	//REFERENCE STORED IN STACK
	Integer i3 = 127;
	Integer i4 = 127;
	System.out.println("is i3 == i4:" + (i3 == i4));
	//Deprecated way of assigning variables
	Integer i5 = new Integer(127);
	Integer i6 = new Integer(127);
	System.out.println("is i5 == i6:" + (i5 == i6));
	
	//Referencing to the same space---BETTER SPACE USAGE--STORED IN HEAP
	Integer i7 = Integer.valueOf(127);
	Integer i8 = Integer.valueOf(127);
	System.out.println("is i7 == i8:" + (i7 == i8));
	//ARRAYS
	int[] arr1 = {1,2,3};
	int[] arr2 = {1,2,3};
	
	System.out.println("arr1 == arr2:" + (arr1 == arr2));
	
	//.equals ONLY WORKS FOR INT NOT ARRAY
	System.out.println("arr1.equals(arr2):" + (arr1.equals(arr2)));
	
	//USE Arrays.equals(a , b)
	System.out.println("Arrays.equals(arr1, arr2):" + Arrays.equals(arr1, arr2));
	
	//POINTING TO SAME VALUE IN HEAP
	arr1 = arr2;
	System.out.println(arr1 == arr2);
	
	
	
	
}}
