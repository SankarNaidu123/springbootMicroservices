package corejavaprograms.numbers;

public class FactorialOfNumber {
	static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact *=i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int n=10;
    System.out.println("Factorail of "+ n +" is :" + factorial(n));
	}

}
