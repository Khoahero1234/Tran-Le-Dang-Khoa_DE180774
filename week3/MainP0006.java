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
public class MainP0006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchManager manager = new SearchManager();
        
        manager.inputArray(sc);
        manager.bubbleSort();
        manager.displayArray("Mang: ");
        System.out.print("Nhap so can tim: ");
        int target = Integer.parseInt(sc.nextLine());
        int index = manager.binarySearch(target);
        if (index >= 0){
            System.out.println("Da tim thay target tai index = " + index);
        }else {
            System.out.println("Khong tim thay so can tim trong mang.");
        }
    }
}
