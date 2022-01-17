/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise5;

/**
 *
 * @author simbongile.mbombo
 */
public class Exercise5_3 {
    
    public static void main(String[] args) {
    
    String Name = "Bob Mali";
    String message;
            
    double price = 21.99;
    int quantity = 2;
    double tax = 1.04;
   
    String items[];
    items = new String[4];
    items[0] = "Hat";
    items[1] = "Belt";
    items[2] = "Boots";
    items[3] = "Shirt";
    
    message = Name + " This is "+items.length+" items.";
    System.out.println(message);
    
    
    System.out.println("Items purchased: ");
    
    for (String item : items ){
       System.out.print(item + ", ");
    }
}    
    
}
