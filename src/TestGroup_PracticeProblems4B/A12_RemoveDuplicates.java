package TestGroup_PracticeProblems4B;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class A12_RemoveDuplicates {

	public static void main(String[] args) {
		String x = "aeabcaceecbbsdd";
		System.out.println(x.length());
		usingSet(x);
		A12_RemoveDuplicates a = new A12_RemoveDuplicates(x);

	}

	// Using Collection
	public static void usingSet(String val) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		int count = 0;
		for (int i = 0; i < val.length(); i++) {
			if (set.contains(val.charAt(i)) == false) {
				set.add(val.charAt(i));
			} else {
				count++;
			}

		}
		System.out.println(set + " Size: " + set.size());
		System.out.println("Duplicates count: " + count);
	}

	// Using Maps for characters
	private A12_RemoveDuplicates(String val) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < val.length(); i++) {
			if (map.containsKey(val.charAt(i)) == false) {
				map.put(val.charAt(i), 1);
			} else {
				map.put(val.charAt(i), map.get(val.charAt(i)) + 1);
			}
		}
		System.out.println(map);
	}

}
