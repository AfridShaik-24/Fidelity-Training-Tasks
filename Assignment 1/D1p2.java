/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */
import java.util.*;
public class D1p2 {
       public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
            System.out.println("Enter quantity of pizzas bought :");
            int piz=sc.nextInt();
            System.out.println("Enter quantity of pepsi bought :");
            int pep=sc.nextInt();
            System.out.println("Enter quantity of puff bought :");
            int puf=sc.nextInt();
            int total=(piz*200)+(puf*40)+(pep*140);
        System.out.println("Total Cost :\nPizza Cost :"+piz*200+"\nPuff Cost :"+puf*40+"\nPepsi Cost :"+pep*140+"\nTotal Cost :"+total);
    
}
   
}

