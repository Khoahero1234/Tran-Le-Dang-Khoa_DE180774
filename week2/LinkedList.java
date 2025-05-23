/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LL2;

/**
 *
 * @author Admin
 */
public class LinkedList {
    private Node head;
    private Node tail;

    

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public LinkedList() {
        head = null;
        tail = null;
    }
    
    
   public void traverse(){
       Node p = head;
        while (p != null){
            System.out.print(p + " ");
            p = p.getNext();
        }
   }
   
   public void addHead(int info){
       Node newNode = new Node(info);
       
       if (head == null && tail == null){
           head = newNode;
           tail = newNode;
       } else{
           newNode.setNext(head);
       head = newNode;
       }
       
   }
   
   public void addTail(int info) {
    Node newNode = new Node(info);
    if ( tail == null) {
       
        tail = newNode;
    } else {
        tail.setNext(newNode);  // nối đuôi cũ với node mới
        tail = newNode;         // cập nhật tail
    }
}

   
   public void addNode (int info){
       Node newNode = new Node(info);
       
       if (head == null && tail == null){
           head = newNode;
           tail = newNode;
       } else{
           newNode.setNext(head);
       head = newNode;
       }
   }
   
   public Node get(int index){
       Node p1 = head;
        int i = 0;
        while (p1 != null && i < index){
            
            p1 = p1.getNext();
        }
        System.out.println("");
        if (p1 != null)
            return p1;
        else
            return null;
   }
   
   
}
