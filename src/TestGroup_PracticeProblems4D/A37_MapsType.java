package TestGroup_PracticeProblems4D;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class A37_MapsType {
//Count Characters in a String
	public static void main(String[] args) {
		String x = "ARADHYA";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	//	LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	//	TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		
		for (int i = 0; i < x.length(); i++) {
			if (map.containsKey(x.charAt(i)) == false) {
				map.put(x.charAt(i), 1);
			} else {
				map.put(x.charAt(i), map.get(x.charAt(i)) + 1);
			}
		}

		Set<Entry<Character, Integer>> hmap = map.entrySet();
		for (Entry<Character, Integer> hmap2 : hmap) {
			System.out.println(hmap2.getKey() + ": " + hmap2.getValue());
		}

	}
}
