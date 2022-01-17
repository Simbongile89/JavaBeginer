/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise12;

/**
 *
 * @author simbongile.mbombo
 */
public class Exercise12_2 {

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     

public class Shirt extends Exercise12_2{
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
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
