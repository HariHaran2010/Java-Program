package net.demo;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char c = in.next().charAt(0);
		int a = c + 64;
		System.out.println(a);
		for (char i = c; i >= 'A'; i--) {

			System.out.print(i + " ");
			in.close();
		}

	}

}
