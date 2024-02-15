package methods.hw;


import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Please, enter integer numbers separated by space: ");
			String numbers = sc.nextLine();
			
			int[] intArray = convertStringArrayToIntArrayStreamApi(numbers.split("\\s+"));
			
			//int maxInt = findMaxIntInArray(intArray);
			
			int maxInt = findMaxIntInArrayStreamApi(intArray);
			System.out.println("*** Initial Array ***");
			
			System.out.println(Arrays.toString(intArray));
			System.out.println("*** Max number in array ***");
			System.out.println(maxInt);
		}
	}
	//MAX INT METHOD
	public static int findMaxIntInArray(int[] intArray) {
		int max = intArray[0];
		for (int i : intArray) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
	
	//CONVERTING STRINGARRAY TO INT ARRAY

	private static int[] convertStringArrayToIntArray(String[] stringArray) {
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.valueOf(stringArray[i]);
		}
		return intArray;
	}
	
	// ====================== SOLUTION WITH STREAM API
	
	public static int findMaxIntInArrayStreamApi(int[] intArray) {
		return Arrays.stream(intArray).max().getAsInt();
	}

	
	private static int[] convertStringArrayToIntArrayStreamApi(String[] stringArray) {
		return Arrays.stream(stringArray)
				.mapToInt(s -> Integer.valueOf(s))
				.toArray();
	}

}
