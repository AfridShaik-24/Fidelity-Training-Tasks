/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
class Grandparents{
    public void hobby(){
        System.out.println("I love Swimming");
}
}
class Parents extends Grandparents{
    public void character(){
        System.out.println("A sweet person");
}
}
class Children extends Parents{
 public void me(){
     hobby();
     character();
 }
}
public class Family {
  public static void main(String[] args){
      Children child=new Children();
      child.me();
  }   
}
