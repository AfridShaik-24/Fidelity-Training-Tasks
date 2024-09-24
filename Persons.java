/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
class Person{
    private String name;
    public String gender;
    public int age;
    public Person(String name,String gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    public String getName(){
        return name;
}
    public void display(){
        System.out.println("Person Name :"+getName()+"\nGender :"+gender+"\nAge :"+age);
        System.out.println();
}
}
public class Persons {
    public static void main(String[] args){
        Person per=new Person("Afrid Shaik","Male",22);
        Person per1=new Person("Shahida","Female",24);
        Person per2=new Person("Akram","Male",22);
        per.display();
        per1.display();
        per2.display();
    }
}
