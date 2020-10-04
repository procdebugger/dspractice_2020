package com.sandesh.az;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.sandesh.az.MergeTwoSortedList.LinkedListNode;

//https://www.educative.io/blog/crack-amazon-coding-interview-questions
public class main {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 7, 8 };
		int sumOfNumbers = 8;
		MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();

		LinkedListNode listA_19 = mergeTwoSortedList.new LinkedListNode(19, null);
		LinkedListNode listA_15 = mergeTwoSortedList.new LinkedListNode(15, listA_19);
		LinkedListNode listA_8 = mergeTwoSortedList.new LinkedListNode(8, listA_15);
		LinkedListNode listA_4 = mergeTwoSortedList.new LinkedListNode(4, listA_8);

		LinkedListNode listA_16 = mergeTwoSortedList.new LinkedListNode(16, null);
		LinkedListNode listA_10 = mergeTwoSortedList.new LinkedListNode(10, listA_16);
		LinkedListNode listA_9 = mergeTwoSortedList.new LinkedListNode(9, listA_10);
		LinkedListNode listA_7 = mergeTwoSortedList.new LinkedListNode(7, listA_9);

		MissingNumber missingNumber = new MissingNumber();
		SumOfTargetValue sumOfTargetValue = new SumOfTargetValue();
		Fact fact = new Fact();

		System.out.println(missingNumber.findMissingNumber(numbers, sumOfNumbers));
		System.out.println(sumOfTargetValue.twoNumbersExists(16, numbers));

		LinkedListNode aux = mergeTwoSortedList.mergeTwoSortedList(listA_4, listA_7);

		while (aux != null) {
			System.out.println(aux.data);
			aux = aux.next;
		}

		B b = new B();

		if (b instanceof B) {
			System.out.println("true");
		}

		if ((b instanceof B) && (!(b instanceof A))) {
			System.out.println("true");
		}

		if ((b instanceof B) && (!(b instanceof C))) {
			System.out.println("true");
		}

		System.out.println(fact.fact(5));

		CombinationCalculator calculator = new CombinationCalculator();

		// 5c5
		System.out.println(calculator.calculateCombination(5, 2));

		FormATeam formateam = new FormATeam();

		formateam.numberOfTeams(3, 4, Arrays.asList(1, 2, 3, 4));

		RoadRepair roadRepair = new RoadRepair();

		List<Integer> crews = Arrays.asList(5, 3, 1, 4, 6);
		List<Integer> jobs = Arrays.asList(9, 8, 3, 15, 1);
		
		System.out.println(roadRepair.roadRepair(crews, jobs));
	}
}
