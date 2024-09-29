/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first name :");
     String first=sc.nextLine();
      System.out.println("Enter last name :");
     
      String last=sc.nextLine();
      String name=first+" "+last;
      System.out.println("Full Name :"+name);
      
}
}
