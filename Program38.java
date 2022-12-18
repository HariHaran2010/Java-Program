package net.demo;

import java.io.*;

class Program38 {
	static int summation(int n) {
		int sum = 0, j = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum + j;
			j = (j * 10) + 1;
		}

		return sum;
	}

	public static void main(String args[]) {
		int n = 5;
		System.out.println(summation(n));
	}
}
