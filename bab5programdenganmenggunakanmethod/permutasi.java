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
public class permutasi 
{
    public static int permutasi(int p, int q, int s) {

        int b = q - s;
        int c = 1, d = 1;
        for (int j = q; j >= 1; j--) {
        }
        for (int k = q; k >= 1; k--) {
            d = d * k;
        }
        for (int j = b; j >= 1; j--) {
        }
        for (int k = b; k >= 1; k--) {
            c = c * k;
        }
        int e = d / c;
        System.out.printf("%13s", "n!" + "\n");
        System.out.println("nPr = _ _ _ _ _ _ = " + e);
        System.out.printf("%14s", "(n-r)!");
        System.out.println("");
        return e;
    }
    
}
