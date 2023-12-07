package Shubham.javaproject;

public class perimeter {
	static double Perimeter_c(int r)
	{
		return(2*3.24*r);}
	static double perimeter_r(int l,int b)
	{
		return(2*(l=b));}
	static double perimeter_t(int a,int b, int c)
	{
		return(a+b+c);
	}
	static double perimeter_s(int s)
	{
		return(4*s);
	}
	public static void main(String[] args) {
		System.out.println("Perimeter of circle is   ="+perimeter.Perimeter_c(3)+" cm");
		System.out.println("Perimeter of rectangle is  ="+perimeter.perimeter_r(3,4)+" cm");
		System.out.println("perimeter of triangle is ="+ perimeter.perimeter_t(1,2,3)+" cm");
		System.out.println("perimeter of squareis = " + perimeter. perimeter_s(4)+" cm");
	}

}
