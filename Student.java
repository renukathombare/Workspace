//program to declare class with a data,roll no ,name,marks and diff constructors

package Shubham.javaproject;

public class Student {
	int rollno;
	String name;
	float marks;
	Student(int rn,String n, float m){
		rollno=rn;
		name=n;
		marks=m;
	}
void display()
{
	System.out.println("Details of Student");
	System.out.println("Roll no  :- " + rollno);
    System.out.println( "Name of Student is "+ name);
    System.out.println("Marks of the Student "+marks+" percentage");}
	public static void main(String[] args) {
		Student s1=new Student(10,"Shubham", 99);
		Student s2=new Student(2,"Sudarshan",98);
		s1.display();
		s2.display();
	}

}
