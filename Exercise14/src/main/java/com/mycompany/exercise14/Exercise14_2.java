/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise14;

/**
 *
 * @author simbongile.mbombo
 */
public class Exercise14_2 {
   
    public static void main(String[] args){
        Exercise14_2 calc = new Exercise14_2();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: "+addResult);
        
        try {           
            double divResult = calc.divide(15, 0);
            System.out.println("Division Result: "+divResult);
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }        
    }

    private int add(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private double divide(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
    
    

