/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstlab211.week3;

/**
 *
 * @author Admin
 */
public class QuickSort {
    public void sort(int[] array){
        quickSort(array, 0, array.length -1);
    }
    
    private void quickSort(int[] arr, int left, int right){
        if (left >= right) return;
        
        int pivot = arr[(left + right) / 2];
        int index = partition(arr, left, right, pivot);
        quickSort(arr, left, index -1);
        quickSort(arr, index, right);
    }
    private int partition(int[] arr, int left, int right, int pivot){
        while (left <= right){
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;
            if (left <= right){
                int tem = arr[left];
                arr[left] = arr[right];
                arr[right] = tem;
                left++;
                right--;
            }
        }return left;
    }
}
