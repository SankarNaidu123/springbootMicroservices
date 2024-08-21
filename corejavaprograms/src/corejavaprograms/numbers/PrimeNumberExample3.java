package corejavaprograms.numbers;

import java.util.Scanner;

public class PrimeNumberExample3 {
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the First Number:");
			int start=sc.nextInt();
			System.out.println("Enter the Second Number:");
			int end=sc.nextInt();
			for(int i=start;i<=end;i++) {
				if(isPrime(i)) {
					System.out.println(i);
				}
			}
		}
    
	}

}
