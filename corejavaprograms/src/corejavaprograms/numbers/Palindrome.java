package corejavaprograms.numbers;

public class Palindrome {
	// original Number=reverse Number 
	//454 
	public static boolean isPalindrome(int n) {
		int reverse=0,r=0,temp=n;
		while(n>0) {
			r=n%10;
			reverse =(reverse*10)+r;
			n /=10;
		}
		if(temp==reverse) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		int n=123;
		if(isPalindrome(n)) {
			System.out.println(n + ": is Palindrome");
		}
		else {
			System.out.println(n + ": is not  Palindrome");
		}
      
	}

}
