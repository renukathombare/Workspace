//Program to Show Inheritance 
//Div A 10
package Shubham.javaproject;
import java.util.*;
public class Inheritance {
    static class employee {
		Scanner sc=new Scanner(System.in);
         static float salary =40000;
        int bonus = 10000;
    }

    static class programmer extends employee {
        int bonus = 50000;
    }
    static class tester extends employee {
        int bonus = 50000;
    }

    public static void main(String[] args) {
        programmer p = new programmer();

		System.out.println("The salary of employee is  " + employee.salary+"rs");
        System.out.println("The salary of programmer is " + employee.salary);
        System.out.println("The salary of tester is " + employee.salary);
        System.out.println("The Total Money received to tester would be "+(p.bonus+employee.salary+p.bonus));
        System.out.println("The Total Money received to programmer would be "+(p.bonus+employee.salary+p.bonus));
        
    }
}
