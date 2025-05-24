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
public class MenuP0051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputHandler input = new InputHandler(sc);
        NormalCalculator normalCalc = new NormalCalculator(input);
        BMICalculator bmiCalc = new BMICalculator(input);

        while (true) {
            System.out.println("\n1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.readIntInRange(1, 3);
            switch (choice) {
                case 1 -> normalCalc.start();
                case 2 -> bmiCalc.start();
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
            }
        }
    }
}
