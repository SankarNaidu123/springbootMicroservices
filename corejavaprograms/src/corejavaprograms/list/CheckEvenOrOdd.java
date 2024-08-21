package corejavaprograms.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CheckEvenOrOdd {

	public static void main(String[] args) {

		int number = 12;
		// using conditional statements
		evenOrOdd(number);

		// using ternary operator
		checkEvenOrOdd(number);

		// to check number is prime or not
		checkPrime(number);

		// check prime number with in range
		checkPrimeUsingIntStream(100);

		if (number % 5 == 0) {
			System.out.println("\n" + number + ":is divisible by 5");
		} else {
			System.out.println("\n" + number + ":is not divisible by 5");
		}

		// check given character is alphabet or digit
		char ch = 'a';
		if (Character.isAlphabetic(ch)) {
			System.out.println(ch + ":is a Alphabet!");
		} else {
			System.out.println(ch + ":is not a Alphabet");
		}
		List<Integer> ar=List.of(1,2,1,2,1,3,2);
		
      System.out.println(sockMerchant(7,ar));
	}

	public static int sockMerchant(int n, List<Integer> ar) {
		// Write your code here
		//n =7 [1,2,1,2,1,3,2]
		//int pair=0;
		for(int i=0;i<n;i++) {
			if(ar.contains(ar.get(i))) {
				ar.get(i+1);
				//count++;
			}
			else {
				ar.get(i);
			}
		}
		return 0;

	}

	private static void checkPrimeUsingIntStream(int end) {
		IntStream.range(2, end).filter(CheckEvenOrOdd::isPrime).forEach(n -> System.out.print(n + ","));
	}

	// check isPrime or not
	private static boolean isPrime(int number) {
		boolean isPrime = true;
		if (number == 0 || number == 1) {
			System.out.println("0 and 1 are not prime numbers");
		} else {
			for (int i = 2; i < number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;

	}

	private static void checkPrime(int number) {
		int m, flage = 0;
		m = number / 2;
		if (number == 0 || number == 1) {
			System.out.println(number + " :is not prime number");
		} else {
			for (int i = 2; i < m; i++) {
				if (number % i == 0) {
					System.out.println(number + ":is not prime number");
					flage = 1;
					break;
				}
			}
		}
		if (flage == 0) {
			System.out.println(number + ":is prime number");
		}
	}

	private static void checkEvenOrOdd(int number) {
		String result = (number % 2 == 0) ? "even" : "Odd";
		System.out.println(result);
	}

	private static void evenOrOdd(int number) {
		if (number % 2 == 0) {
			System.out.println(number + ":is even");
		} else {
			System.out.println(number + " :is Odd");
		}
	}

}
