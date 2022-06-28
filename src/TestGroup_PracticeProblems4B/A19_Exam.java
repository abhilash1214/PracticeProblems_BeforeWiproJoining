package TestGroup_PracticeProblems4B;

public class A19_Exam {
//ABCD=A@B#C$%D&*
	public static void main(String[] args) {
		compareWordsExcludingSymbols("A@B#C$%D&*", "ABCD");
	}

	public static void compareWordsExcludingSymbols(String withSymbols, String withoutSymbols) {
		withSymbols = withSymbols.toUpperCase();
		withoutSymbols=withoutSymbols.toUpperCase();
		String withSymbolsPurified = "";

		for (int i = 0; i < withSymbols.length(); i++) {
			if (withSymbols.charAt(i) >= 'A' && withSymbols.charAt(i) <= 'Z') {
				withSymbolsPurified = withSymbolsPurified + String.valueOf(withSymbols.charAt(i));
			}
		}
		if(withSymbolsPurified.equals(withoutSymbols)) {
			System.out.println("Values are Same");
		}
	}

}
