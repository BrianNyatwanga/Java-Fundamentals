package com.Itbulls.operators;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {
	public static void main(String[] args) {
		System.out.println();
		//strings are immutable
		String s = "hello";
		System.out.println("===STRING MANIPULATION====");
		
		System.out.println("s.length(): " + s.length()); //LENGTH OF STRING
		System.out.println("s.contains(\"he\"):" + s.contains("el"));// SEARCHING IN A STRING
		System.out.println("s.isEmpty: " + s.isEmpty());//CHECKING EMPTY STRING
		//toUppercase
		System.out.println("s.toUpperCase: " + s.toUpperCase());
		//startsWith
		System.out.println("s.startsWith: " + s.startsWith("h"));
		//endsWith
		System.out.println("s.endsWith: " + s.endsWith("o"));
		//replace("old", "new")
		System.out.println("s.replace \"ll\", \"LL\":" + s.replace("ll", "LL"));
		//trim()
		System.out.println("s.trim(): " + s.trim());
		System.out.println("s.strip():" + s.strip());
		//
		System.out.println("s.substring(0, 3):" + s.substring(0, 3));
		
		System.out.println();
		System.out.println("====ARRAYS=====");
		//WORKING WITH ARRAYS
		
		System.out.println("Arrays.toString(s.getBytes()):" + Arrays.toString(s.getBytes())); 
		System.out.println("Arrays.toString(s.toCharArray()):" + Arrays.toString(s.toCharArray()));
		System.out.println("Arrays.toString(s.split(\"e\")):" + Arrays.toString(s.split("e")) ); 
		System.out.println("");
		System.out.println("=====STRING COMPARISON====");
		
		String s2 = "hello";
		System.out.println("s == s2: " + (s ==s2) );
		
		String s3 = new String(" hello ");
		System.out.println("s == s3 :" + (s == s3));
		//equals() Method
		System.out.println("s.equals(s3) :" + s.equals(s3));
		//intern() compares strings in the string pool
		System.out.println("s == s3.intern() :" + (s == s3.intern()));
		
		System.out.println();
		
		String firstName = "Brian";
		String firstName2 = "briAn";
		System.out.println("firstName.equals(firstName2) :" + firstName.equals(firstName2));
		//IgnoreCase
		System.out.println("firstName.equalsIgnoreCase(firstName2) :" + firstName.equalsIgnoreCase(firstName2));
		System.out.println();
		System.out.println("===EXCAPE SEQUENCES===");
		
		System.out.println("My favourite book is: \t \"The 40 Laws of Power\" \n\t\t\t  by Robert Green");
		System.out.println("Path to Local Disk C:\\Home\\Of\\Champions");
		
		System.out.println();
		
		
		/*EXCAPE SEQUENCES
		 *   \t - tab
		 *   \b - backspace
		 *   \n - New Line
		 *   \r - carriage return. ()
		 *   \f - form feed
		 *   \' - Single quote
		 *   \" - Double quote
		 *   \\ - Backslash 
		 *   \u00a9 - UniCode value ie \u00A9
		 *    
		 */
		//STRING FORMATTING
		System.out.println("===STRING FORMATTING===");
		String greetingsTemplate = "Hello, dear %s! Good %s!";
		String morning = "morning";
		String afternoon = "afternoon";
		String evening = "evening";
		
		String formattedString = String.format(greetingsTemplate, firstName, morning);
		System.out.println(formattedString);
		
		System.out.printf("You have %d computers available at the store\n",2);
		
		System.out.println();
		
		//REGULAR EXPRESSIONS
		System.out.println("===Regular Expressions===");
		String gmailPattern = "[a-zA-Z-\\d]+@gmail\\.com";
		Pattern p = Pattern.compile(gmailPattern);
		String sampleText = "Some random text that contains gmail addresses" + 
		"like this one some-email@gmail.com. And some other random text." + "someofchampions@gmail.com";
		Matcher m = p.matcher(sampleText);
		
		m.find();
		String gmailAddress = m.group();
		System.out.println(gmailAddress);
		
		String sampleText2 = "There are three sentences in this String. Are you sure? Yes!";
		String[] sentences = sampleText2.split("[\\.!?]");
		System.out.println(Arrays.toString(sentences)); 
		
		System.out.println(1499*168);
		
		
		
		 
		
		
	
	}

}
