package TestGroup_PracticeProblems4A;

public class A6_ContainsInteger {

	public static void main(String[] args) {
		String x = "aradhya b6rilliance center5";

		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) >= '0' && x.charAt(i) <= '9') {
				//System.out.println("Contains Integer Value: " + x.charAt(i));
			}else {
				System.out.print(x.charAt(i));
			}
		}
	}

}
