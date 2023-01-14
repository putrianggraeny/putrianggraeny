/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author Lenovo
 */

// STATIC OVERLOADING

public class Putri 
{

  public void Anggraeni() 
  {
    for (int i = 1; i < 10; i++) 
    {
      System.out.print(i);
    }
  }

  
  public void Anggraeni(char ss) 
  {
    for (int j = 1; j > 10; j--) 
    {
      System.out.print(ss);
    }
  }
  
}

class Mainn 
{
  public static void main(String[] args) 
  {
    Putri p1 = new Putri();

    // call method without any argument
    p1.Anggraeni();
    System.out.println("\n");

    // call method with a single argument
    p1.Anggraeni('j');
  }
}

  
