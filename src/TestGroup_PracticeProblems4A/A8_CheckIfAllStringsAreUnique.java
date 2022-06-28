package TestGroup_PracticeProblems4A;

import java.util.HashSet;

public class A8_CheckIfAllStringsAreUnique {

	// Using Set
	public static void main(String[] args) {
		String x = "aradhya brilliance center";
		HashSet<Character> hset = new HashSet<Character>();
		for (int i = 0; i < x.length(); i++) {
			if (hset.contains(x.charAt(i)) == false) {
				hset.add(x.charAt(i));
			} else {
				System.out.println("Contains Duplicate: " + x.charAt(i));
				break;
			}
		}
		A8_CheckIfAllStringsAreUnique aa = new A8_CheckIfAllStringsAreUnique("This is Javapoint");
	}

	// for A9_ReverseEachWord validation
	A8_CheckIfAllStringsAreUnique(String val) {
		String[] valSplit = val.split(" ");

		for (int i = 0; i < valSplit.length; i++) {
			char[] valSplitEachToChar = valSplit[i].toCharArray();
			char[] valSplitEachRev = new char[valSplitEachToChar.length];

			for (int j = 0; j < valSplitEachToChar.length; j++) {
				valSplitEachRev[valSplitEachToChar.length - j - 1] = valSplitEachToChar[j];
			}
			System.out.print(valSplitEachRev);
			System.out.print(" ");
		}
	}

}
