/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise11;

/**
 *
 * @author simbongile.mbombo
 */
public class Exercise11_3 {
    
    


    private int id;
    private String desc;
    private double price;
    private boolean isBackOrdered;
    private static int nextId = 1;

    public Exercise11_3(String desc, double price) {
        setId();
        this.desc = desc;
        this.price = price;
        checkStock();
    }

    

    private void checkStock(){ 
        
        double num = Math.random() * 1000;
        if ((int)num % 2 == 1 ){  
            this.isBackOrdered = true;
            System.out.println(getDesc() +" is back ordered.");
        }
        else this.isBackOrdered();
    }


    private void setId() {
        id = Exercise11_3.nextId++;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
       this.price = price;
}

    private void isBackOrdered() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}


