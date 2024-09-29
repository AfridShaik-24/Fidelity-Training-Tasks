/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.time.LocalDate;
 import java.util.Scanner;
class Person{
    String firstname;
    String lastname;
    String dob;
    public Person(String firstname,String lastname,String dob){
    this.firstname=firstname;
    this.lastname=lastname;
    this.dob=dob;
    }
    public int getAge(String dob){
        String arr[]=dob.split("/");
        LocalDate curdate=LocalDate.now();
        int curyear=curdate.getYear();
        int year=Integer.parseInt(arr[0]);
        int age=curyear-year;
        return age;
    }
    public void display(){
        int age =getAge(dob);
        String check=checkAdult(age);
        System.out.println("First name :"+firstname+"\nLast name :"+lastname+"\nAge :"+age+"\n"+check);
    }
    String checkAdult(int age){
        if(age>=18) return "Adult";
        return "Child";
    }
}
public class AgeofPerson {
   
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first name :");
     String first=sc.nextLine();
      System.out.println("Enter last name :");
     
      String last=sc.nextLine();
     System.out.println("Enter date of birth in yyyy/mm/dd format :");
     String dob=sc.nextLine();
     
     
     
     Person pers=new Person(first,last,dob);
     pers.display();
      
}
}
