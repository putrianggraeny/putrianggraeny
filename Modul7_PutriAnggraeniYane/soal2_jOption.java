/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7_PutriAnggraeniYane;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class soal2_jOption 
{
    public static void main(String[]args)
    {
        int[] a = new int[11];
        String[] n = new String[11];
        int terbesar = 0;
        for(int i=1;i+1<=a.length;i++)
        {
            System.out.println(i); //menampilkan array ke
            n[i] = JOptionPane.showInputDialog("Masukkan angka ke-"+i+" :");
            a[i] = Integer.parseInt(n[i]);
            if(terbesar>a[i])
            {
                if(terbesar>a[i])
                {
                terbesar=terbesar;
                System.out.println(terbesar); //menampilkan terbesar dicommandline
                }
            }
            else
            {
                if(a[i]>a[i-1])
                {
                terbesar=a[i];
                }
                else
                {
                terbesar=a[i-1];
                }
                System.out.println(terbesar); //menampilkan terbesar di commandline
            }
        }
        String hasil="Terbesar adalah "+terbesar;
        JOptionPane.showMessageDialog(null,hasil);           
    }   
}
