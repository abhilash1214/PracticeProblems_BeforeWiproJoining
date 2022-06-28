package TestGroup_PracticeProblems4B;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class A15_FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String x = "azbccccefgahhhii";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < x.length(); i++) {
			if (map.containsKey(x.charAt(i)) == false) {
				map.put(x.charAt(i), 1);
			} else {
				map.put(x.charAt(i), map.get(x.charAt(i)) + 1);
			}
		}
		System.out.println(map);

		usingSet(x);
	}

	static void usingSet(String x) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < x.length(); i++) {
			if (set.contains(x.charAt(i)) == false) {
				set.add(x.charAt(i));
			} else {
				System.out.println(x.charAt(i));
				break;
			}
		}
	}
}
