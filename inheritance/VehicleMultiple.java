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

    
    //Parent
class VehicleMultiple {
	public void whoAmI() {
		System.out.println("Im Vehicle");
	}
}

//Child
class Bike extends VehicleMultiple {
	public void ride() {
		System.out.println("You can ride with me");
	}
}

//Child
class Yamaha extends Bike{
	public void color() {
		System.out.println("This is my color");
	}
}

class Main {
	public static void main(String args) {
		Yamaha yamaha = new Yamaha();
		yamaha.color();
		yamaha.whoAmI();
		yamaha.ride();
	}
}

    

