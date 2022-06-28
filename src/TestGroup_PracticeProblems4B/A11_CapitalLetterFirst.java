package TestGroup_PracticeProblems4B;

public class A11_CapitalLetterFirst {

	public static void main(String[] args) {
		String x = "this is javapoint";
		char[] a = x.toCharArray();
		a[0] = Character.toUpperCase(a[0]);

		for (int i = 1; i < a.length; i++) {
			if (a[i] == ' ') {
				a[i + 1] = Character.toUpperCase(a[i + 1]);
			}
		}
		System.out.println(a);
		usingSubString("this is javapoint");
	}

	//Using Substring concept
	public static void usingSubString(String val) {
		String valSplit[] = val.split(" ");

		for (int i = 0; i < valSplit.length; i++) {
			String eachWord = valSplit[i];
			eachWord = eachWord.substring(0, 1).toUpperCase() + eachWord.substring(1);
			System.out.print(eachWord + " ");

		}
	}
}
