package com.Itbulls.nyatwanga;

import java.util.Arrays;

/**
 * 
 * Hello world project
 * 
 * @author Brian Nyatwanga
 *
 */
public class HelloWorld {

	/**
	 * The entry point to the program
	 * 
	 * @param args input arguments
	 */
	public static void main(String[] args) {
		/* NUMBER SYSTEMS
		 * int dec = 152; int bin = 0b10011000; int oct = 0230; int hex = 0xACDC ;
		 * System.out.println(dec); System.out.println(bin); System.out.println(oct);
		 * System.out.println(hex);*/
		 
		
      int[] arr;
      int arr2[];
      arr = new int[10];
      //System.out.println(arr[0]);
      double[] arr3 = new double[10];
      //System.out.println(arr3[0]);
      boolean[] arr4 = new boolean[10];
      //System.out.println(arr4[0]);
      //System.out.println(arr4[9]);
      int[] arr5 = {3, 2, 1};
      //System.out.println(arr5[0]);
      int [][] matrix = {
    		  {1, 2, 3},
    		  {4, 5, 6},
    		  {7, 8, 9}
      };
      //System.out.println(matrix[2][2]);
      int[][] matrix2 = new int[10][10];//specifying array size
      //   System.out.println(matrix2[0]);
      System.out.println(Arrays.toString(arr5));
      Arrays.sort(arr5);
      System.out.println(Arrays.toString(arr5));
      
	
try {
  int[] myNumbers = {1, 2, 3};
  System.out.println(myNumbers[10]);
} 
catch
 (Exception e) {
  System.out.println("Something went wrong.");
}

/*
 * char myVar1 = 66, myVar2 = 82, myVar3 = 73, var4 = 65, var5 = 78;
 * System.out.println(myVar1); System.out.println(myVar2);
 * System.out.println(myVar3); System.out.println(var4);
 * System.out.println(var5);
 */

char myVar1 = 80, myVar2 = 82, myVar3 = 73, var4 = 83, var5 = 83, var6 = 89;
System.out.println(myVar1);
System.out.println(myVar2);
System.out.println(myVar3);
System.out.println(var4);
System.out.println(var5);
System.out.println(var6);

}}
