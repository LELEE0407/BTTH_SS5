package BT3;
import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the color of the triangle: ");
        String color = scanner.nextLine();

        System.out.print("Is the triangle filled (true/false): ");
        boolean filled = scanner.nextBoolean();

        System.out.print("Enter the length of side1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side3: ");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("Triangle details:");
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
