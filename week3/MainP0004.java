/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstlab211.week3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MainP0004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        while(true){
            System.out.print("Enter number of array elements (positive integer): ");
            try{
                n = Integer.parseInt(sc.nextLine());
                if (n > 0) break;
                System.out.println("Please enter a positive integer.");
            }catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        ArrayManagerP0004 manager = new ArrayManagerP0004();
    QuickSort quickSort = new QuickSort();
    
    manager.generateRandom(n);
    manager.displayArray("Unsorted array: ");
    
    quickSort.sort(manager.getArray());
    manager.displayArray("Sorted array: ");
    }
    
    
    
    
}
