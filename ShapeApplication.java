package fundamentals;



import java.util.Scanner;

//Abstract class representing a geometric shape
abstract class Shape1 {
 // Common attributes for all shapes
 private String color;

 // Constructor for initializing the color of the shape
 public Shape1(String color) {
     this.color = color;
 }

 // Abstract method for calculating area, to be implemented by concrete shapes
 public abstract double calculateArea();

 // Getter for retrieving the color of the shape
 public String getColor() {
     return color;
 }

 // Display method to show information about the shape
 public void displayInfo() {
     System.out.println("Shape: " + this.getClass().getSimpleName());
     System.out.println("Color: " + color);
     System.out.println("Area: " + calculateArea());
 }
}

//Concrete class representing a Circle, extending the Shape class
class Circle1 extends Shape1 {
 private double radius;

 // Constructor for initializing the radius of the circle
 public Circle1(String color, double radius) {
     super(color);
     this.radius = radius;
 }

 // Implementation of the abstract method for calculating the area of the circle
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Concrete class representing a Rectangle, extending the Shape class
class Rectangle1 extends Shape {
 private double length;
 private double width;

 // Constructor for initializing the dimensions of the rectangle
 public Rectangle1(String color, double length, double width) {
     super(color);
     this.length = length;
     this.width = width;
 }

 // Implementation of the abstract method for calculating the area of the rectangle
 @Override
 public double calculateArea() {
     return length * width;
 }
}

public class ShapeApplication {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Create instances of Circle and Rectangle
     Circle1 circle = new Circle1("Red", 5.0);
     Rectangle1 rectangle = new Rectangle1("Blue", 4.0, 6.0);

     // Display information about the shapes
     System.out.println("Circle Details:");
     circle.displayInfo();

     System.out.println("\nRectangle Details:");
     rectangle.displayInfo();

     scanner.close();
 }
}

