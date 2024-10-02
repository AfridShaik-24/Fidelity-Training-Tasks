/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Task4;

/**
 *
 * @author Administrator
 */
public class Tree {
    public Node root;
    public void traversal(Node n){
       if(n==null) return;
       System.out.print(n.data+" ");
        traversal(n.left);
        traversal(n.right);
    }
}
