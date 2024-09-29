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

class Customer{
    String name;
    int age;
    String country;
    public Customer(String name,int age,String country){
       this.name=name;
       this.age=age;
       this.country=country;
    }
     public void display(){ 
         System.out.println("Welcome "+name+". Your age is "+age+" and you are from "+country);
     }
}
public class NewClass {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter your name : ");
       String name=sc.nextLine();
       System.out.print("Enter your age : ");
       int age=sc.nextInt();
       System.out.print("Enter your country : ");
       sc.nextLine();
       String country=sc.nextLine();
        Customer cust=new Customer(name,age,country);
        cust.display();
   }
}
