//Program  accept number from user and check whether the number is prime or not
package Shubham.javaproject;
import java.util.Scanner;
public class Primeornot {
	public static void main(String[] args) {
		System.out.println("Enter Number To Check whether Prime Or Not");
		Scanner sc=new Scanner(System.in);
	
			  int num = sc.nextInt();
			    boolean flag = false;
			    for (int i = 2; i <= num / 2; ++i)
			      if (num % i == 0) {
			        flag = true;
			        break;
			      }

			    if (!flag)
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
			  }
			}

	


