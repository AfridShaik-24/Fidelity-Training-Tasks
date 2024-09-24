/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

class Vehicles{
    int registNum;
    String brand;
    public Vehicles(int registNum,String brand){
        this.registNum=registNum;
        this.brand=brand;
}
}
class Car extends Vehicles{
    int numDoors;
    public Car(int registNum,String brand,int numDoors){
         super(registNum,brand);
          this.numDoors=numDoors;
    }
 
    public int parkingCal(){
        int fee=numDoors*7;
        return fee;
    }
}
class Bike extends Vehicles{
 String enginetype;
 public Bike(int registNum,String brand,String enginetype){
      super(registNum,brand);
     this.enginetype=enginetype;}
  public int parkingCal(){
      int fee=enginetype.length()*3;
      return fee;
    }
}
public class ParkingFee {
    public static void main(String[] args){
        Bike c=new Bike(1717,"Hero-Honda","Straight-four");
        System.out.println("Bike Registration Number :"+c.registNum+"\nParking fee of this vehicle"+c.parkingCal());
         Bike c1=new Bike(0011,"Pulsar","parallel twin");
               System.out.println("Bike Registration Number :"+c1.registNum+"\nParking fee of this vehicle"+c1.parkingCal());
         Car b=new Car(9878,"Benz",4);
               System.out.println("Car Registration Number :"+b.registNum+"\nParking fee of this vehicle"+b.parkingCal());
                 Car b1=new Car(2299,"Mahindra XUV",8);
               System.out.println("Car Registration Number :"+b1.registNum+"\nParking fee of this vehicle"+b1.parkingCal());
    } 
}
