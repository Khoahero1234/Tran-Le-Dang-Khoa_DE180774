/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validate {
    private final Scanner in = new Scanner(System.in);
    private final String BINARY_VALID = "[0-1]+";
    private final String DECIMAL_VALID = "[0-9]+";
    private final String HEXADECIMAL_VALID = "[0-9A-F]+";

    public int inputIntInRange(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public String inputBinary() {
        System.out.print("Enter number binary: ");
        while (true) {
            String result = in.nextLine().trim();
            if (result.matches(BINARY_VALID)) {
                return result;
            }
            System.err.println("Must be 0 or 1");
            System.out.print("Enter again: ");
        }
    }

    public String inputDecimal() {
        System.out.print("Enter number decimal: ");
        while (true) {
            String result = in.nextLine().trim();
            if (result.matches(DECIMAL_VALID)) {
                return result;
            }
            System.err.println("Must be digits 0-9");
            System.out.print("Enter again: ");
        }
    }

    public String inputHexaDecimal() {
        System.out.print("Enter number hexadecimal: ");
        while (true) {
            String result = in.nextLine().trim().toUpperCase();
            if (result.matches(HEXADECIMAL_VALID)) {
                return result;
            }
            System.err.println("Must be digits 0-9 or A-F");
            System.out.print("Enter again: ");
        }
    }
}
