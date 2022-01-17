/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise11;

/**
 *
 * @author simbongile.mbombo
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Exercise11_1 {
    
    public static void main(String[] args){
	        LocalDateTime orderDate;
        
	        orderDate = LocalDateTime.now();
        System.out.println("Order date: "+ orderDate);

        String fDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Formatted order date: "+ fDate);
    }
}
    

