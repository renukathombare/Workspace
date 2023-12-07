package Shubham.javaproject;
public class DefaultParameter {
  String firstName;
  String lastName;
  int age;

  DefaultParameter() {

  
  }
  
  public static void main(String args[]) {
      DefaultParameter myStudent = new DefaultParameter();
      
      myStudent.firstName = "shubham";
      myStudent.lastName = "kadu";
      myStudent.age = 21;
      
      System.out.println("Age is "+myStudent.age);
     
      System.out.println("last name is "+myStudent.lastName);
      System.out.println("first Name is "+myStudent.firstName);
    
  }
}