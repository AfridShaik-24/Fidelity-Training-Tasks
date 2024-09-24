/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
public class Product {
   int proid;
   String proname;
   int price;
   public Product(int proid,String proname,int price){
       this.proid=proid;
       this.proname=proname;
       this.price=price;
   }
    public void display(){ 
        System.out.println("Product Id :"+proid+ "\nProduct Name :"+proname+"\nProduct Price :"+price);
        System.out.println();
    }
    public static void main(String[] args){
        Product pro1=new Product(1,"Car",700000);
         Product pro2=new Product(2,"Bicycle",10000);
          Product pro3=new Product(3,"Bike",100000);
           Product pro4=new Product(4,"Tractor",200000);
            Product pro5=new Product(5,"Auto",200000);
            pro1.display();
             pro2.display();
              pro3.display();
               pro4.display();
                pro5.display();
    }
}
