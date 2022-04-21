package week1.day2ass2;

import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		// Array sorted
		Arrays.sort(arr);

		int n = arr.length + 1;
		int totalsum = (n * (n + 1)) / 2;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
			System.out.println(arr[i]);

		}

		System.out.println("Missing number is" + (totalsum - sum));

	}

}