/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism2;

import static Putri120922.ExampleOverloading.minFunction;

/**
 *
 * @author Lenovo
 */

abstract class minFunction 
{
	
	protected abstract void minFunction();
	
}

public class Example {
    public static void main(String[] args) 
	{
	int a = 11;
	int b = 6;
	double c = 7.3;
	double d = 9.4;
	int result1 = minFunction(a, b);
	
	// same function name with different parameters
	double result2 = minFunction(c, d);
	System.out.println("Minimum Value = " + result1);
	System.out.println("Minimum Value = " + result2);
	}
}
