package net.demo;

public class Bitwise {

	public static void main(String[] args) {
		int a = 5, b = 10, c;
		c = a & b;
		System.out.println("a&b = " + c);
		c = a / b;
		System.out.println("a^b = " + c);
		c = ~a;
		System.out.println("~a  = " + c);
		c = a ^ b;
		System.out.println("a^b = " + c);
	}
}
