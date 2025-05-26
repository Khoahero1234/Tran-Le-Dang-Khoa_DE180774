/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstlab211.week2;

/**
 *
 * @author Admin
 */
public class MatrixCalculator {

    public static Matrix add(Matrix a, Matrix b) {
        if (a.getRows() != b.getRows() || a.getCols() != b.getCols()) {
            throw new IllegalArgumentException("Matrix dimensions do not match for addition.");
        }
        Matrix result = new Matrix(a.getRows(), a.getCols());
        int[][] resData = result.getData();
        int[][] aData = a.getData();
        int[][] bData = b.getData();

        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < a.getCols(); j++) {
                resData[i][j] = aData[i][j] + bData[i][j];
            }
        }
        return result;
    }

    public static Matrix subtract(Matrix a, Matrix b) {
        if (a.getRows() != b.getRows() || a.getCols() != b.getCols()) {
            throw new IllegalArgumentException("Matrix dimensions do not match for subtraction.");
        }
        Matrix result = new Matrix(a.getRows(), a.getCols());
        int[][] resData = result.getData();
        int[][] aData = a.getData();
        int[][] bData = b.getData();

        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < a.getCols(); j++) {
                resData[i][j] = aData[i][j] - bData[i][j];
            }
        }
        return result;
    }

    public static Matrix multiply(Matrix a, Matrix b) {
        if (a.getCols() != b.getRows()) {
            throw new IllegalArgumentException("Matrix dimensions do not match for multiplication.");
        }
        Matrix result = new Matrix(a.getRows(), b.getCols());
        int[][] resData = result.getData();
        int[][] aData = a.getData();
        int[][] bData = b.getData();

        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < b.getCols(); j++) {
                for (int k = 0; k < a.getCols(); k++) {
                    resData[i][j] += aData[i][k] * bData[k][j];
                }
            }
        }
        return result;
    }
}

