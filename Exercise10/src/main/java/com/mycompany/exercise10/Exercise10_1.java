/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise10;

/**
 *
 * @author simbongile.mbombo
 */
public class Exercise10_1 {
    

    public static void main (String args[]){
        int x = 4, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("After if stmt, x = " + x);
        
        
        x = ((y / x) < 3) ? (x += y) : (x *= y);
        System.out.println("After ternary op, x = " + x);
    }
}


