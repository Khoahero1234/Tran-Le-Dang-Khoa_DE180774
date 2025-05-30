/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstlab211.week3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BubbleSort {
    private int[] arrays;
    
    public void inputArray(Scanner sc){
        System.out.println("Nhap so luong phan tu trong mang: ");
        int n = 0;
        while(true){
            try {
              n = Integer.parseInt(sc.nextLine());
              if (n <= 0) throw new NumberFormatException();
              break;
            } catch (NumberFormatException e){
                System.out.println("Vui long nhap lai gia tri nguyen duong.");
                System.out.println("Nhap lai: ");
            }
            
            
            }
        arrays = new int[n];
            Random rand = new Random();
            for (int i = 0; i < n ; i++){
                arrays[i] = rand.nextInt(201);
        }
        
        
    }
    public void displayArray(String message){
            System.out.println(message);
            for(int i = 0; i < arrays.length; i++){
                System.out.print(arrays[i] + (i < arrays.length - 1 ? "," : "\n"));
            }
        }
    public void bubbleSort(){
        boolean swap;
        int n = arrays.length;
        for (int i = 0; i < n - 1; i++){
          swap = false;
          for(int j = 0; j < n - i -1; j++){
              if (arrays[j] > arrays[j + 1]){
                  int tem = arrays[j];
                  arrays[j] = arrays[j + 1];
                  arrays[j + 1] = tem;
                  swap = true;
              }
          }
          if(!swap) break;
        }
    }
}
