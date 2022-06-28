package TestGroup_PracticeProblems4D;

import java.util.TreeSet;

public class A35_Pangram {

	public static void main(String[] args) {
		String x = "A quick brown fox jumps over the lazy dog (8*";
		x = x.toUpperCase();
		TreeSet<Character> s = new TreeSet<Character>();

		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) >= 'A' && x.charAt(i) <= 'Z') {
				s.add(x.charAt(i));
			}

		}
		System.out.println(s);
		if (s.size() == 26) {
			System.out.println("Pangram");
		}
	}

}
