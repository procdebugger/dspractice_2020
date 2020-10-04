package com.sandesh.az;

public class CombinationCalculator {
	public int calculateCombination(int c, int r) {
		Fact factorial = new Fact();
		if(r == 0) {
			return factorial.fact(c);
		}
		
		if(c == 0) {
			return 1;
		}
		
		return (factorial.fact(c)/(factorial.fact(r)*factorial.fact(c-r)));
	}
}
