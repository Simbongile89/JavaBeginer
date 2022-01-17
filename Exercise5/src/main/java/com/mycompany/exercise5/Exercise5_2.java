/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise5;

/**
 *
 * @author simbongile.mbombo
 */
public class Exercise5_2 {
    
    public static void main(String[] args) {
     
    String Name = "Bob Mali";
    String message = Name + " wants to have several items.";
                
    
    String[] items = {"Hat","Socks","Boots","Belt"};
   
    message = Name + " This is"+items.length+" items.";
    System.out.println(message);
   
    System.out.println(items[2]);
}    
}
