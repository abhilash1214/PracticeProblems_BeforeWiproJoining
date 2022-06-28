package TestGroup_PracticeProblems4D;

import java.util.LinkedHashSet;

public class A38_Exam {

	public static void main(String[] args) {
		String x = "Hellol"; // Helo

		// Solution1
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < x.length(); i++) {
			set.add(x.charAt(i));
		}
		System.out.println(set);

		// Solution2
		String y = "Hello";
		y = y.concat("\0");
		try {
			for (int i = 0; i < x.length(); i++) {
				if (y.charAt(i) != y.charAt(i + 1)) {
					System.out.print(y.charAt(i) + ", ");
				}
			}
		} catch (StringIndexOutOfBoundsException e) {

		}

	}

}
