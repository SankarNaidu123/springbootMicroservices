package corejavaprograms.numbers;

import java.util.Arrays;
import java.util.List;

public class PrintEvenNumbers {
	
	public static  void printEvenNumbers(List<Integer> numbers) {
		numbers.stream().filter(number->number%2==0)
	     .forEach(n->System.out.println(n));
	}
	
	public static  void printOddNumbers(List<Integer> numbers) {
		numbers.stream().filter(number->number%2!=0)
	     .forEach(n->System.out.println( n));
	}

	public static void main(String[] args) {
		
     List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
     System.out.println("Even Numbers:");
     printEvenNumbers(numbers);
     System.out.println("Odd Numbers:");
     printOddNumbers(numbers);
     
	}

}
