/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstlab211.week2;

/**
 *
 * @author Admin
 */
public class BMICalculator {
    private final InputHandler input;

    public BMICalculator(InputHandler input) {
        this.input = input;
    }

    public void start() {
        System.out.print("Enter Weight (kg): ");
        double weight = input.readDouble();
        System.out.print("Enter Height (cm): ");
        double height = input.readDouble();

        double bmi = weight * 10000 / (height * height);
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + getStatus(bmi));
    }

    private String getStatus(double bmi) {
        if (bmi < 19) return "Under-standard.";
        else if (bmi < 25) return "Standard.";
        else if (bmi < 30) return "Overweight.";
        else if (bmi < 40) return "Fat - should lose weight.";
        else return "Very fat - should lose weight immediately.";
    }
}
