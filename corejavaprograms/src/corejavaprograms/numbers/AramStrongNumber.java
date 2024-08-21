package corejavaprograms.numbers;

import java.util.Scanner;

public class AramStrongNumber {

	public static boolean isAramStrongNumber(int n) {
		int temp, digit = 0, last = 0;
		double sum = 0;
		temp = n;
		//to calculate no of digits 
		while (temp > 0) {
			temp = temp / 10;
			digit++;
		}
		temp = n;
		while (temp > 0) {
			last = temp % 10;// calculate last number
			sum += (Math.pow(last, digit));
			temp = temp / 10;
		}
		if (n == sum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		/*
		 * int n=153; if(isAramStrongNumber(n)) { System.out.println(n +
		 * ": is AramStrong Number"); } else { System.out.println(n +
		 * ": is not AramStrong Number"); }
		 */

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit:");
		num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
			if (isAramStrongNumber(i)) {
				System.out.print(i + ",");
			}
		}

	}

}
