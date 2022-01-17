/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise6;

/**
 *
 * @author simbongile.mbombo
 */
public class Exercise6_2 {
  
public int ID;
public int quantity;
public String descr;
public double price;

public static void main(String[] args) {
    Item item1, item2;
    item1 = new Item();
    item2 = new Item();
    

item1.descr = "Shirt";
 item2.descr = "Pants";


    item1 = item2;
    System.out.println("Item1: " + item1.descr);
    System.out.println("Item2: " + item2.descr);


}
}

