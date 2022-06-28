package TestGroup_PracticeProblems4B;

import java.util.ArrayList;
import java.util.Collections;

public class A17_Exam {

	// Max is 71
	// Min is 17
	// 6,8,8,6
	public static void main(String[] args) {
		usingArrayCollection();
	}

	// Using Arrays and Collection Concept
	static void usingArrayCollection() {
		int[] a = { 51, 71, 17, 42 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		System.out.println("Max: " + Collections.max(list));
		System.out.println("Min: " + Collections.min(list));

		System.out.println("***********************************************************");
		for (int i = 0; i < list.size(); i++) {
			String eachVal = String.valueOf(list.get(i));
			int sum = 0;
			for (int j = 0; j < eachVal.length(); j++) {
				sum = sum + Character.getNumericValue(eachVal.charAt(j));
			}
			System.out.println(sum);
		}

	}

}
