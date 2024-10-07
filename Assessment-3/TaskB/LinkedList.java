/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.TaskB;

/**
 *
 * @author Administrator
 */
public class LinkedList {
   private Node head;
    public LinkedList(){
        this.head=null;
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
    public void remove(int index){
       Node cur=head;
       System.out.println(index);
       System.out.println(cur.data);
       if(index==0){
           if(head!=null){
                head=cur.next;
           }
          
           return;
       }
       for(int i=0;i<index-1;i++){
            if(cur==null || cur.next==null){
            return;
       }
          
           cur=cur.next;
       }
      
       Node temp=cur.next.next;
       System.out.println(cur.data);
       
       cur.next=temp;
    }
}
