/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validator {
    static Scanner sc = new Scanner(System.in);
    public static double checkNumber(String mag){
        System.out.println(mag);
        while(true){
            try{
                double so = Double.parseDouble(sc.nextLine());
                if (so <= 0)
                    throw new IllegalArgumentException();
                            return so;
            }
            catch(Exception e){
                System.out.println("Enter number: ");
            }
        }
       
    }
    public static String checkOperation(String mag){
        System.out.println(mag);
        while(true){
            try{
            String op = sc.nextLine();
            if (op.equalsIgnoreCase("+") || op.equalsIgnoreCase("-") || 
                op.equalsIgnoreCase("*") || op.equalsIgnoreCase("/") || op.contentEquals("=")){
                return op; // ✅ trả về nếu hợp lệ
            } else {
                throw new IllegalArgumentException();
            }
        } catch(Exception e){
            System.out.println("Enter OP: ");
        }
        }
    }
    
}
