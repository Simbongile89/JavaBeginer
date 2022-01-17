/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise8;

/**
 *
 * @author simbongile.mbombo
 */
public class Exercise8_2 {
    
     
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", "+colorCode);
    }
    public void setItemFields(String desc, int qty, double pr) {
        this.desc = desc;
        this.quantity = qty;
        this.price = pr;
    }

   
    public int setItemFields(String desc, int qty, double pr, char c) {
        if (c != ' ') {
            colorCode = c;
            this.setItemFields(desc, qty, pr);
            return 1;
        } else return -1;
    }
}

    


    


