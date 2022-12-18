package net.demo;

class Program35 {
	void reverseString(String string) {
		if ((string == null) || (string.length() <= 1))
			System.out.println(string);
		else {
			System.out.print(string.charAt(string.length() - 1));
			reverseString(string.substring(0, string.length() - 1));
		}
	}

	public static void main(String[] args) {
		String str = "I NOT LIKE MY LIFE ";
		Program35 rs = new Program35();
		rs.reverseString(str);
	}
}