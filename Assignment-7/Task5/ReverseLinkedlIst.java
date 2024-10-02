/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Task5;

/**
 *
 * @author Administrator
 */
public class ReverseLinkedlIst {
      public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);
         list.print();
         System.out.println("Reversed List :");
        list.reverse();
        list.print();
    } 
}
