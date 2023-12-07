//To perform a program for math calculation like max method, min method,roundup method 
//and absolute method using math classes

package Shubham.javaproject;
import java.util.*;
public class Mathoperations {
 static int max(int a, int b) {
	 return Math.max(a,b);
 }
 static int min(int a,int b) {
	 return Math.min(a,b) ;
 }
 static float round(float a) {
	 return Math.round(a);
 }
	public static void main(String[] args) {
		System.out.println("The maximum number :- "+max(4,5));
		System.out.println("The minimum number :- "+min(3,1));
		System.out.println("The roundedup number is:- "+round( (float) 4.5));
		

	}
	
	}


