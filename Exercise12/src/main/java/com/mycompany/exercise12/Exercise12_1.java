/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise12;

/**
 *
 * @author simbongile.mbombo
 */
public class Exercise12_1 {
    
    ;


    private int id;
    private String desc;
    private double price;
    static int nextId = 1;
    
    public Exercise12_1(){
    
        setId();
        setDesc("No description assigned.");
        setPrice(0.00);
    }
    
    public Exercise12_1(String desc, double price) {
        setId();
        setDesc(desc);
        setPrice(price);
    }
    
    public void display(){
        System.out.println("Item description: "+getDesc());
        System.out.println("\tID: "+getId());
        System.out.println("\tPrice: "+getPrice());
    }

    private void setId() {
        id = Exercise12_1.nextId++;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    private void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
}
}

