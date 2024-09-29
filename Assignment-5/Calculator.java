/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;

     
public class Calculator {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the operator(+,-,*,/)");
       char op=sc.next().charAt(0);
       System.out.print("Enter the operands : ");
       int num=sc.nextInt();
       int num2=sc.nextInt();
       Calculator cal=new Calculator();
      double[] rem={0};
       switch(op){
           case '+':
               System.out.println("Result of "+num+op+num2+" is "+cal.add(num,num2) );
               break;
                case '/':
               System.out.println("Result of "+num+op+num2+" is "+cal.div(num,num2,rem) );
                System.out.println("Remainder : "+rem[0] );
               break;
                case '-':
               System.out.println("Result of "+num+op+num2+" is "+cal.sub(num,num2) );
               break;
                case '*':
               System.out.println("Result of "+num+op+num2+" is "+cal.mul(num,num2) );
               break;
                default:
                    System.out.println("Invalid Operator");
       }
     
    }
     int add(int num,int num2){
        return num+num2;
     }
     int sub(int num,int num2){
        return num-num2;
     }
     int mul(int num,int num2){
        return num*num2;
     }
     double div(int num,int num2,double[] rem){
         rem[0]=(double)num%num2;
        return num/num2;
     }
}
