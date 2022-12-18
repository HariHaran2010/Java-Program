package question;

public class Program_56 {
	public static void main(String[] args) {
		int p = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p++ + " ");
			}
			System.out.println();
		}

	}
}
