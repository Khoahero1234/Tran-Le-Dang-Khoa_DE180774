/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author Admin
 */
public class Converter {
    private final char[] hexDigits = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    public String binaryToDecimal(String binary) {
        return Integer.toString(Integer.parseInt(binary, 2));
    }

    public String binaryToHex(String binary) {
        return decimalToHex(binaryToDecimal(binary));
    }

    public String decimalToBinary(String decimal) {
        return Integer.toBinaryString(Integer.parseInt(decimal));
    }

    public String decimalToHex(String decimal) {
        StringBuilder hex = new StringBuilder();
        int dec = Integer.parseInt(decimal);
        while (dec != 0) {
            hex.insert(0, hexDigits[dec % 16]);
            dec /= 16;
        }
        return hex.toString();
    }

    public String hexToDecimal(String hex) {
        return Integer.toString(Integer.parseInt(hex, 16));
    }

    public String hexToBinary(String hex) {
        return Integer.toBinaryString(Integer.parseInt(hex, 16));
    }
}
