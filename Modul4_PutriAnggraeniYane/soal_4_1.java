/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_PutriAnggraeniYane;

/**
 *
 * @author Lenovo
 */
public class soal_4_1 
{
    public static void main( String[] args )
    {
        int i = 0;
        int j = 10;
        boolean test= false;
        char x;
        x = 'a';
        
        test = (i < 10) || (j++ > 9); 
        System.out.println("Number = "+j); 
        System.out.println("Letter = "+x); 
        System.out.println("Result = "+test); 
        System.out.println("str = Hello!");
    }
    
}
