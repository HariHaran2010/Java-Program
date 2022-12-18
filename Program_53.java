package question;

import java.util.Scanner;

public class Program_53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String inpt = sc.next();
		char a[] = inpt.toCharArray(), ch = '0';
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= '0' && a[i] <= '9') {
				count = (count * 10) + (a[i] - '0');
			} else if (count > 0) {
				count--;
				for (int j = 0; j < count; j++) {
					System.out.print(ch);
				}
				count = 0;
			}
			if (a[i] > '9') {
				ch = a[i];// a
				System.out.print(a[i]);
			}
			if (i == (a.length - 1)) {
				--count;
				for (int j = 0; j < count; j++) {
					System.out.print(ch);
				}
			}
		}
            sc.close();
	}

}