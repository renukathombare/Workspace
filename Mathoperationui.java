//To perform a program for math calculation like max method, min method,roundup method 
//and absolute method using math classes
package Shubham.javaproject;
import java.util.*;
public class Mathoperationui {
	static int max() {
		System.out.println("Enter 2 numbers to choose Maximum");
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		 return Math.max(a1,b1);
	 }
	 static int min() {
		 System.out.println("Enter 2 numbers to choose Minimum");
		 Scanner sca=new Scanner(System.in);
			int a1=sca.nextInt();
			int b1=sca.nextInt();
		 return Math.min(a1,b1) ;
	 }
	 static float round() {
		 System.out.println("Enter number  to Rounup");
		 Scanner sa=new Scanner(System.in);
		 float a=sa.nextFloat();
		 return Math.round(a);
	 }
		public static void main(String[] args) {
			System.out.println("The maximum number :- "+max());
			System.out.println("The minimum number :- "+min());
			System.out.println("The roundedup number is:- "+round());
			

		}
		
		}
