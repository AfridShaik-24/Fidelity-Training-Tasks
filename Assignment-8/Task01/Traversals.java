/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Assignment_8.Task01;


public class Traversals {
    public static void main(String[] args){
        Tree tree=new Tree();
        tree.root=new Node('+');
        tree.root.left=new Node('-');
        tree.root.left.left=new Node('A');
         tree.root.left.right=new Node('*');
          tree.root.left.right.left=new Node('/');
           tree.root.left.right.right=new Node('2');
            tree.root.left.right.left.right=new Node('5');
             tree.root.left.right.left.left=new Node('C');
             
             tree.root.right=new Node('%');
              tree.root.right.left=new Node('*');
               tree.root.right.right=new Node('4');
                tree.root.right.left.left=new Node('D');
                 tree.root.right.left.right=new Node('5');
                 
                 System.out.println("Inorder Traversal");
                 tree.inOrderTraversal(tree.root);
                  System.out.println("Preorder Traversal");
                 tree.preOrderTraversal(tree.root);
                  System.out.println("Postorder Traversal");
                 tree.postOrderTraversal(tree.root);
        
    }
}
