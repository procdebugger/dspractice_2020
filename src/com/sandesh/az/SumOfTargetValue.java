package com.sandesh.az;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class SumOfTargetValue {
	public boolean twoNumbersExists(int sum, int[] numbers) {
		
		Set<Integer> twoNumbers = new HashSet();
		for (int i : numbers) {
			if(twoNumbers.contains(sum-i)) {
				return true;
			}else {
				twoNumbers.add(i);
			}
		}
		
		return false;
	}
}
