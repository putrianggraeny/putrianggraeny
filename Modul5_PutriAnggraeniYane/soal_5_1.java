/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_PutriAnggraeniYane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lenovo
 */

public class soal_5_1 
{

    public static void main( String[] args ){ 
 
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
        String w = "";

        System.out.print("Enter word 1 :"); 

        try
        { 
        w = dataIn.readLine();
        }catch( IOException e )
        { 
        System.out.println("Error!"); 
        } 

       String ww = "";

        System.out.print("Enter word 2 :");

        try
        { 
           ww = dataIn.readLine();
        }
        catch( IOException e )
        { 
        System.out.println("Error!"); 
        } 

       String www = "";

        System.out.print("Enter word 3 :");

        try
        {  
       www = dataIn.readLine();
        }
        catch( IOException e )
        { 
        System.out.println("Error!"); 
        } 

        System.out.println("" + w + "  " + ww + "  " + www +" ");
        } 
}
