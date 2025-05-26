/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstlab211.week2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Matrix {
    private int[][] data;
    private int rows;
    private int cols;

    // Constructor
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    // Getter
    public int[][] getData() {
        return data;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    // Nhập giá trị cho ma trận từ bàn phím
    public void input(Scanner scanner) {
        System.out.println("Enter matrix values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (true) {
                    try {
                        System.out.print("[" + i + "][" + j + "]: ");
                        data[i][j] = Integer.parseInt(scanner.nextLine().trim());
                        break;
                    } catch (NumberFormatException e) {
                        System.err.println("Values of matrix must be the number");
                    }
                }
            }
        }
    }

    // In ma trận ra màn hình
    public void print() {
        for (int[] row : data) {
            for (int value : row) {
                System.out.printf("%5d", value);
            }
            System.out.println();
        }
    }
}

