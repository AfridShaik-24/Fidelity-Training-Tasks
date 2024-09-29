/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
 import java.util.*;

class Holder{
    int id;
    String acctype;
    double bal;
    double curbal;
    public Holder(){
    }
    public Holder(int id,String acctype,double bal){
        this.id=id;
        this.acctype=acctype;
       this.bal=bal;
    }
    public boolean withdraw(double money){
        curbal=bal-money;
      
        if(curbal>0)return true;
         return false;   
    }
    public void display(boolean bool ){
          System.out.println("Account Id :"+id+"\nAccount Type :"+acctype+"\nBalance :"+bal);
          if(bool){
              System.out.println("New Balance :"+curbal);
              bal=curbal;
            
          }else{
              System.out.println("Insufficient Balance");}
          curbal=0;
    }   
}
public class AccountDetails {
    
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
     
  
      System.out.println("Enter account id :");
      int id=sc.nextInt();
      System.out.println("Enter account type :");
      sc.nextLine();
      String type=sc.nextLine();
       System.out.println("Enter account balance :");
       double bal=sc.nextDouble();
       System.out.println("Enter amount to withdraw :");
       double amt=sc.nextDouble();
       Holder acc=new Holder(id,type,bal);  
     boolean valid=acc.withdraw(amt);
     acc.display(valid);
 
    
  }
  }  
   
