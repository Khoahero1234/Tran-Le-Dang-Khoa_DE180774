/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author Admin
 */
public class MainP0050 {
    public static void main(String[] args) {
        InputHelper inputHelper = new InputHelper();
        NumberUtils numberUtils = new NumberUtils();
        LinearEquation linear = new LinearEquation(inputHelper, numberUtils);
        QuadraticEquation quadratic = new QuadraticEquation(inputHelper, numberUtils);

        while (true) {
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = inputHelper.checkInputIntLimit(1, 3);

            switch (choice) {
                case 1:
                    linear.solve();
                    break;
                case 2:
                    quadratic.solve();
                    break;
                case 3:
                    System.out.println("Exit program.");
                    return;
            }
            System.out.println();
        }
    }
}
