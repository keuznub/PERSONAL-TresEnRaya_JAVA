/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;

/**
 *
 * @author breix
 * Class to change fonts to Serif Sans indicating just the size
 */
public class ChangeFonts {
    
    public static void changeFont ( Component component, int size ){
        component.setFont(new Font("Sans Serif", Font.BOLD, size));
        if ( component instanceof Container ){
            for ( Component child : ( ( Container ) component ).getComponents () )
            {
                changeFont ( child, size );
            }
        } 
    
    }
}
