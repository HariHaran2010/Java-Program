package net.demo;

public class Player {
	public static void main(String[] args) {
		int weight = 45;
		int height = 145;
		int age = 19;
		if (age >= 18) {

			if (height >= 155) {

				if (weight >= 50) 
				{
					System.out.println("Eligible");
				} 
				else 
				{
					System.out.println("Not Eligible");
				}
			}
				else
				{
					System.out.println("height not mached");
				}
			}
			else
			{
				System.out.println("Age is under 18");
			}
	}
}
