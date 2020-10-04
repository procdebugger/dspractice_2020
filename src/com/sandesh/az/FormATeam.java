package com.sandesh.az;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class FormATeam {

	public List<Integer> numberOfTeams(int d, int t, List<Integer> sizeOfTeams) {
		List<Integer> result = new ArrayList<>();
		char array[] = { 'D', 'T' };
		CombinationCalculator calculator = new CombinationCalculator();

		for (int i = 0; i < sizeOfTeams.size(); i++) {
			int teamSize = sizeOfTeams.get(i);
			StringBuffer arrangement = new StringBuffer();
			int maxOfDeveloper = teamSize- d;
			int maxOfTester =  teamSize- t;
			//int totalNumberOfPossibleTeams = calculator.calculateCombination(c, r)
			System.out.println("maxOfDeveloper "+ maxOfDeveloper);
			System.out.println("maxOfTester " + maxOfTester);
		}
		return result;
	}
}