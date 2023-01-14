/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_PutriAnggraeniYane;

/**
 *
 * @author Lenovo
 */
import javax.swing.JOptionPane;
import javax.swing.*;

public class soal_5_2 
{ 
    public static void main( String[] args )
    { 
        String w = "10"; 
        w = JOptionPane.showInputDialog("Enter Word 1"); 
        String msg = "" + w + ""; 
        
        
        String ww = "20"; 
        ww = JOptionPane.showInputDialog("Enter Word 2"); 
        String mm = "" + ww + "";
        
        String www = "30"; 
        www = JOptionPane.showInputDialog("Enter Word 3"); 
        String mmm = "" + www + "";

        JOptionPane.showMessageDialog(null, ("" + msg + "  " + mm + "  " + mmm +" ")); 

    } 
} 
    
