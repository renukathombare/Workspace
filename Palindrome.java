   
//Program  accept number from user and check whether the number is prime or not
package Shubham.javaproject;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		 int r, sum = 0, temp;
		 System.out.println("Enter number to check Palindrome or not");
	        int n =sc.nextInt(); 
	        temp = n;
	        while (n > 0) {
	            r = n % 10; 
	            sum = (sum * 10) + r;
	            n = n / 10;
	        }
	        if (temp == sum)
	            System.out.println("palindrome number");
	        else
	            System.out.println("not palindrome");

	}

}
