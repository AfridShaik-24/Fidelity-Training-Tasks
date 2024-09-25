/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;
public class Account {
    String accno="50406543234521";
    String accname="Shaik Afrid";
    int bal=300000;
    public void withdraw(int money){
        bal-=money;}
    public void deposit(int money){
        bal+=money;
    }
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      Account acc=new Account();
  
      System.out.println("Select any Operation:\nPress 1 for withdrawl \nPress 2 for Deposit \nPress 3 for Balance Enquiry");
      int op=sc.nextInt();
      if(op==1){
          System.out.println("Enter Withdraw Amount :" );
          int with=sc.nextInt();
          acc.withdraw(with);
      }else if(op==2){
          System.out.println("Enter Deposit Amount :");
          int dep=sc.nextInt();
          acc.deposit(dep);
      }else{
      System.out.println(acc.bal);}
      System.out.println(1);
      System.out.println("Account No :"+acc.accno+"\nAccount Name :"+acc.accname+"\nAccount Balance :"+acc.bal);
  }
  }  
