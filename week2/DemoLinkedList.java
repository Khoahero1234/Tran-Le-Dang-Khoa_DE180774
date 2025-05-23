/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LL2;

/**
 *
 * @author Admin
 */
public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        
       list.addHead(10);
       list.addTail(20);
       list.addTail(30);
       list.addTail(40);
       list.addTail(50);
        System.out.print("DS: ");
        list.traverse();
    }
}
