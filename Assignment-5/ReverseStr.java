/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;
public class ReverseStr {
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a string :");
     String str=sc.nextLine();
     String[] arr=str.split(" ");
     String res="";
     for(int i=arr.length-1;i>=0;i--){
         res+=arr[i]+" ";
     }
     System.out.println(res);
}
}
