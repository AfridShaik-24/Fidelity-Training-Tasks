/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Task2;

/**
 *
 * @author Administrator
 */
public class Linkedlist {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int element){
            this.data=element;
            next=null;
        }
    }
    public void insert(int element){
        Node node=new Node(element);
        if(head==null){
            head=node; }
            else{
               Node last=head;
               while(last.next!=null){
                   last=last.next;
               }
               last.next=node;
                    }    
    }
    public void print(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node prenode=head;
            while(prenode!=null){
                System.out.println(prenode.data);
                prenode=prenode.next;
            }
        }
    }
}
