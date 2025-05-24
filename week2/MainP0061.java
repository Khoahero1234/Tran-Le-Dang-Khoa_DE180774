/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstlab211.week2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MainP0061 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== SHAPE CALCULATOR =====");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = getIntInput(in, 1, 4);

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of Circle: ");
                    double radius = getPositiveDouble(in);
                    Shape circle = new Circle(radius);
                    circle.printResult();
                    break;
                case 2:
                    System.out.print("Enter width of Rectangle: ");
                    double width = getPositiveDouble(in);
                    System.out.print("Enter length of Rectangle: ");
                    double length = getPositiveDouble(in);
                    Shape rectangle = new Rectangle(width, length);
                    rectangle.printResult();
                    break;
                case 3:
                    System.out.print("Enter side A of Triangle: ");
                    double a = getPositiveDouble(in);
                    System.out.print("Enter side B of Triangle: ");
                    double b = getPositiveDouble(in);
                    System.out.print("Enter side C of Triangle: ");
                    double c = getPositiveDouble(in);
                    if (isValidTriangle(a, b, c)) {
                        Shape triangle = new Triangle(a, b, c);
                        triangle.printResult();
                    } else {
                        System.err.println("Invalid triangle sides.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }

    public static int getIntInput(Scanner in, int min, int max) {
        while (true) {
            try {
                int n = Integer.parseInt(in.nextLine());
                if (n >= min && n <= max) return n;
                System.err.print("Please enter number between " + min + " and " + max + ": ");
            } catch (NumberFormatException e) {
                System.err.print("Invalid input. Enter again: ");
            }
        }
    }

    public static double getPositiveDouble(Scanner in) {
        while (true) {
            try {
                double d = Double.parseDouble(in.nextLine());
                if (d > 0) return d;
                System.err.print("Value must be positive. Enter again: ");
            } catch (NumberFormatException e) {
                System.err.print("Invalid number. Enter again: ");
            }
        }
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }
}