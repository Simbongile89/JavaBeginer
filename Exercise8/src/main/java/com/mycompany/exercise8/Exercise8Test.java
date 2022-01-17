/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise8;

/**
 *
 * @author simbongile.mbombo
 */
public class Exercise8Test {
    public static void main(String[] args) {
        Exercise8_2 item1 = new Exercise8_2();

        item1.setItemFields("Belt", 1, 29.50);
        item1.displayItem();

        int retcode = item1.setItemFields("Shirt", 1, 34.99, ' ');
        if (retcode < 0) {
            System.out.println("Invalid color code.  Item not added.");
        } else {
            item1.displayItem();
        }
    }
}
    

