/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6_PutriAnggraeniYane;

/**
 *
 * @author Lenovo
 */
public class pangkat_doWhile 
{
    public static void main(String[] args)
    {
        int batas = 100;
        int nomor = 0;
    
    do
    {
        System.out.println(nomor*nomor + " adalah perpangkatan dari " + nomor);
        nomor++;
    }
        while (nomor<=batas);
    } 
}
