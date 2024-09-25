/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

class Employee{
    int id;
    String Name;
    float bonus;
    float netsalary;
   
    public Employee(int id,String name){
        this.id=id;
        this.Name=name;
    }
    public void display(){
        System.out.println("The details are :"+"\nEmployee Id :" +id+"\nEmployee Name :"+ Name);
    }
}
class PermanentEmployee extends Employee{
    public int pf;
    float basicsalary;
    public PermanentEmployee(int id,String name,float basicsalary,int pf){
        super(id,name);
        this.pf=pf;
        this.basicsalary=basicsalary;
    }
    public void calculate(){
        netsalary=basicsalary-pf;
        if(pf<1000){
            bonus=0.1f * basicsalary;
    }else if(pf>=1000 && pf<1500){
        bonus=0.11f*basicsalary;
}else if(pf>=1500 && pf<1800){
    bonus=0.12f*basicsalary;
}else{
    bonus=0.15f*basicsalary;
}
    }
   public void display(){ 
       super.display();
       System.out.println("Basic Salary :" +basicsalary+"\nPF :"+pf+"\nBonus :"+bonus+"\nNet Salary :"+netsalary);
System.out.println();
   }
}
class TemporaryEmployee extends Employee{
    int dailywages;
    int noofdays;
    public TemporaryEmployee(int id,String name,int dailywages,int noofdays){
        super(id,name);
        this.dailywages=dailywages;
        this.noofdays= noofdays;
    }
    public void calculateTemp(){
        netsalary=dailywages*noofdays;
        if(dailywages<1000){
            bonus=0.15f * netsalary;
    }else if(dailywages>=1000 && dailywages<1500){
        bonus=0.12f*netsalary;
}else if(dailywages>=1500 && dailywages<1750){
    bonus=0.11f*netsalary;
}else{
    bonus=0.08f*netsalary;
}
    }
    public void display(){
        super.display();
        System.out.println("Daily Wages :"+dailywages+"\nNo of Days Worked :"+noofdays+"\nBonus :"+bonus+"\nNet Salary :"+netsalary);
    System.out.println();
    }
}

public class Payroll {
   public static void main(String[] args){
       PermanentEmployee per =new PermanentEmployee(001,"Afrid Shaik",40000,1200);
       PermanentEmployee per2=new PermanentEmployee(002,"salaar",40000,1200);
       PermanentEmployee per3=new PermanentEmployee(003,"Devrattha",40000,1200);
       TemporaryEmployee tem=new TemporaryEmployee(004,"Raisaar",1600,30);
       TemporaryEmployee tem2=new TemporaryEmployee(005,"Varadha",700,60);
       TemporaryEmployee tem3=new TemporaryEmployee(006,"Raja Mannar",1200,90);
       per.calculate();
       per.display();
       per2.calculate();
       per2.display();
       per3.calculate();
       per3.display();
       tem.calculateTemp();
       tem.display();
       tem2.calculateTemp();
        tem2.display();
        tem3.calculateTemp();
         tem3.display();
       
   } 
}
