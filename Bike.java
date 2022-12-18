package net.demo;

abstract class  Honda4 {
	abstract void run();
}

class Bike extends Honda4 
{
	void run() {
		System.out.println("Drive Without Drink");
	}

	public static void main(String args[]) {
		Honda4 obj = new Bike();
		obj.run();
	}
}