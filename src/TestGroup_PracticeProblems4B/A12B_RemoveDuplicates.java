package TestGroup_PracticeProblems4B;

import java.util.HashMap;

public class A12B_RemoveDuplicates {

	public static void main(String[] args) {
		String x = "My FirstName is Abilash. My LastName is Puppala";
		A12B_RemoveDuplicates a = new A12B_RemoveDuplicates(x);

	}

	// Using Maps for words
	private A12B_RemoveDuplicates(String val) {
		HashMap<String, Integer> map = new HashMap();
		String[] valSplit = val.split(" ");
		for (int i = 0; i < valSplit.length; i++) {
			if (map.containsKey(valSplit[i]) == false) {
				map.put(valSplit[i], 1);
			} else {
				map.put(valSplit[i], map.get(valSplit[i]) + 1);
			}
		}
		System.out.println(map);
	}

}
