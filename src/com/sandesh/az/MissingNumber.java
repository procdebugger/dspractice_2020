package com.sandesh.az;

public class MissingNumber {
	
	public int findMissingNumber(int[] numbers, int count) {
		// TODO Auto-generated constructor stub
		
		int sumOfNumbers = 0;
		for (int i : numbers) {
			sumOfNumbers = sumOfNumbers + i;
		}
		
		int expectedSumOfNumbers = 0;
		for (int i = 1; i <= count; i++) {
			expectedSumOfNumbers = expectedSumOfNumbers + i;
		}
		
		
		return expectedSumOfNumbers-sumOfNumbers;
	}
}
