/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstlab211.week3;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class MyStack {
    private ArrayList<Integer> stackValues;

    public MyStack() {
        stackValues = new ArrayList<>();
    }
    
    public void push(int value){
        stackValues.add(value);
        System.out.println("Pushed: " + value);
    }
    
    public int pop(){
        if(stackValues.isEmpty()){
            System.out.println("Stack is empty! Cannot pop.");
            return -1;
        }
        int remove = stackValues.remove(stackValues.size() - 1);
        System.out.println("Poped: " + remove);
        return remove;
    }
    
    public int get(){
        if (stackValues.isEmpty()){
            System.out.println("Stack is empty! Cannot pop.");
            return -1;
        }
        int top = stackValues.get(stackValues.size() -1);
        System.out.println("Top elment: " + top);
        return top;
    }
    public void display(){
        System.out.println("Current stack: " + stackValues);
    }

}
