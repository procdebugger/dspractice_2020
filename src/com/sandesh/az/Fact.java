package com.sandesh.az;

public class Fact {
	// Factorial Implementation
	public int fact(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		return fact(n-1) *n;
	}
}