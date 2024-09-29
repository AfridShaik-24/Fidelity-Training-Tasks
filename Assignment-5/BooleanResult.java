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
public class BooleanResult {
      public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value for x : ");
      int x=sc.nextInt();
      System.out.println("Enter the value for y : ");
      int y=sc.nextInt();
      BooleanResult bool= new BooleanResult();
      
      boolean res=bool.checkValue(x,y);
      System.out.println("The result of whether x is less than y is "+res);
}
    boolean checkValue(int x,int y){
       if(x<y) return true;
       return false;
}
}
