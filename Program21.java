package net.demo;

import java.util.Scanner;

public class Program21 {

	private static Scanner scan;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int initial = scan.nextInt();
		int temp = initial;
		int digit = 0, amstrong = 0;

		while (temp != 0) {
			temp = temp / 10;
			digit++;
		}
		System.out.println("Digit Count : " + digit);
		temp = initial;
		int n = 0;
		while (temp != 0) {
			n = temp % 10;
			int a = (int) Math.pow(n, digit);
			amstrong = amstrong + a;
			temp = temp / 10;
		}
		System.out.println("Final Value : " + amstrong);

		if (initial == amstrong) {
			System.out.println("The Given number is Amstrong Number");

		} else {
			System.out.println("The Given number is not an Amstrong Number");
		}
		Scanner close;
		}
}
