/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author Admin
 */
public class LinearEquation {
    private final InputHelper input;
    private final NumberUtils utils;

    public LinearEquation(InputHelper input, NumberUtils utils) {
        this.input = input;
        this.utils = utils;
    }

    public void solve() {
        System.out.print("Enter A: ");
        double a = input.checkInputDouble();
        System.out.print("Enter B: ");
        double b = input.checkInputDouble();

        if (a == 0) {
            System.out.println("No solution (A cannot be zero).");
            return;
        }

        double x = -b / a;
        System.out.println("Solution: x = " + x);
        utils.analyzeNumbers(a, b, x);
    }
}
