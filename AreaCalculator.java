import java.util.Scanner;

public class AreaCalculator {
public static void main(String[] args) {
// Create a scanner object for input
Scanner scanner = new Scanner(System.in);

// Display menu options
System.out.println("Menu:");
System.out.println("1. Area of Triangle");
System.out.println("2. Area of Rectangle");
System.out.println("3. Area of Square");
System.out.println("4. Area of Circle");
System.out.print("Enter your choice (1-4): ");

// Get the user's choice
int choice = scanner.nextInt();

// Variable to store the area result
double area;

// Switch statement to calculate area based on user choice

switch (choice) {
case 1:
// Area of Triangle = 0.5 * base * height
System.out.print("Enter base of the triangle: ");
double base = scanner.nextDouble();
System.out.print("Enter height of the triangle: ");
double height = scanner.nextDouble();
area = 0.5 * base * height;
System.out.printf("Area of Triangle: %.2f\n", area);
break;

case 2:
// Area of Rectangle = length * width
System.out.print("Enter length of the rectangle: ");
double length = scanner.nextDouble();
System.out.print("Enter width of the rectangle: ");
double width = scanner.nextDouble();
area = length * width;
System.out.printf("Area of Rectangle: %.2f\n", area);
break;

case 3:
// Area of Square = side * side
System.out.print("Enter side of the square: ");
double side = scanner.nextDouble();
area = side * side;
System.out.printf("Area of Square: %.2f\n", area);
break;

case 4:
// Area of Circle = π * radius * radius

System.out.print("Enter radius of the circle: ");
double radius = scanner.nextDouble();
area = Math.PI * radius * radius;
System.out.printf("Area of Circle: %.2f\n", area);
break;

default:
System.out.println("Invalid choice! Please enter a number between 1 and 4.");
}

// Close the scanner
scanner.close();
}
}