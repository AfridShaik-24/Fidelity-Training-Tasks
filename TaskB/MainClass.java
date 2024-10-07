/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.TaskB;

/**
 *
 * @author Administrator
 */
import java.util.*;
public class MainClass {
    public static void main(String[] args){
        LinkedList list= new LinkedList();
        Scanner sc=new Scanner(System.in);
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.print();
        System.out.println("Enter Index");
        int ind=sc.nextInt();
        list.remove(ind);
        list.print();
    }
}
