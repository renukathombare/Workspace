//To perform a program to illustrate different constructor and method using string classes
//1.Length 
//2.Uppercase and Lowercase
//3.Equality
//4.Concatenation
//5.Substring
package Shubham.javaproject;
import java.util.*;
public class Stringmanipulation {
  
	public static void main(String[] args) {
		System.out.println("Enter any String");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("The lenth of the sting is:- "+ str.length());
		System.out.println("The uppercase version is "+ str.toUpperCase());
		System.out.println("The Lowercase Version is  "+ str.toLowerCase());
		System.out.println("The Eqaulity operaton is "+ str.equals("abcd"));
		System.out.println("The Concatenation is "+str.concat(" Sir"));
		System.out.println("The Substring attached is "+ str.substring(5));
		
		
		

	}

}
