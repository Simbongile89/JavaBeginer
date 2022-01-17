/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise13_1;

/**
 *
 * @author simbongile.mbombo
 */
import com.mycompany.exercise13_1.Exercise13_2.Trousers;
  import java.util.ArrayList;
import java.util.function.Predicate;
public class ExerciseTest13_2 {
   


    ArrayList<Exercise13_2> items = new ArrayList();
    
    public static void main(String[] args){
        Exercise13_2 cart = new Exercise13_2();
        cart.fillCart();
        cart.removeItemFromCart("Trousers");
    }
    
    public void fillCart(){
        items.add(new Exercise13_2("Der",'M','R'));
        items.add(new Exercise13_2("Big",'M','Y'));
        items.add(new Exercise13_2("Nel",'B','M'));
        items.add(new Exercise13_2("Zero",'G','F'));
    }
    
    public void removeItemFromCart(String desc){
        items.removeIf(i -> i.getDesc().equals(desc));
        System.out.println("Cart after removing Trousers: \n"+items);
    }

    private void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

public class Exercise13_1 extends ExerciseTest13_2{
    private char size;
    
    public Exercise13_1(double price, char size, char colorCode){
        super ();
        this.setSize(size);
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+getSize());
    } 

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
    }
}

