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
public class MainP0001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BubbleSort manager = new BubbleSort();
        
        manager.inputArray(sc);
        manager.displayArray("Mang chua sap xep: ");
        manager.bubbleSort();
        manager.displayArray("Mang da sap xep: ");
    }
}
