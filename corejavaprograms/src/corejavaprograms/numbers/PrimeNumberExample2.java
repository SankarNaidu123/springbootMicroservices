package corejavaprograms.numbers;

public class PrimeNumberExample2 {
	public static void checkPrime(int n) {
		int m = n / 2, flag = 0;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		}
	}

	public static void main(String[] args) {
     checkPrime(4);
     checkPrime(13);
     checkPrime(17);
	}

}
