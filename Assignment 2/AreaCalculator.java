/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */
public class AreaCalculator {
 public double calculateArea(int length){
     int area=6*length*length;
     return area;
 }
         
  public double calculateArea(int length,int breadth){
     int area=length*breadth;
     return area;
 }
   public double calculateArea(int radius,double pie){
     double area=(pie*radius*radius);
     return area;
 }
 public static void main(String[] args){
     AreaCalculator cal=new AreaCalculator();
 System.out.println("Area of cube of side length 5 "+cal.calculateArea(5));
 System.out.println("Area of Rectangle of length 4 and breadth 6 "+cal.calculateArea(4,6));
 System.out.println("Area of Circle of radius 3 "+cal.calculateArea(3));
 }    
}
