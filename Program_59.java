package question;

import java.util.Scanner;

public class Program_59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String s1 = sc.nextLine();
		System.out.println("Enter the 2nd  String");
		String s2 = sc.nextLine();
		int output = -1;
		char value1 = s2.charAt(0);

		if (s1.contains(s2)) {
			for (int i = 0; i < s1.length(); i++) {
				char value2 = s1.charAt(i);
				if (value1 == value2) {
					output = s1.indexOf(value2);
				}

			}
			System.out.println(output);
		} else {
			System.out.println(-1);
		}
             sc.close();
	}

}
