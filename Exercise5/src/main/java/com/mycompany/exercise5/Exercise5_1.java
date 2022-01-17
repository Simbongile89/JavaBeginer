/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise5;

/**
 *
 * @author simbongile.mbombo
 */
public class Exercise5_1 {
    
    public static void main(String[] args) {
    String Name = "Bob Mali";
    String itemDesc = "Hat";
    double price = 21.99;
    int quantity = 2;
    double tax = 1.04;
double total;
String message = Name+" This is a  "+quantity+" "+itemDesc;


    total = (price*quantity)*tax;


    
    boolean outOfStock = false;
    if (quantity > 1){
        message = message +"s";
    } 
    
  
    if (outOfStock){  
        System.out.println(itemDesc+" is out of stock.");
    }
    else{
        System.out.println(message);
        System.out.println("Total cost with tax: "+ total);
    }
           
}
    
}
