/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author Admin
 */
public class QuadraticEquation {
    private final InputHelper input;
    private final NumberUtils utils;

    public QuadraticEquation(InputHelper input, NumberUtils utils) {
        this.input = input;
        this.utils = utils;
    }

    public void solve() {
        System.out.print("Enter A: ");
        double a = input.checkInputDouble();
        System.out.print("Enter B: ");
        double b = input.checkInputDouble();
        System.out.print("Enter C: ");
        double c = input.checkInputDouble();

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("No real solution.");
            return;
        }

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Solutions: x1 = " + x1 + ", x2 = " + x2);
        utils.analyzeNumbers(a, b, c, x1, x2);
    }
}
