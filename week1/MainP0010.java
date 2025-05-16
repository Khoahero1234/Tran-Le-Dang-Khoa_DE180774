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
public class MainP0010 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for array size
        System.out.print("Enter number of array: ");
        int size = scanner.nextInt();

        // Prompt for search value
        System.out.print("Enter search value: ");
        int searchValue = scanner.nextInt();

        // Create and display the array
        NumberArray numberArray = new NumberArray(size);
        System.out.println("The array: " + numberArray.toString());

        // Search and display the index
        int index = numberArray.search(searchValue);
        if (index != -1) {
            System.out.println("Found " + searchValue + " at index: " + index);
        } else {
            System.out.println(searchValue + " not found in the array.");
        }

        scanner.close();
    }
}
