/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6_PutriAnggraeniYane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lenovo
 */
public class nilai_bufferedReader 
{  
    public static void main(String[]args)
    {
      BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
      String r="";
      String s="";
      String t="";

      try{
       System.out.print("Masukkan nilai pertama Anda: ");
       r = nilai.readLine();
       System.out.print("Masukkan nilai kedua Anda: ");
       s = nilai.readLine();
       System.out.print("Masukkan nilai ketiga Anda: ");
       t = nilai.readLine();
      }catch(IOException e){
       System.out.println("Kata yang Anda masukkan salah, silahkan coba lagi.");
      }
      int pertama;
      int kedua;
      int ketiga;

      pertama = Integer.parseInt(r);
      kedua = Integer.parseInt(s);
      ketiga = Integer.parseInt(t);

      int rata_rata=(pertama+kedua+ketiga)/3;

      System.out.println("Rata-rata nilai Anda: "+rata_rata);

       if (rata_rata<=60){System.out.println(":-(");
      }
      else {
       System.out.println(":-)");
      }
     }
    }

