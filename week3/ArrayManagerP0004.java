/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstlab211.week3;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class ArrayManagerP0004 {
    private int[] array;
    
    public void generateRandom(int size){
        Random rand = new Random();
        array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = rand.nextInt(100);
        }
    }
    public void displayArray(String message){
        System.out.print(message);
        for (int num : array){
        System.out.print(num + " ");
    }
        System.out.println();
    }
    public int[] getArray(){
        return array;
    }
    }

