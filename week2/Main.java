/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W2.Stack;

import java.util.Stack;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack <>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack" + stack);
        System.out.println("so can tim: " + stack.search(10));
        
        
        System.out.println("Top element of stack: " + stack.peek());
        int poped= stack.pop();
        System.out.println("Remove element: " + poped);
        
        System.out.println("Is empty: " + stack.isEmpty());
        
        System.out.println("Size if the stack: " + stack.size());
    }
}
