/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Lenovo
 */
 
import java.util.Scanner;

class A {
  int  putri;
   A()
  {
     putri=5;
  }
}

class B extends A
{
    int  anggraeni;
    B()
   {
     anggraeni=6;
   }
   
}
class C extends B
{
   int yane;
   C()
   {
      yane=7;
   }
}

class MultipleInheritanceExample
{
  public static void main(String args[])
{
    A m=new A();   // class X consist one variable i
    B n=new B();   // class Y consist variables j, i(it came from parent class X)
    C o=new C();   //class Z consist variables k,j(class y), i(class X)
    System.out.println(m.putri); // a-->i=5
    System.out.println(n.putri+n.anggraeni);// b--->i=5,j=6
    System.out.println(o.putri+o.anggraeni+o.yane);// c-->i=5,j=6,k=7
 
}

}

    