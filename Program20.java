package net.demo;

public class Program20 {
	public static void main(String[] args) {
		int[] arr = new int[] { 25, 11, -7, 87, -56 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Smallest element present in given array: " + min);
	}
}
