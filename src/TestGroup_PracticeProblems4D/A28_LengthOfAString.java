package TestGroup_PracticeProblems4D;

public class A28_LengthOfAString {

	public static void main(String[] args) {
		String x = "ABC Tech";
		int count = 0;
		x = x.concat("\0");

		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == '0') {

			} else {
				count++;
			}
		}
		System.out.println("Length of String: " + count);
	}

}
