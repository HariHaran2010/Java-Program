package question;

public class Program_57 {

	public static void main(String[] args) {
		String a = "12345";
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((i == j) || (i + j == 5 + 1))
					System.out.print(a.charAt(j - 1));

				else

					System.out.print(" ");

			}
			System.out.println();

		}

	}

}
