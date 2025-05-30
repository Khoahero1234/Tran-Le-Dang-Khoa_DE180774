/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstlab211.week3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MainP0083 {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Get Top");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            
            String choice = sc.nextLine();
            
            switch (choice) {
                case "1":
                    System.out.print("Enter value to push: ");
                    int value = Integer.parseInt(sc.nextLine());
                    st.push(value);
                    break;
                case "2":
                    st.pop();
                case "3":
                    st.get();
                    break;
                case "4":
                    st.display();
                    break;
                case "5":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
