//Program to accept number from user and calculate the factorial of given number
package Shubham.javaproject;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter number to find Factorial");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
        
            factorial *= i;
        }
        System.out.println("Factorial is - "+ factorial);
	}}