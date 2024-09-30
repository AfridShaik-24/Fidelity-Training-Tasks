/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.*;
class Insurance{
    private String insuranceNo;
    private String insuranceName;
    private double amountCovered;
    public String getInsuranceNo(){return insuranceNo;}
    public String getInsuranceName(){return insuranceName;}
    public double getAmountCovered(){return amountCovered;}
    public void setInsuranceNo(String no){
        this.insuranceNo=no;
    }
     public void setInsuranceName(String name){
        this.insuranceName=name;
    }
      public void setAmountCovered(double amt){
        this.amountCovered=amt;
    }   
}
class MotorInsurance extends Insurance{
    private double idv;
    private float depPercent;
   
    public float getDepPercent(){return depPercent;}
     public void setIdv(double idv){ this.idv=idv; }
     public void setDep(float dep){ this.depPercent=dep;}
     public double calculatePremium(){
         return (getAmountCovered()-((getAmountCovered()*getDepPercent())/100))*0.03;
     }
}
class LifeInsurance extends Insurance{
    private int policyTerm;
    private float benifitPercent;
    public int getTerm(){ return policyTerm; }
    public float getBenefitPer(){ return benifitPercent; } 
    public void setTerm(int term){ this.policyTerm=term;}
    public void setBenifit(float benefit){ this.benifitPercent=benefit;}
    public double calculatePremium(){
        return (getAmountCovered()-((getAmountCovered()*getBenefitPer())/100))/getTerm();
    }
}
public class InsuranceCompany {
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.print("Insurance Number : ");
     String num=sc.nextLine();
     System.out.println("Insurance Name : ");
     String name=sc.nextLine();
     System.out.print("Amount Covered : ");
     double amt=sc.nextDouble();
     System.out.print("Select Insurance Type \n1. Life Insurance \n2. Motor Insurance\n");
     int op=sc.nextInt();
     
    
     if(op==1){
         System.out.print("Policy Term : ");
         int term=sc.nextInt();
         System.out.print("Benifit Percent : ");
         float ben=sc.nextFloat();
         LifeInsurance lins=new LifeInsurance();
         lins.setAmountCovered(amt);
     lins.setInsuranceName(name);
     lins.setInsuranceNo(num);
         lins.setTerm(term);
         lins.setBenifit(ben);
        double prem=lins.calculatePremium();
        addPolicy(lins,prem);
     }
     else if(op==2){
           System.out.print("DepPercent : ");
           float dep =sc.nextFloat();
           MotorInsurance mot=new MotorInsurance();
           mot.setAmountCovered(amt);
     mot.setInsuranceName(name);
     mot.setInsuranceNo(num);
          mot.setDep(dep);
        double prem=mot.calculatePremium();
        addPolicy(mot,prem);
     }
     else{
         System.out.println("Invalid Type");
     }  
  }
static void addPolicy(Insurance ins,double prem){  
    System.out.println("Calculated Premium : "+prem);
}
}
