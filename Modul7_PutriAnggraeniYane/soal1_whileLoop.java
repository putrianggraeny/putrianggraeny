/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7_PutriAnggraeniYane;

/**
 *
 * @author Lenovo
 */
public class soal1_whileLoop {
    public static void main(String[]args)
    {
        String[] hari = { "Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};

        int i=0;
        while(i<hari.length)
            {
                System.out.println(hari[i]);
               i++;
            }
    }
}
