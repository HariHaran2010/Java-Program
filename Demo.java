package net.demo;

class Demo {

	public static void main(String args[]) {

		int number = 12345;
		int reverse = 0;

		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * remainder + 10;
			number = number / 10;
		}

	}
}