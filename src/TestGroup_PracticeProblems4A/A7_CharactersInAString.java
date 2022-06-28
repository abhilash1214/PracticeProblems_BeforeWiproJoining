package TestGroup_PracticeProblems4A;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//Calculate the Number of Characters in a String
public class A7_CharactersInAString {
	static String x = "aradhya brilliance center";

	public static void main(String[] args) {
		usingArray(x);
		usingMaps(x);
		usingSet(x);

	}

	// Using Array Concept
	public static void usingArray(String val) {
		int count = 0;

		for (int i = 0; i < val.length(); i++) {
			boolean b = true;
			for (int j = i + 1; j < val.length(); j++) {
				if (val.charAt(i) == val.charAt(j)) {
					b = false;
					break;
				}
			}
			if (b == true) {
				System.out.println("UNIQUE: " + val.charAt(i));
				count++;
			}
		}
		System.out.println("Unique characters: " + count);
	}

	// Using Map Concept
	public static void usingMaps(String val) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] valArray = val.toCharArray();
		for (int i = 0; i < val.length(); i++) {
			if (map.containsKey(valArray[i]) == false) {
				map.put(valArray[i], 1);
			} else {
				map.put(valArray[i], map.get(valArray[i]) + 1);
			}
		}
		System.out.println(map);
		System.out.println("Size: " + map.size());
		Set<Entry<Character, Integer>> hmap = map.entrySet();
		for (Entry<Character, Integer> hmap2 : hmap) {
			System.out.println(hmap2.getKey() + ": " + hmap2.getValue());
		}
	}

	// Using Set
	public static void usingSet(String val) {
		HashSet<Character> s = new HashSet<Character>();
		for (int i = 0; i < val.length(); i++) {
			s.add(val.charAt(i));
		}
		System.out.println(s);
		System.out.println("SIZE: " + s.size());

		Iterator<Character> it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
