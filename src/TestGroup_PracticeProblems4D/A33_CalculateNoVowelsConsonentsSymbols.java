package TestGroup_PracticeProblems4D;

import java.util.HashSet;

public class A33_CalculateNoVowelsConsonentsSymbols {

	public static void main(String[] args) {
		String x = "arad)Ya brIllianc*e centre";
		HashSet<Character> vowels = new HashSet<Character>();
		HashSet<Character> consonents = new HashSet<Character>();
		HashSet<Character> symbols = new HashSet<Character>();

		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) >= 'a' && x.charAt(i) <= 'z') {
				if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o'
						|| x.charAt(i) == 'u') {
					vowels.add(x.charAt(i));
				} else {
					consonents.add(x.charAt(i));
				}
			} else {
				symbols.add(x.charAt(i));
			}

		}
		System.out.println("Vowels are: " + vowels + "Vowels Count: " + vowels.size());
		System.out.println("Consonents are: " + consonents + "Consonents Count: " + consonents.size());
		System.out.println("Symbols are: " + symbols + "Symbols Count: " + symbols.size());
	}

}
