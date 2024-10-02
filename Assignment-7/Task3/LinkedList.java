/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Task3;

/**
 *
 * @author Administrator
 */
public class LinkedList {
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
    public void insertAtPos(int data,int pos){
        Node newEle=new Node(data);
        if(pos==0){
            newEle.next=head;
            head=newEle;
            return;
        }
        Node dup=head;
        for(int i=0;i<pos-1 && dup!=null;i++){
            dup=dup.next;
        }
        newEle.next=dup.next;
        dup.next=newEle;
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

