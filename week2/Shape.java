/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstlab211.week2;

/**
 *
 * @author Admin
 */
public abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
    public void printResult() {
        System.out.printf("Perimeter: %.2f\n", getPerimeter());
        System.out.printf("Area: %.2f\n", getArea());
    }
}

