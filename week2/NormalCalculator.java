/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstlab211.week2;

/**
 *
 * @author Admin
 */
public class NormalCalculator {
    private final InputHandler input;

    public NormalCalculator(InputHandler input) {
        this.input = input;
    }

    public void start() {
        System.out.print("Enter number: ");
        double memory = input.readDouble();

        while (true) {
            System.out.print("Enter operator: ");
            String operator = input.readOperator();

            switch (operator) {
                case "+" -> memory += inputNumber();
                case "-" -> memory -= inputNumber();
                case "*" -> memory *= inputNumber();
                case "/" -> memory /= inputNumber();
                case "^" -> memory = Math.pow(memory, inputNumber());
                case "=" -> {
                    System.out.println("Result: " + memory);
                    return;
                }
            }
            System.out.println("Memory: " + memory);
        }
    }

    private double inputNumber() {
        System.out.print("Enter number: ");
        return input.readDouble();
    }
}
