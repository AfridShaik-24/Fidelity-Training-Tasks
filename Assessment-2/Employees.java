/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.*;
import java.util.stream.Collectors;
class Employee{
    String name;
    public Employee(String name){
        this.name=name;
}
    public String getName(){
        return name;
    }
}
public class Employees {
   public static void main(String[] args){ 
       List<Employee> list=new ArrayList<>();
       list.add(new Employee("Afrid"));
       list.add(new Employee("Aparichitudu"));
       list.add(new Employee("Ranvijay Singh"));
       list.add(new Employee("Balbir"));
       list.add(new Employee("Arundathi"));
       list.add(new Employee("Acharya"));
       list.add(new Employee("Aravindha"));
      List<Employee> emp=list.stream().filter(em -> em.getName().startsWith("A")).collect(Collectors.toList());
       for(Employee empName:emp){
           System.out.println(empName.getName());
   }
   }
}
