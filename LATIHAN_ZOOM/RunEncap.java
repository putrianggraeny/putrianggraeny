/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN_ZOOM;

/**
 *
 * @author Lenovo
 */
public class RunEncap 
{
    public static void main(String args[]) 
    {
      EncapTest encap = new EncapTest();
      encap.setNama("Putri Anggraeni Yane");
      encap.setUmur(18);
      encap.setIdNum("55ms");
      System.out.println("Nama: " + encap.getNama());
      System.out.println("Umur: " + encap.getUmur());
    }
    
}
