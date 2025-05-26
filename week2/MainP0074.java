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
public class MainP0074 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Matrix Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            String choice = scanner.nextLine().trim();
            if (choice.equals("4")) break;

            System.out.print("Enter number of rows for matrix 1: ");
            int rows1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter number of columns for matrix 1: ");
            int cols1 = Integer.parseInt(scanner.nextLine());

            Matrix matrix1 = new Matrix(rows1, cols1);
            matrix1.input(scanner);

            System.out.print("Enter number of rows for matrix 2: ");
            int rows2 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter number of columns for matrix 2: ");
            int cols2 = Integer.parseInt(scanner.nextLine());

            Matrix matrix2 = new Matrix(rows2, cols2);
            matrix2.input(scanner);

            try {
                Matrix result = switch (choice) {
                    case "1" -> MatrixCalculator.add(matrix1, matrix2);
                    case "2" -> MatrixCalculator.subtract(matrix1, matrix2);
                    case "3" -> MatrixCalculator.multiply(matrix1, matrix2);
                    default -> throw new IllegalArgumentException("Invalid option.");
                };
                System.out.println("Result:");
                result.print();
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
