/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */
public class Day1p1 {
    public static void main(String[] args){
        int[] a={10,20,6,23,76};
       double average= calAvg(a);
       System.out.println("Average is"+average);
    }
    public static double calAvg(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        } 
        int avg=sum/arr.length;
        return avg;
    }
        
}
