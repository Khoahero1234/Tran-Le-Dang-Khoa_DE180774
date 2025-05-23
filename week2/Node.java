/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LL2;

/**
 *
 * @author Admin
 */
public class Node {
    private int info ;
    private Node next;

    public int getInfo() {
        return info;
    }

    public Node getNext() {
        return next;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return info + " ";
    }
    
    
}
