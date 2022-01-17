/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise13_1;

/**
 *
 * @author simbongile.mbombo
 */

import java.util.*;

public class Exercise13_1 {
    
    


    public static void main(String[] args){
        
            String[] days = {"monday","saturday","tuesday","sunday","friday"};            
            
            
            ArrayList<String> dayList = new ArrayList(Arrays.asList(days));
            for (String s : dayList){
               if (s.equals("sunday")){
                   System.out.println(s.toUpperCase());
               }
               else System.out.println(s);
            }
            System.out.println(dayList);            
    }
}               

    

