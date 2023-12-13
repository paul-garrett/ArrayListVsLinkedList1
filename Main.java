/*
	An ArrayList is faster than a LinkedList for every operation except for inserting or removing from either end of the list.

	In this example the program is adding to the front of the list, so LinkedList executes faster.

	NOTE: The program takes several seconds to execute, so you will have to wait for the results.
*/

import java.util.*;

class Main {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();

		test(list1, "Time for ArrayList is ");
		test(list2, "Time for LinkedList is ");
	}

	public static void test(List<Integer> list, String title) {
		
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 400000; i++) {
			// add to the front of the list
			list.add(0, i);
		}

		long time = System.currentTimeMillis() - startTime;
		System.out.println(title + time + " milliseconds");
	}
}
