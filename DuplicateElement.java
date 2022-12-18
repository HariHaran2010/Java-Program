package net.demo;

public class DuplicateElement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 4, 5, 4, 6, 7, 8, 6 };
		System.out.println(arr.length);
		System.out.println("Duplicate Element in Array List");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}
}
