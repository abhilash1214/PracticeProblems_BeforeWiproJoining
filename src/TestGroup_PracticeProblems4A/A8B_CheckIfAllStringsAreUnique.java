package TestGroup_PracticeProblems4A;

import java.util.ArrayList;

public class A8B_CheckIfAllStringsAreUnique {

	// Using Array
	public static void main(String[] args) {
		String x = "aradhya brilliance center";
		x = x.replace(" ", "");

		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < x.length(); i++) {
			list.add(x.charAt(i));
		}
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					System.out.println("DUPLICATE: " + list.get(i));
					break;
				}
			}
		}
	}

}
