/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7_PutriAnggraeniYane;

import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException;
/**
 *
 * @author Lenovo
 */
public class soal2_BReader 
{
    public static void main( String[] args )
    { 
        int angka[] = new int[10];
        int x=0,z=0;
        String y=null;
        int maks=angka[0];
        int n = angka[0];
        
        for (x=0;x<10;x++)
        {
        BufferedReader dataIn = new BufferedReader(new 
        InputStreamReader( System.in) ); 
        
        try
        { 
            System.out.print("Masukkan Angka ke " +(x+1)+ " : "); 
            y = dataIn.readLine();
            angka[x] = Integer.parseInt(y);
        }
        catch( IOException e )
        { 
            System.out.println("Error!"+e); 
        } 
        if (angka[x] > maks)
            maks = angka[x];
        
    }
            
        System.out.println("Angka terbesar adalah :"+maks);
}
}