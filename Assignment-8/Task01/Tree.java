/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Assignment_8.Task01;

/**
 *
 * @author Administrator
 */
public class Tree {
   Node root;
   public void inOrderTraversal(Node n){
       if(n==null) return;
       inOrderTraversal(n.left);
       System.out.println(n.ele);
       inOrderTraversal(n.right);
   }
   public void preOrderTraversal(Node n){
       if(n==null){
           return;
       }
       System.out.println(n.ele);
       preOrderTraversal(n.left);
       preOrderTraversal(n.right);
   }
   public void postOrderTraversal(Node n){
       if(n==null){
           return;
       }
       postOrderTraversal(n.left);
       postOrderTraversal(n.right);
       System.out.println(n.ele);
   }
}
