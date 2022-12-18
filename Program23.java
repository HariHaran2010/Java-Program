package net.demo;

import java.util.Scanner;

class Program23 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Units: ");
		int units = 75;

		double billpay = 0;

		if (units < 100) {
			billpay = units * 1.50;
		} else if (units > 100 && units < 200) {
			billpay = units * 3.00;
		} else if (units > 200) {
			billpay = units * 5.00;
		}

		System.out.println("Bill to pay : " + billpay);
		scan.close();
	}
}