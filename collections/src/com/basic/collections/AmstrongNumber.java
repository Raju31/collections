package com.basic.collections;

import java.util.Scanner;

public class AmstrongNumber {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = null;
		int l, h, temp = 0, sum = 0;
		scanner = new Scanner(System.in);
		System.out.println("please enter lower limit:");
		l = scanner.nextInt();
		System.out.println("please enter higher limit:");
		h = scanner.nextInt();
		for (int i = l; i < h; i++) {
			int x = i;
			temp = x;
			sum = 0;
			while (x > 0) {
				int rem = x % 10;
				sum = sum + (rem * rem * rem);
				x = x / 10;

			}
			if (temp == sum) {
				System.out.println(temp + " is am number");

			} else {
				System.out.println(temp + " is not a am number");
			}

		}

	}

}
