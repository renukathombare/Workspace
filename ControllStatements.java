//Program on controll statement
//program to accept 3 nums and find the largest number from them
//Program to accept number from user and calculate the factorial of given number
//program to accept number from user and check whether the number is palindrome or not
//Program  accept number from user and check whether the number is prime or not
package Shubham.javaproject;
import java.util.*;
public class ControllStatements {
	public static void main(String[] args) {
		System.out.println("Enter 3 Numbers to check which one if Largest");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("You Have Entered "+a+" "+b+" "+c+" ");
		if(a>b) {
			System.out.println(a+" is Greatest");
		}
		else if(b>c) {
			System.out.println(b+" is Greatest");
		}
		else {
			System.out.println(c+" is Greatest");
		}
		
	
	}

}
