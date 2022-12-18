package net.demo;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter N : ");
			int n = sc.nextInt();
			System.out.print("Enter Symbol : ");
			char c = sc.next().charAt(0);
			int j, i = 1;
			int k = n * 2 - 1;
			do {
				j = 1;
				do {
					if (j == i || j == k - i + 1)
						System.out.print(c);
					System.out.print(" ");
					j++;
				} while (j <= k);
				System.out.println();
				i++;
			} while (i <= k);
		}
	}
}
