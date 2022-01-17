/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise13_1;

/**
 *
 * @author simbongile.mbombo
 */
public class Exercise13_2 {
    
    
    private int id;
    private String desc;
    private double price;
    private char colorCode;
    static int nextId = 1;
    
    
    public Exercise13_2(){
        setId();
        setDesc("No description assigned.");
        setPrice(0.00);
        setColorCode('U');
    }
    public String getColor(){
    String color = "";
    switch (colorCode){
        case 'R':
            color = "Red";
            break;
        case 'G':
            color = "Green";
            break;
        case 'B':
            color = "Blue";
            break;
        case 'Y':
            color = "Yellow";
            break;
        default:
            color = "Invalid code";
    }
    return color;
    }
    public String toString(){
       return this.getDesc();
    }
    public Exercise13_2(String desc, double price, char cCode) {
        setId();
        setDesc(desc);
        setPrice(price);
        setColorCode(cCode);
    }
    
    public void display(){
        System.out.println("Item description: "+getDesc());
        System.out.println("\tID: "+getId());
        System.out.println("\tPrice: "+getPrice());
        System.out.println("\tColor: "+getColorCode());
    }

    
    private void setId() {
        id = Exercise13_2.nextId++;
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

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    void fillCart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void removeItemFromCart(String trousers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public class Trousers extends Exercise13_2 {
    private int size;
    private char gender;
    private String fit;
    
    public Trousers(double price, int size, char colorCode, String fit,char gender){
        super ("Trousers", price, colorCode);
        this.setSize(size);
        this.setGender(gender);
        this.setFit(fit);
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+getSize());
        System.out.println("\tGender: "+ getGender());
        System.out.println("\tFit: "+ getFit());
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }
   
}
    
    
}

