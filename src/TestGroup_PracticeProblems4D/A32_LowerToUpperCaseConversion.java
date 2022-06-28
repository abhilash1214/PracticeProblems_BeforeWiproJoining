package TestGroup_PracticeProblems4D;

public class A32_LowerToUpperCaseConversion {

	public static void main(String[] args) {
		String x = "aradhya";
		for (int i = 0; i < x.length(); i++) {
			System.out.print((char) (x.charAt(i) - 32));
		}
	}
}
