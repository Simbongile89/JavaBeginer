/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise12;

import javax.lang.model.SourceVersion;

/**
 *
 * @author simbongile.mbombo
 */
public class Exercise12_3 {
    
    private int id;
    private String desc;
    private double price;
    static int nextId = 1;
    
        public Exercise12_3(){
        setId();
        setDesc("No description assigned.");
        setPrice(0.00);
    }
    
        public Exercise12_3(String desc, double price) {
        setId();
        setDesc(desc);
        setPrice(price);
    }

    Exercise12_3(double d, char c, char c0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void display(){
        System.out.println("Item description: "+getDesc());
        System.out.println("\tID: "+getId());
        System.out.println("\tPrice: "+getPrice());
    }

    private void setId() {
        id = Exercise12_3.nextId++;
    }

    public int getId() {
        return id;
    }

    private void setDesc(String no_description_assigned) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPrice(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getDesc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class Shirt extends Exercise12_3{
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColor Code: "+ colorCode);
    } 

        

    }

    public class Exercise2_3 extends Exercise12_2{
    private char size;
    private char colorCode;
    
    public Exercise2_3(double price, char size, char colorCode){
        super ();
        this.size = size;
        this.colorCode = colorCode;
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColor Code: "+ colorCode);
    } 
    }
}

