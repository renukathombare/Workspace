package Shubham.javaproject;
import java.util.*;


public class Area {
	static double Area_c(int a)
	{
		return(3.14*a*a);}
	static double Area_r(int a,int b)
	{
		return(a*b);}
	static double Area_t(int a,int b)
	{
		return(a*b/2);
	}
	public static void main(String[] args) {
		
		System.out.println("Area of circle ="+Area.Area_c(6)+ " sq.unit");
		System.out.println("Area of rectangle="+Area.Area_r(4, 4)+ " sq.unit");
		System.out.println("Area of triangle="+Area.Area_t(6,3)+ " sq.unit");
		
	}

}
