package Inheritance;

//Write programm to declare class shape then calculate area of circle, rectangle, square, triangle using constructor overloading
import java.util.*;

class Shape1 {
  double area;

  // Constructor for Circle
  Shape1(double radius) {
      area = 3.14 * radius *radius;
  }

  // Constructor for Rectangle
  Shape1(double length, double width) {
      area = length * width;
  }

  // Constructor for Square
  void Shape(double side) {
      area = Math.pow(side, 2);
  }

  // Constructor for Triangle
  Shape1(double base, double height, String shapeType) {
      if (shapeType.equalsIgnoreCase("triangle")) {
          area = 0.5 * base * height;
      } else {
          System.out.println("Invalid shape type for this constructor.");
      }
  }

  public double getArea() {
      return area;
  }
}

class Start{
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Circle
      System.out.print("Enter the radius of the circle: ");
      double radius = scanner.nextDouble();
      Shape1 circle = new Shape1(radius);
      System.out.println("Area of the circle: " + circle.getArea());

      // Rectangle
      System.out.print("Enter the length of the rectangle: ");
      double length = scanner.nextDouble();
      System.out.print("Enter the width of the rectangle: ");
      double width = scanner.nextDouble();
      Shape1 rectangle = new Shape1(length, width);
      System.out.println("Area of the rectangle: " + rectangle.getArea());

      // Square
      System.out.print("Enter the side length of the square: ");
      double side = scanner.nextDouble();
      Shape1 square = new Shape1(side);
      System.out.println("Area of the square: " + square.getArea());

      // Triangle
      System.out.print("Enter the base length of the triangle: ");
      double base = scanner.nextDouble();
      System.out.print("Enter the height of the triangle: ");
      double height = scanner.nextDouble();
      Shape1 triangle = new Shape1(base, height, "triangle");
      System.out.println("Area of the triangle: " + triangle.getArea());

      scanner.close();
  }
}
