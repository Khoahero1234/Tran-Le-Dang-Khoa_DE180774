/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author Admin
 */
public class NumberUtils {
    public boolean isOdd(double n) {
        return n % 2 == 1;
    }

    public boolean isEven(double n) {
        return n % 2 == 0;
    }

    public boolean isPerfectSquare(double n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public void analyzeNumbers(double... nums) {
        System.out.print("Odd numbers: ");
        for (double n : nums) {
            if (isOdd(n)) System.out.print(n + " ");
        }
        System.out.println();

        System.out.print("Even numbers: ");
        for (double n : nums) {
            if (isEven(n)) System.out.print(n + " ");
        }
        System.out.println();

        System.out.print("Perfect squares: ");
        for (double n : nums) {
            if (isPerfectSquare(n)) System.out.print(n + " ");
        }
        System.out.println();
    }
}
