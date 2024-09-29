/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.*;

public class FindSquareandCube {
     public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a Number : ");
       double num=sc.nextDouble();
       double squ=calcSquare(num);
       System.out.println("Square of "+num+" is "+squ);
         double cub=calcCube(num);
       System.out.println("Cube of "+num+" is "+cub);
       
}
     static double calcSquare(double num){
         num*=num;
         return num;
     }
     static double calcCube(double num){
         num=num*num*num;
         return num;
     }
}