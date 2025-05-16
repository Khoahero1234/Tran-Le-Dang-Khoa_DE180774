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
public class Searcher {
        private int[] array;

    public Searcher(int size) {
        array = new int[size];
        generateRandomArray(size);
    }

    private void generateRandomArray(int size) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(size); // 0 to size-1
        }
    }

    public int linearSearch(int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public void displayArray() {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public int[] getArray() {
        return array;
    }
}
