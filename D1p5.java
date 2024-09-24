/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */
public class D1p5 {
       public static void main(String[] args){
           int[] arr={1,2,3,4,5,6,7,8,9,10};
           int n=arr.length;
           int sumofeven=0;
         for(int i=0;i<n;i++){
             
          if(arr[i]%2==0){
              sumofeven+=arr[i];
     }
         }
         System.out.println(sumofeven);
}
}
