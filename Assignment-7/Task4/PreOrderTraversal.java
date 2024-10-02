/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Task4;

public class PreOrderTraversal {
    public static void main(String[] args){
        Tree tree=new Tree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(4);
        tree.root.right.right=new Node(6);
        tree.traversal(tree.root);
    }
}
