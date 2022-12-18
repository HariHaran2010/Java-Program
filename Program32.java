package net.demo;

class Name {
	int date;
	String name;
	static String app = "INSTAGRAM";

	Name(int r, String n) {
		date = r;
		name = n;
	}

	void display() {
		System.out.println(date + " " + name + " " + app);
	}
}

public class Program32 {
	public static void main(String args[]) {
		Name p1 = new Name(1412, "HOPE");
		Name p2 = new Name(2010, "HARI");
		p1.display();
		p2.display();
	}
}
