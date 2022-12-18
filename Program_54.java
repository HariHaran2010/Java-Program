package question;

import java.util.Arrays;

public class Program_54 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int temp = 0;
		for (int i = 0; i < a.length; i += 2) {
			for (int j = i + 2; j < a.length; j += 2) {
				if (a[i] < a[j] && i % 2 == 0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				} else if (a[i] > a[j] && i % 2 != 0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
				if (i == a.length) {
					i = 1;
				}
			}

		}
		System.out.println(Arrays.toString(a));

	}
}
