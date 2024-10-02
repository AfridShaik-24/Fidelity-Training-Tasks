/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Task3;

/**
 *
 * @author Administrator
 */
public class InsertAtSpecifiedPos {
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);
        list.insertAtPos(22, 3);
        list.print();
    }
}
