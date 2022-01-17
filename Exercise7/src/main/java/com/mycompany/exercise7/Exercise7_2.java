/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise7;

/**
 *
 * @author simbongile.mbombo
 */
public class Exercise7_2 {
    
  
    public static void main (String[] args){
        String Name = "Bob Mali";
        String firstName;
        int spaceIdx;
        StringBuilder sb;
       
        spaceIdx = Name.indexOf(" ");
        firstName = Name.substring(0, spaceIdx);
        System.out.println(firstName);
          
        
        sb = new StringBuilder(firstName);

	
        sb.append(" Mali");
	
	
        System.out.println(sb);
    }    
}


