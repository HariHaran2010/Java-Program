package net.demo;

public class Encapsulation {
	public static void main(String[] args) {

		int total = 1 + 1 + 1 + 1 + (-1);

		System.out.println("Total : " + total);

		int total2 = 1 + 1 + 1 + 1 + Math.abs(-1);

		System.out.println("Total 2 (absolute value) : " + total2);

	}

}
