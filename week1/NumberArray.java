/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class NumberArray {
     private int[] array;

    public NumberArray(int size) {
        array = new int[size];
        generateRandomArray();
    }

    private void generateRandomArray() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10); // Random number from 0 to 9
        }
    }

    public int[] getArray() {
        return array;
    }

    public int search(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i; // return the first index where value is found
            }
        }
        return -1; // not found
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
