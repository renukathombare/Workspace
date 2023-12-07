//Program for method overloading allowing developer to create multiple method overloading but eith different parameter
package Shubham.javaproject;
public class MethodOverloading {
public static int sum(int a,int b) {
		int c= a+b;
		return c;
	}
	public  static double sum(double x,double y, double z) {
		double s= x+y+z;
		return s;
	}
	public static int mul(int a,int b) {
		int c= a*b;
		return c;}
	public static double mul(double a,double b) {
		double c= a*b;
		return c;}
	

	public static void main(String[] args) {
		System.out.println("The sum is :"+ MethodOverloading.sum(4,5));
		System.out.println("The sum is :"+ MethodOverloading.sum(6.5,7.5,8.5));
		System.out.println("The Multiplication is : "+ MethodOverloading.mul(3, 4) );
		System.out.println("The Multiplication is : "+ MethodOverloading.mul(3.4, 5.3) );
		
	}

}