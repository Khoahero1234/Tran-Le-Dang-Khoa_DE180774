/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W2.Stack;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.Stack;

public class BracketChecker {

    public static boolean isValidExpression(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch); // Đẩy dấu ngoặc mở vào stack
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; // Không có dấu ngoặc mở tương ứng
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false; // Dấu ngoặc không khớp
                }
            }
        }

        return stack.isEmpty(); // Stack rỗng tức là dấu ngoặc hợp lệ
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap bieu thuc can kiem tra: ");
        String input = scanner.nextLine();

        if (isValidExpression(input)) {
            System.out.println("Bieu thuc hop le.");
        } else {
            System.out.println("Bieu thuc khong hop le.");
        }
    }
}

