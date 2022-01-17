/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise8;

/**
 *
 * @author simbongile.mbombo
 */
public class Exercise8_1 {
    
     char color;
    

    public boolean setColor(char colorCode){
        if (colorCode == ' '){
            return false;
        }
        else {
            this.color = colorCode;
            return true;
        }
    }
    



    public static void main(String[] args){
        Exercise8_1 item1 = new Exercise8_1();

        if (item1.setColor('B')){
            System.out.println("Item1.color = "+item1.color);
        }else System.out.println("Invalid color");
    }
}   


