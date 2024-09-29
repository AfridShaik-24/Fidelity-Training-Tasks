/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;
class Game{
    String name;
    int players;
    public Game(String name,int player){
        this.name=name;
        this.players=player;
    }
    public String toString(){
        return "Maximum number of player for "+name +" is "+players;
    }  
}
class GamewithTimelimit extends Game{
    int timelimit;
    public GamewithTimelimit(String name,int players,int time){
        super(name,players);
        this.name=name;
            this.timelimit=time;
}
   public String toString(){
      return  super.toString()+" Time limit for "+name+" is "+timelimit+" minutes";
    }
}
public class Program {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Ente a game :");
     String name=sc.nextLine();
      System.out.println("Enter the maximum number of players :");
      int player=sc.nextInt();
      sc.nextLine();
      Game game=new Game(name,player);
      
       System.out.println("Ente a game that has time limit :");
     String namewithlimit=sc.nextLine();
      System.out.println("Enter the time limit :");
      int time=sc.nextInt();
      GamewithTimelimit limit=new GamewithTimelimit(namewithlimit,player,time);
       System.out.println(game.toString());
        System.out.println(limit.toString());
      
    }
      
}
