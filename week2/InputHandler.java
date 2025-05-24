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
public class InputHandler {
    private final Scanner sc;

    public InputHandler(Scanner scanner) {
        this.sc = scanner;
    }

    public int readIntInRange(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range [" + min + ", " + max + "]: ");
            }
        }
    }

    public double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.err.print("Invalid double. Enter again: ");
            }
        }
    }

    public String readOperator() {
        while (true) {
            String input = sc.nextLine().trim();
            if (input.matches("[+\\-*/^=]")) {
                return input;
            }
            System.err.print("Invalid operator. Enter (+, -, *, /, ^, =): ");
        }
    }
}
