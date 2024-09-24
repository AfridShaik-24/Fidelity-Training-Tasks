
package javaapplication1;


class Vehicle{
public void vehicletype(){
System.out.println("It is a four wheeler");
}
}
class Benz extends Vehicle{
public void vehicleModel(){
System.out.println("Model : Mercedes-Benz E-Class");
}
}
class Toyota extends Vehicle{
public void vehicleModel(){
System.out.println("Model : Urban Cruiser Hyryder");
}
}
public class Hierarchial {
     public static void main(String[] args){
         Toyota to=new Toyota();
         Benz be=new Benz();
         to.vehicletype();
         be.vehicletype();
}
}
