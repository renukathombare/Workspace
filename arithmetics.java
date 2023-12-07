//write a program for Arithmatic operations using arithmatic promotion.
package Shubham.javaproject;
import java.util.*;
public class arithmetics {

	public arithmetics() {	
	}
	public static void main(String[] args) {
		System.out.println("let us do arithmetic operations");	
  System.out.println("Enter two number");
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int add=a+b;
  System.out.println("Addition is:- " + add);
  int sub=a-b;
  System.out.println("Substraction is :- "+ sub);
  int div=a/b;
  System.out.println("Division is :- "+ div);
  int mul=a*b;
  System.out.println("Multiplication :-  "+mul);
  int modulodiv=a%b;
  System.out.println("Modulus didvision is :- "+modulodiv);
  
  

	}

}