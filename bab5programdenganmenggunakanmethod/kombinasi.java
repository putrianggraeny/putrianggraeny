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
public class kombinasi 
{
    private static int kombinasi(int t, int u, int v) {
        int b = u - v;
        int c = 1, d = 1, f = 1;
        for (int j = u; j >= 1; j--) {
        }
        for (int k = u; k >= 1; k--) {
            d = d * k;
        }
        for (int j = b; j >= 1; j--) {
        }
        for (int k = b; k >= 1; k--) {
            c = c * k;
        }
        for (int j = v; j >= 1; j--) {
        }
        for (int k = v; k >= 1; k--) {
            f = f * k;
        }
        int e = d / (f * c);
        System.out.printf("%13s", "n!" + "\n");
        System.out.println("nCr = _ _ _ _ _ _ = " + e);
        System.out.printf("%17s", "r! x (n-r)!");
        System.out.println("");
        return e;
    }
}
    
