package TestGroup_PracticeProblems4D;

public class A34_StringContainsIntegerOrNot {

	public static void main(String[] args) {
		String x = "1w@23de456";

		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) >= '0' && x.charAt(i) <= '9') {
				System.out.println(x.charAt(i));
			}
		}
	}

}
