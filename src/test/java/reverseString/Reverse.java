package reverseString;

import java.util.Scanner;

public class Reverse 
{
	public static void main(String[] args) 
	{
		
		/*
		String str = "      Umesh      ";
		System.out.println("Size of the String Before Trimming:"+str.length());
		
		String var = str.trim();
		System.out.println("After Trimming the String is:"+var.length());
		System.out.println(var);
		
		String s1 = "Umesh";
		String s2 = "Kumar";
		String s3 = "Kavali";
		
		System.out.println(s1+" "+s2+" "+s3);
		String stri = "Welcome";
		char ref=stri.charAt(3);
		System.out.println(ref);
		
		String rep = "Welcome to Java Sessions";
		System.out.println(rep.replace("Java", "Python"));
		
		String start = rep.substring(0,3);
		System.out.println(start);
		
		
		String email = "umeshk@outlook.in";
		String[] two = email.split("@");
		System.out.println(two[0]);
		System.out.println(two[1]);
		
		
		String before = "$95,69,36"; // 956936
		System.out.println("Before Replacing:"+before);
		String after = before.replace("$", "").replace(",", "");
		System.out.println("After Replacing:"+after);
		
		
		
		StringBuffer actual_string = new StringBuffer("Welcome");
		
		StringBuffer var = actual_string.reverse();
		System.out.println(var);
		
		
		*/
		
		StringBuilder actual_string = new StringBuilder("Welcome to Subodh");
		System.out.println(actual_string.reverse());
		
		// String is a Immutable
		/*
		
		String s= "Welcome";
		s.concat("to Java");
		
		System.out.println(s); // This will never ipact the original Value
		
		*/
		
		// String Builder and String Buffer is a Mutable
		
		StringBuffer s = new StringBuffer("Welcome");
		s.append("to Selenium Sessions");
		System.out.println(s);
		
		
		
		
		
	}
}
