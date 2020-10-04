package com.sandesh.az;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Branch and Bound Problem
public class RoadRepair {
	public int roadRepair(List<Integer> crews, List<Integer> jobs) {
		int result = 0;
		int costs[][] = new int[crews.size()][jobs.size()];
		int i = 0;

		for (Integer crew : crews) {
			int j = 0;
			for (Integer job : jobs) {
				costs[j][i] = Math.abs(job - crew);
				j++;
			}
			i++;
		}

		Set<Integer> assignedWorker = new HashSet<>();

		for (int rowIndex = 0; rowIndex < crews.size(); rowIndex++) {
			int min = 0;
			int visitedCol = 0;
			boolean minSet = false;
			for (int colIndex = 0; colIndex < crews.size(); colIndex++) {
				if (assignedWorker.contains(colIndex))
					continue;
				if (!minSet) {
					min = costs[rowIndex][colIndex];
					minSet = true;
				}

				if (min > costs[rowIndex][colIndex]) {
					min = costs[rowIndex][colIndex];
					visitedCol = colIndex;
				}
			}
			assignedWorker.add(visitedCol);
			result = result + min;
		}
		return result;
	}
}