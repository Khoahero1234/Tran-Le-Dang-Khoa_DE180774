/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author Admin
 */
public class Manager {
    private final Validate validate;
    private final Converter converter;

    public Manager() {
        validate = new Validate();
        converter = new Converter();
    }

    public void run() {
        while (true) {
            int choice = menu();
            switch (choice) {
                case 1 -> convertFromBinary();
                case 2 -> convertFromDecimal();
                case 3 -> convertFromHexa();
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
            }
        }
    }

    private int menu() {
        System.out.println("===== Base Conversion Program =====");
        System.out.println("1. Convert From Binary");
        System.out.println("2. Convert From Decimal");
        System.out.println("3. Convert From Hexa");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        return validate.inputIntInRange(1, 4);
    }

    private int displayConvert(String from, String to1, String to2) {
        System.out.println("1. Convert from " + from + " to " + to1);
        System.out.println("2. Convert from " + from + " to " + to2);
        System.out.print("Enter your choice: ");
        return validate.inputIntInRange(1, 2);
    }

    private void convertFromBinary() {
        String binary = validate.inputBinary();
        int option = displayConvert("Binary", "Decimal", "Hexa");
        if (option == 1) {
            System.out.println("Decimal: " + converter.binaryToDecimal(binary));
        } else {
            System.out.println("Hexadecimal: " + converter.binaryToHex(binary));
        }
    }

    private void convertFromDecimal() {
        String decimal = validate.inputDecimal();
        int option = displayConvert("Decimal", "Binary", "Hexa");
        if (option == 1) {
            System.out.println("Binary: " + converter.decimalToBinary(decimal));
        } else {
            System.out.println("Hexadecimal: " + converter.decimalToHex(decimal));
        }
    }

    private void convertFromHexa() {
        String hexa = validate.inputHexaDecimal();
        int option = displayConvert("Hexa", "Binary", "Decimal");
        if (option == 1) {
            System.out.println("Binary: " + converter.hexToBinary(hexa));
        } else {
            System.out.println("Decimal: " + converter.hexToDecimal(hexa));
        }
    }
}
