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
public class MainP0008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your content: ");
        String content = scanner.nextLine();

        Count analyzer = new Count();
        analyzer.analyze(content);
        analyzer.display();
    }
}
