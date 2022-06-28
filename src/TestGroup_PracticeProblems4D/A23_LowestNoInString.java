package TestGroup_PracticeProblems4D;

import java.util.ArrayList;
import java.util.Collections;

public class A23_LowestNoInString {

	public static void main(String[] args) {
		String name = "123Hello345How678Are234You567";
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
				list.add(Character.getNumericValue(name.charAt(i)));
			}
		}
		System.out.println(list);
		System.out.println("Max: " + Collections.max(list));
		System.out.println("Min: " + Collections.min(list));
	}

}
