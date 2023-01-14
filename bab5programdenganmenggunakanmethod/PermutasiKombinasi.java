/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5programdenganmenggunakanmethod;

/**
 *
 * @author Lenovo
 */
public class PermutasiKombinasi 
{
    public static void main(String[] args) 
    
    {
        Scanner sausan = new Scanner(System.in);
        int a,;
        do {
            System.out.println("Program Penghitung Kombinasi dan Permutasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            a = sausan.nextInt();
            if (a == 1) {
                System.out.print("Masukkan nilai n = ");
                int n = sausan.nextInt();
                System.out.print("Masukkan nilai r = ");
                int r = sausan.nextInt();
                permutasi(a, n, r);
            } else if (a == 2) {
                System.out.print("Masukkan nilai n = ");
                int n = sausan.nextInt();
                System.out.print("Masukkan nilai r = ");
                int r = sausan.nextInt();
                kombinasi(a, n, r);
            }
        } while (a != 3);
    }

}